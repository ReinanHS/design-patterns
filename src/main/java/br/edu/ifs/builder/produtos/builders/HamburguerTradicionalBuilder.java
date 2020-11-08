package br.edu.ifs.builder.produtos.builders;

import br.edu.ifs.builder.produtos.items.Hamburguer;

public class HamburguerTradicionalBuilder {
    protected Hamburguer hamburguer;

    public HamburguerTradicionalBuilder(){
        this.hamburguer = new Hamburguer();
        this.builderProduto();
        this.builderHamburger();
    }

    public void builderProduto(){
        this.hamburguer.setName("Hamburguer tradicional");
        this.hamburguer.setValor(5.80);
    }

    public void builderHamburger(){
        this.hamburguer.setCarne("Bovino");
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }
}
