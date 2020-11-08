package br.edu.ifs.builder.produtos.builders;

import br.edu.ifs.builder.produtos.items.Batata;

public class BatataMediaBuilder {
    protected Batata batata;

    public BatataMediaBuilder() {
        this.batata = new Batata();
        this.builderProduto();
    }

    public void builderProduto(){
        this.batata.setName("Batata Media");
        this.batata.setValor(2.59);
        this.batata.setTamanho("Media");
    }

    public Batata getBatata() {
        return batata;
    }
}
