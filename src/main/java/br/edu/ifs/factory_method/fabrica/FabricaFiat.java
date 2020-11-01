package br.edu.ifs.factory_method.fabrica;

import br.edu.ifs.factory_method.carros.Carro;
import br.edu.ifs.factory_method.carros.Palio;

public class FabricaFiat implements FabricaDeCarro {
    /** Função para criar um Palio
     * @return Palio - Carro feito pela Fiat
     */
    public Carro CriarCarro() {
        return new Palio();
    }
}
