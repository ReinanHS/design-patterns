package br.edu.ifs.builder.produtos.builders;

import br.edu.ifs.builder.produtos.items.CheeseBurger;

public class CheeseBurgerGourmetBuilder {
    protected CheeseBurger cheeseBurger;

    public CheeseBurgerGourmetBuilder() {
        this.cheeseBurger = new CheeseBurger();
        this.builderProduto();
    }

    public void builderProduto(){
        this.cheeseBurger.setName("Cheesegurger Gourmet");
        this.cheeseBurger.setValor(5.99);
        this.cheeseBurger.setCobertura("Queijo");
    }

    public CheeseBurger getCheeseBurger() {
        return cheeseBurger;
    }
}
