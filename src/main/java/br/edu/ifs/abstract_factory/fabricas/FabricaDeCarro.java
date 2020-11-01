package br.edu.ifs.abstract_factory.fabricas;

import br.edu.ifs.abstract_factory.carros.CarroPopular;
import br.edu.ifs.abstract_factory.carros.CarroSedan;

public interface FabricaDeCarro {
    CarroSedan criarCarroSedan();
    CarroPopular criarCarroPopular();
}
