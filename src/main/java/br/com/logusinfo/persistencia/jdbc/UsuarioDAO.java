package br.com.logusinfo.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.logusinfo.entidade.Usuario;

public class UsuarioDAO {

	// Metodo cadastrar
	public void cadastrar(Usuario usu) {
		// TODO Auto-generated method stub
		Connection con = ConexaoFactory.getConnection();
		String sql = "insert into usuario (nome, login, senha) values (?,?,?)";

		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());

			// Executando o comando SQL no banco de dados
			preparador.execute();
			preparador.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Metodo alterar
	public void alterar(Usuario usu) {
		// TODO Auto-generated method stub
		Connection con = ConexaoFactory.getConnection();
		String sql = "update usuario set nome=?, login=?, senha=? where id=?";

		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			preparador.setInt(4, usu.getId());

			// Executando o comando SQL no banco de dados
			preparador.execute();
			preparador.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Metodo excluir

	public void excluir(Usuario usu) {
		// TODO Auto-generated method stub
		Connection con = ConexaoFactory.getConnection();
		String sql = "delete from  usuario  where id=?";

		try {
			PreparedStatement preparador = con.prepareStatement(sql);

			preparador.setInt(1, usu.getId());

			// Executando o comando SQL no banco de dados
			preparador.execute();
			preparador.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
