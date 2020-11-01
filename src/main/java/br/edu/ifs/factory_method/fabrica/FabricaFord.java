package br.edu.ifs.factory_method.fabrica;

import br.edu.ifs.factory_method.carros.Carro;
import br.edu.ifs.factory_method.carros.Fiesta;

public class FabricaFord implements FabricaDeCarro {
    /** Função para criar um Fiesta
     * @return Fiesta - Carro feito pela Ford
     */
    public Carro CriarCarro() {
        return new Fiesta();
    }
}
