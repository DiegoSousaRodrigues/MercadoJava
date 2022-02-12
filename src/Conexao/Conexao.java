package Conexao;

import java.sql.*;

public class Conexao {

    public static String status = "Não conectou...";

    public Conexao() {

    }

    public static java.sql.Connection getConexaoMySQL() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/mercado", "root", "");
            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
    }

    public static String statusConection() {

        return status;

    }
}