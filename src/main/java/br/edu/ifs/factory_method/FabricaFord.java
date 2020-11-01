package br.edu.ifs.factory_method;

public class FabricaFord implements FabricaDeCarro {
    /** Função para criar um Fiesta
     * @return Fiesta - Carro feito pela Ford
     */
    public Carro CriarCarro() {
        return new Fiesta();
    }
}
