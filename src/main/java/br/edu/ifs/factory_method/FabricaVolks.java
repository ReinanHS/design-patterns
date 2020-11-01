package br.edu.ifs.factory_method;

public class FabricaVolks implements FabricaDeCarro {
    /** Função para criar um Gol
     * @return Gol - Carro feito pela Volks
     */
    public Carro CriarCarro() {
        return new Gol();
    }
}
