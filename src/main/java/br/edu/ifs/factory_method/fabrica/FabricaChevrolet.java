package br.edu.ifs.factory_method.fabrica;

import br.edu.ifs.factory_method.carros.Carro;
import br.edu.ifs.factory_method.carros.Celta;

public class FabricaChevrolet implements FabricaDeCarro {
    /** Função para criar um Celta
     * @return Celta - Carro feito pela Chevrolet
     */
    public Carro CriarCarro() {
        return new Celta();
    }
}
