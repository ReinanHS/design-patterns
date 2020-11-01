package br.edu.ifs.abstract_factory.carros;

public class FiestaSedan implements CarroSedan{
    /** Função para mostrar informações sobre o Fiesta */
    public void exibirInfoSedan() {
        System.out.println("Modelo: Fiesta\nFábrica: Ford\nCategoria: Sedan");
    }
}
