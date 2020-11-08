package br.edu.ifs.builder;

import br.edu.ifs.builder.produtos.items.Batata;
import br.edu.ifs.builder.produtos.items.Brinquedo;
import br.edu.ifs.builder.produtos.items.Refrigerante;
import br.edu.ifs.builder.produtos.items.Sanduiche;

public class PedidoBuilder {
    private Pedido pedido;

    public PedidoBuilder() {
        this.pedido = new Pedido();
    }

    /**
     * Função responsável por criar um sanduíche
     */
    public void builderSanduiche(Sanduiche sanduiche){
        this.pedido.adicionarDentroDaCaixa(sanduiche.getName());
    }

    /**
     * Função responsável por criar uma batata
     */
    public void builderBatata(Batata batata){
        this.pedido.adicionarDentroDaCaixa(batata.getName());
    }

    /**
     * Função responsável por criar um brinquedo
     */
    public void builderBrinquedo(Brinquedo brinquedo){
        this.pedido.adicionarDentroDaCaixa(brinquedo.getName());
    }

    /**
     * Função responsável por criar um refrigerante
     */
    public void builderRefrigerante(Refrigerante refrigerante){
        this.pedido.adicionarForaDaCaixa(refrigerante.getName());
    }

    public Pedido getPedido() {
        return pedido;
    }
}
