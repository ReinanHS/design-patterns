package br.edu.ifs.builder.produtos.items;

public class Hamburguer extends Sanduiche {
    protected String carne;

    public Hamburguer() { }

    public Hamburguer(String name, Double valor, String carne) {
        super(name, valor);
        this.carne = carne;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    @Override
    public String toString() {
        return "Hamburguer {" +
                "Carne='" + carne + '\'' +
                ", Nome='" + name + '\'' +
                ", Valor=" + valor +
                '}';
    }
}
