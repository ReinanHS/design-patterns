package br.edu.ifs.builder.produtos.items;

public class CheeseBurger extends Sanduiche {
    protected String cobertura;

    public CheeseBurger() { }

    public CheeseBurger(String name, Double valor, String cobertura) {
        super(name, valor);
        this.cobertura = cobertura;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        return "Cheeseburger {" +
                "Cobertura='" + cobertura + '\'' +
                ", Nome='" + name + '\'' +
                ", Valor=" + valor +
                '}';
    }
}
