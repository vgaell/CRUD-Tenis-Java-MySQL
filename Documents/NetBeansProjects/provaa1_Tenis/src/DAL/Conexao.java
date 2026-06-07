package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar() {
        Connection conn = null;

            try {

                String url = "jdbc:mysql://localhost:3306/provaA1";
                String usuario = "root";
                String senha = "UDF2026";

                Class.forName("com.mysql.cj.jdbc.Driver");

                conn = DriverManager.getConnection(url, usuario, senha);

                System.out.println("Conexão realizada com sucesso!");

            } catch (Exception erro) {

                System.out.println("Erro na conexão: " + erro.getMessage());

            }

        return conn;
    }
}