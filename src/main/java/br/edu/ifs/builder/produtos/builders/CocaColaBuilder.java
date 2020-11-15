package br.edu.ifs.builder.produtos.builders;

import br.edu.ifs.builder.produtos.items.Refrigerante;

public class CocaColaBuilder {
    protected Refrigerante refrigerante;

    public CocaColaBuilder() {
        this.refrigerante = new Refrigerante();
        this.builderProduto();
    }

    public void builderProduto(){
        this.refrigerante.setName("Coca Cola");
        this.refrigerante.setValor(2.25);
        this.refrigerante.setQtdLitros((byte) 1);
    }

    public Refrigerante getRefrigerante() {
        return refrigerante;
    }
}
