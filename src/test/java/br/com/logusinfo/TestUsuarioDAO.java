package br.com.logusinfo;

import br.com.logusinfo.entidade.Usuario;
import br.com.logusinfo.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		// chamada
		System.out.println("Nenhuma interação com o banco foi realizada");

		// testeExcluir();
		// testeAlterar();
		// testeCadastrar();
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
