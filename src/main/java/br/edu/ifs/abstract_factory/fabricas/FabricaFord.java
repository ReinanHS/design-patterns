package br.edu.ifs.abstract_factory.fabricas;

import br.edu.ifs.abstract_factory.carros.CarroPopular;
import br.edu.ifs.abstract_factory.carros.CarroSedan;
import br.edu.ifs.abstract_factory.carros.Fiesta;
import br.edu.ifs.abstract_factory.carros.FiestaSedan;

public class FabricaFord implements FabricaDeCarro {
    /**
     * Função para criar um carro sedan
     * @return FiestaSedan - Carro sedan da Ford
     */
    public CarroSedan criarCarroSedan() {
        return new FiestaSedan();
    }

    /**
     * Função para criar um carro popular
     * @return Fiesta - Carro popular da Ford
     */
    public CarroPopular criarCarroPopular() {
        return new Fiesta();
    }
}
