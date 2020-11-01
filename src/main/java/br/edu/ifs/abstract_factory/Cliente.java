package br.edu.ifs.abstract_factory;

import br.edu.ifs.abstract_factory.carros.CarroPopular;
import br.edu.ifs.abstract_factory.carros.CarroSedan;
import br.edu.ifs.abstract_factory.fabricas.FabricaFiat;
import br.edu.ifs.abstract_factory.fabricas.FabricaDeCarro;
import br.edu.ifs.abstract_factory.fabricas.FabricaFord;

public class Cliente {
    public static void main(String[] args) {
        FabricaDeCarro fabricaDeCarro = new FabricaFiat();
        CarroPopular carroPopular = fabricaDeCarro.criarCarroPopular();
        CarroSedan carroSedan = fabricaDeCarro.criarCarroSedan();

        carroPopular.exibirInfoPopular();
        carroSedan.exibirInfoSedan();

        fabricaDeCarro = new FabricaFord();
        carroPopular = fabricaDeCarro.criarCarroPopular();
        carroSedan= fabricaDeCarro.criarCarroSedan();

        carroPopular.exibirInfoPopular();
        carroSedan.exibirInfoSedan();
    }
}
