package br.edu.ifs.builder.produtos.items;

public class Batata extends Produto {
    protected String tamanho;

    public Batata() { }

    public Batata(String name, Double valor, String tamanho) {
        super(name, valor);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Batata {" +
                "Tamanho='" + tamanho + '\'' +
                ", Nome='" + name + '\'' +
                ", Valor=" + valor +
                '}';
    }
}
