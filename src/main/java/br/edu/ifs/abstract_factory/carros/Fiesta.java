package br.edu.ifs.abstract_factory.carros;

public class Fiesta implements CarroPopular{
    /** Função para mostrar informações sobre o Fiesta */
    public void exibirInfoPopular() {
        System.out.println("Modelo: Fiesta\nFábrica: Ford\nCategoria: Popular");
    }
}
