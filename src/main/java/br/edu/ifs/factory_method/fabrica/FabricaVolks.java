package br.edu.ifs.factory_method.fabrica;

import br.edu.ifs.factory_method.carros.Carro;
import br.edu.ifs.factory_method.carros.Gol;

public class FabricaVolks implements FabricaDeCarro {
    /** Função para criar um Gol
     * @return Gol - Carro feito pela Volks
     */
    public Carro CriarCarro() {
        return new Gol();
    }

    @Override
    public String toString() {
        return "Fábrica da Volks";
    }
}
