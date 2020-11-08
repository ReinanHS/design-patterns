package br.edu.ifs.builder;

import br.edu.ifs.builder.funcionarios.Atendente;
import br.edu.ifs.builder.funcionarios.Chapeiro;

public class Main {
    public static void main(String[] args) {
        Atendente reinan = new Atendente("Reinan Gabriel", 850.00);
        Chapeiro lucas = new Chapeiro("Lucas Santos", 960.00);

        Restaurante restaurante = new Restaurante(reinan, lucas);
        restaurante.mostrarMenu();
        restaurante.realizarAtendimento();
    }
}
