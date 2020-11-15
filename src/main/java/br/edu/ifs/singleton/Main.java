package br.edu.ifs.singleton;

import br.edu.ifs.singleton.database.DB;
import br.edu.ifs.singleton.models.Candidato;

public class Main {
    public static void main(String[] args) {
        /* Configurações iniciais do banco de dados */
        DB.runMigrations();
        DB.runSeeds();

        /* Listagem dos candidatos salvos no banco de dados */
        for (Candidato candidato : Candidato.all()) {
            System.out.println(candidato);
        }
    }
}
