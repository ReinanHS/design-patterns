package br.edu.ifs.factory_method.carros;

import br.edu.ifs.factory_method.carros.Carro;

public class Palio implements Carro {
    public void exibirInfo() {
        System.out.println("Modelo: Palio\nFabricante: Fiat");
    }
}
