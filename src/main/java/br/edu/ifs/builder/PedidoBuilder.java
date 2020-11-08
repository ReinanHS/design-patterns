package br.edu.ifs.builder;

public abstract class PedidoBuilder {
    private Pedido pedido;

    public PedidoBuilder() {
        this.pedido = new Pedido();
        this.builderSanduiche();
        this.builderBatata();
        this.builderBrinquedo();
        this.builderRefrigerante();
    }

    /**
     * Função responsável por criar um sanduíche
     */
    public abstract void builderSanduiche();

    /**
     * Função responsável por criar uma batata
     */
    public abstract void builderBatata();

    /**
     * Função responsável por criar um brinquedo
     */
    public abstract void builderBrinquedo();

    /**
     * Função responsável por criar um refrigerante
     */
    public abstract void builderRefrigerante();

    public Pedido getPedido() {
        return pedido;
    }
}
