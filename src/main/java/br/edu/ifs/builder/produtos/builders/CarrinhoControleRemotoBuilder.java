package br.edu.ifs.builder.produtos.builders;

import br.edu.ifs.builder.produtos.items.Carrinho;

public class CarrinhoControleRemotoBuilder {
    protected Carrinho carrinho;

    public CarrinhoControleRemotoBuilder() {
        this.carrinho = new Carrinho();
        this.builderProduto();
        this.builderCarro();
    }

    public void builderProduto(){
        this.carrinho.setName("Batata Pequena");
        this.carrinho.setValor(2.25);
        this.carrinho.setIdadePublicoAlvo((byte) 10);
    }

    public void builderCarro(){
        this.carrinho.setModelo("Racing Car");
        this.carrinho.setQtdPenel((byte) 5);
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
}
