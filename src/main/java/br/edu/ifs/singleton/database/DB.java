package br.edu.ifs.singleton.database;

import br.edu.ifs.singleton.Singleton;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB {
    private static DB dataBase = null;
    private PreparedStatement preparedStatement;
    private String sql;

    private DB() {}

    public static DB getDataBase(){
        if(dataBase == null){
            dataBase = new DB();
        }

        return dataBase;
    }

    public static void runMigrations(){
        getDataBase().createCandidados();
    }

    public static void runSeeds(){
        getDataBase().seedCantidados();
    }

    private void createCandidados(){
        try {
            sql = "DROP TABLE `candidados`";
            preparedStatement = Singleton.getInstance().prepareStatement(sql);
            preparedStatement.execute();

            System.out.println(sql);
        } catch (SQLException exception) {
            if(exception.getErrorCode() == 1051){
                System.out.println("TABLE `candidados` já existe");
            }else exception.printStackTrace();
        }

        try {
            sql = "CREATE TABLE `meubanco`.`candidados` ( `id` INT(11) NOT NULL AUTO_INCREMENT , `nome` VARCHAR(50) NOT NULL , `numero` VARCHAR(2) NOT NULL , PRIMARY KEY (`id`)) ENGINE = MyISAM;";
            preparedStatement = Singleton.getInstance().prepareStatement(sql);
            preparedStatement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    private void seedCantidados(){
        sql = "INSERT INTO `candidados` (`id`, `nome`, `numero`) VALUES (NULL, 'EDVALDO', '12'), (NULL, 'JURACI NUNES', '35'), (NULL, 'RODRIGO VALADARES', '14'), (NULL, 'DELEGADO PAULO MARCIO', '27')";
        try {
            preparedStatement = Singleton.getInstance().prepareStatement(sql);
            preparedStatement.execute();

            System.out.println("SEED candidados");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
