package br.edu.ifs.abstract_factory.fabricas;

import br.edu.ifs.abstract_factory.carros.CarroPopular;
import br.edu.ifs.abstract_factory.carros.CarroSedan;
import br.edu.ifs.abstract_factory.carros.Palio;
import br.edu.ifs.abstract_factory.carros.Siena;

public class FabricaFiat implements FabricaDeCarro {
    /**
     * Função para criar um carro sedan
     * @return Siena - Carro sedan da Fiat
     */
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }

    /**
     * Função para criar um carro popular
     * @return Palio - Carro popular da Fiat
     */
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }
}
