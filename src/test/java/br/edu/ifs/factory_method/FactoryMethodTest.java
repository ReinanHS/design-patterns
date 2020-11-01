package br.edu.ifs.factory_method;

import br.edu.ifs.factory_method.carros.*;
import br.edu.ifs.factory_method.fabrica.*;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FactoryMethodTest {

    @Test
    public void fabricaFiatTest(){
        assertThat(new FabricaFiat().CriarCarro()).isInstanceOf(Palio.class);
    }

    @Test
    public void fabricaVolksTest(){
        assertThat(new FabricaVolks().CriarCarro()).isInstanceOf(Gol.class);
    }

    @Test
    public void fabricaChevroletTest(){
        assertThat(new FabricaChevrolet().CriarCarro()).isInstanceOf(Celta.class);
    }

    @Test
    public void fabricaFordTest(){
        assertThat(new FabricaFord().CriarCarro()).isInstanceOf(Fiesta.class);
    }
}
