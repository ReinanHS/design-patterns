package br.edu.ifs.factory_method;

public class FabricaChevrolet implements FabricaDeCarro {
    /** Função para criar um Celta
     * @return Celta - Carro feito pela Chevrolet
     */
    public Carro CriarCarro() {
        return new Celta();
    }
}
