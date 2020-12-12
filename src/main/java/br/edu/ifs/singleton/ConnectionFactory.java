package br.edu.ifs.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection createConnection() {
        try{
            String url = "jdbc:mysql://localhost/meubanco"; //Nome da base de dados
            String user = "root"; //nome do usuário do MySQL
            String password = ""; //senha do MySQL

            Connection conexao = null;
            conexao = DriverManager.getConnection(url, user, password);

            return conexao;
        }catch (SQLException exception){
            System.out.println("SQLException: "+exception);
            return null;
        }
    }
}
