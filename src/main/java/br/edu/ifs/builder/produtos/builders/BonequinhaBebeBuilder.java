package br.edu.ifs.builder.produtos.builders;

import br.edu.ifs.builder.produtos.items.Bonequinha;

public class BonequinhaBebeBuilder {
    protected Bonequinha bonequinha;

    public BonequinhaBebeBuilder() {
        this.bonequinha = new Bonequinha();
        this.builderProduto();
        this.builderBoneca();
    }

    public void builderProduto(){
        this.bonequinha.setName("Boneca Bebê Real");
        this.bonequinha.setValor(50.99);
        this.bonequinha.setIdadePublicoAlvo((byte) 8);
    }

    public void builderBoneca(){
        this.bonequinha.setCorDaPele("Banco");
        this.bonequinha.setCorDoCabelo("Preto");
        this.bonequinha.setCorDoOlho("Verde");
    }

    public Bonequinha getBonequinha() {
        return bonequinha;
    }
}
