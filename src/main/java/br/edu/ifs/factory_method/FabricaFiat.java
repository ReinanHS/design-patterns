package br.edu.ifs.factory_method;

public class FabricaFiat implements FabricaDeCarro {
    /** Função para criar um Palio
     * @return Palio - Carro feito pela Fiat
     */
    public Carro CriarCarro() {
        return new Palio();
    }
}
