package br.edu.ifs.singleton;

import java.sql.Connection;

public class Singleton {
    private static Connection Instance;
    private Singleton() { }

    public static Connection getInstance(){
        if(Instance == null){
            Instance = ConnectionFactory.createConnection();
        }

        return Instance;
    }
}
