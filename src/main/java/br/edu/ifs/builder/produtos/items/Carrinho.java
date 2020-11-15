package br.edu.ifs.builder.produtos.items;

public class Carrinho extends Brinquedo {
    protected String modelo;
    protected byte qtdPenel;

    public Carrinho() { }

    public Carrinho(String name, Double valor, byte idadePublicoAlvo, String modelo, byte qtdPenel) {
        super(name, valor, idadePublicoAlvo);
        this.modelo = modelo;
        this.qtdPenel = qtdPenel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public byte getQtdPenel() {
        return qtdPenel;
    }

    public void setQtdPenel(byte qtdPenel) {
        this.qtdPenel = qtdPenel;
    }

    @Override
    public String toString() {
        return "Carrinho {" +
                "Modelo='" + modelo + '\'' +
                ", Penel=" + qtdPenel +
                ", Nome='" + name + '\'' +
                ", Valor=" + valor +
                '}';
    }
}
