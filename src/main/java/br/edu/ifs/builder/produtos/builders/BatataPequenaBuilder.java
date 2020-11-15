package br.edu.ifs.builder.produtos.builders;

import br.edu.ifs.builder.produtos.items.Batata;

public class BatataPequenaBuilder {
    protected Batata batata;

    public BatataPequenaBuilder() {
        this.batata = new Batata();
        this.builderProduto();
    }

    public void builderProduto(){
        this.batata.setName("Batata Pequena");
        this.batata.setValor(2.25);
        this.batata.setTamanho("Pesquena");
    }

    public Batata getBatata() {
        return batata;
    }
}
