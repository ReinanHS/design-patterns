package br.edu.ifs.abstract_factory.carros;

public class Palio implements CarroPopular {
    /** Função para mostrar informações sobre o Palio */
    public void exibirInfoPopular() {
        System.out.println("Modelo: Palio\nFábrica: Fiat\nCategoria: Popular");
    }
}
