package br.edu.ifs.builder.produtos.builders;

import br.edu.ifs.builder.produtos.items.Refrigerante;

public class GuaranaBuilder {
    protected Refrigerante refrigerante;

    public GuaranaBuilder() {
        this.refrigerante = new Refrigerante();
        this.builderProduto();
    }

    public void builderProduto(){
        this.refrigerante.setName("Guaraná");
        this.refrigerante.setValor(2.99);
        this.refrigerante.setQtdLitros((byte) 1);
    }

    public Refrigerante getRefrigerante() {
        return refrigerante;
    }
}
