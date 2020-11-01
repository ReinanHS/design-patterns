package br.edu.ifs.abstract_factory;

import br.edu.ifs.abstract_factory.carros.CarroPopular;
import br.edu.ifs.abstract_factory.carros.CarroSedan;
import br.edu.ifs.abstract_factory.fabricas.FabricaFiat;
import br.edu.ifs.abstract_factory.fabricas.FabricaFord;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AbstractFactoryTest {
    @Test
    public void FabricaFiatPopularTest(){
        assertThat(new FabricaFiat().criarCarroPopular()).isInstanceOf(CarroPopular.class);
    }

    @Test
    public void FabricaFiatSedanTest(){
        assertThat(new FabricaFiat().criarCarroSedan()).isInstanceOf(CarroSedan.class);
    }

    @Test
    public void FabricaFordPopularTest(){
        assertThat(new FabricaFord().criarCarroPopular()).isInstanceOf(CarroPopular.class);
    }

    @Test
    public void FabricaFordSedanTest(){
        assertThat(new FabricaFord().criarCarroSedan()).isInstanceOf(CarroSedan.class);
    }
}
