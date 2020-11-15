package br.edu.ifs.builder.produtos.builders;

import br.edu.ifs.builder.produtos.items.Batata;

public class BatataGrandeBuilder {
    protected Batata batata;

    public BatataGrandeBuilder() {
        this.batata = new Batata();
        this.builderProduto();
    }

    public void builderProduto(){
        this.batata.setName("Batata Grander");
        this.batata.setValor(2.99);
        this.batata.setTamanho("Grander");
    }

    public Batata getBatata() {
        return batata;
    }
}
