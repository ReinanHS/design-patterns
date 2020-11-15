package br.edu.ifs.builder.produtos.items;

public abstract class Produto {
    protected String name;
    protected Double valor;

    public Produto() { }

    public Produto(String name, Double valor) {
        this.name = name;
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", valor=" + valor +
                '}';
    }
}
