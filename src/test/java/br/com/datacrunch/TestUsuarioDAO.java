package br.com.datacrunch;


import java.util.List;

import br.com.datacrunch.entidade.Usuario;
import br.com.datacrunch.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		// chamada
		//System.out.println("Nenhuma interação com o banco foi realizada");
		 System.out.println("Buscando conexao...");
		// testeExcluir();
		// testeAlterar();
		// testeCadastrar();
		//testeBuscarPorID();
		//testeBuscarTodos();
		 
		 testeAutenticar();
		 
	}

	private static void testeAutenticar() {
		// TODO Auto-generated method stub
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		
		Usuario usu = new Usuario();
		usu.setLogin("eduardo");
		usu.setSenha("123");
		
		Usuario usuRetorno = usuarioDAO.autenticar(usu);
		
		System.out.println(usuRetorno);
		
	}

	private static void testeBuscarTodos() {
		// TODO Auto-generated method stub
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		List<Usuario> lista = usuarioDAO.buscarTodos();
		for (Usuario u: lista){
			System.out.println(u);
			
		}
	}

	private static void testeBuscarPorID() {
		// TODO Auto-generated method stub
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscarPorID(4);
		
		System.out.println(usuario);
	}

	public static void testeCadastrar() {
		Usuario usu = new Usuario();
		usu.setNome("Fulano");
		usu.setLogin("fulano");
		usu.setSenha("123");

		// cadastrando usuario no banco dados
		UsuarioDAO usuDAO = new UsuarioDAO();

		usuDAO.cadastrar(usu);

		System.out.println("Cadastrado com sucesso!");

	}

	public static void testeAlterar() {
		Usuario usu = new Usuario();

		usu.setNome("Silmara Sodre");
		usu.setLogin("silmara");
		usu.setSenha("sil123");
		usu.setId(4);

		// cadastrando usuario no banco dados
		UsuarioDAO usuDAO = new UsuarioDAO();

		usuDAO.alterar(usu);

		System.out.println("Alterado com sucesso!");

	}

	public static void testeExcluir() {
		Usuario usu = new Usuario();

		usu.setId(1);

		// cadastrando usuario no banco dados
		UsuarioDAO usuDAO = new UsuarioDAO();

		usuDAO.excluir(usu);

		System.out.println("Excluido com sucesso!");
		

	}
	
	
}