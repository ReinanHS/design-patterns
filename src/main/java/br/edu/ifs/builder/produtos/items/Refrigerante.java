package br.edu.ifs.builder.produtos.items;

public class Refrigerante extends Produto {
    protected byte qtdLitros;

    public Refrigerante() { }

    public Refrigerante(String name, Double valor, byte qtdLitros) {
        super(name, valor);
        this.qtdLitros = qtdLitros;
    }

    public byte getQtdLitros() {
        return qtdLitros;
    }

    public void setQtdLitros(byte qtdLitros) {
        this.qtdLitros = qtdLitros;
    }

    @Override
    public String toString() {
        return "Refrigerante {" +
                "Litros=" + qtdLitros +"L"+
                ", Nome='" + name + '\'' +
                ", Valor=" + valor +
                '}';
    }
}
