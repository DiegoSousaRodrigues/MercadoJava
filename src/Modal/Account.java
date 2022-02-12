package Modal;

import Conexao.Conexao;
import Controller.AccountInterface;

import java.sql.*;
import java.util.*;

public class Account implements AccountInterface {

    private Connection conn;
    private PreparedStatement stmt = null;
    private ResultSet rs;

    @Override
    public boolean criarUsuario(String nome, String documento) {
        conn = Conexao.getConexaoMySQL();
        try {
            String sql = "insert into account (nome, document) values (?,?)";
            assert conn != null;
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, documento);
            stmt.execute();

        } catch (Exception e) {
            System.out.println("Erro" + e);
        }
        return false;
    }

    @Override
    public Map<Integer, ArrayList<String>> listarUsuario() {
        conn = Conexao.getConexaoMySQL();
        try {
            String sql = "select * from account";
            assert conn != null;
            stmt = conn.prepareStatement(sql);

        } catch (Exception e) {
            System.out.println("Erro" + e);
        }

        return null;
    }

    @Override
    public boolean alterarUsuario(Map<Integer, ArrayList<String>> lista) {
        return false;
    }
}
