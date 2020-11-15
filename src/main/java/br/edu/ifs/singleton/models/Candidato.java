package br.edu.ifs.singleton.models;

import br.edu.ifs.singleton.Singleton;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Candidato {
    public int id;
    public String nome;
    public String numero;

    public Candidato(int id, String nome, String numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
    }

    public static ArrayList<Candidato> all(){
        try {
            PreparedStatement preparedStatement = Singleton.getInstance().prepareStatement("SELECT * FROM `candidados`");
            ResultSet rs = preparedStatement.executeQuery();
            ArrayList<Candidato> candidatos = new ArrayList<Candidato>();

            while(rs.next()){
                int id = rs.getInt("id");
                String nome= rs.getString("nome");
                String numero = rs.getString("numero");

                candidatos.add(new Candidato(id, nome, numero));
            }

            return candidatos;

        } catch (SQLException exception) {
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Candidato {" +
                "Nome ='" + nome + '\'' +
                ", Número ='" + numero + '\'' +
                '}';
    }
}
