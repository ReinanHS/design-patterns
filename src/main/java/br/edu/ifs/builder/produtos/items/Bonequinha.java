package br.edu.ifs.builder.produtos.items;

public class Bonequinha extends Brinquedo {
    public String corDaPele;
    public String corDoOlho;
    public String corDoCabelo;

    public Bonequinha() { }

    public Bonequinha(String name, Double valor, byte idadePublicoAlvo, String corDaPele, String corDoOlho, String corDoCabelo) {
        super(name, valor, idadePublicoAlvo);
        this.corDaPele = corDaPele;
        this.corDoOlho = corDoOlho;
        this.corDoCabelo = corDoCabelo;
    }

    public String getCorDaPele() {
        return corDaPele;
    }

    public void setCorDaPele(String corDaPele) {
        this.corDaPele = corDaPele;
    }

    public String getCorDoOlho() {
        return corDoOlho;
    }

    public void setCorDoOlho(String corDoOlho) {
        this.corDoOlho = corDoOlho;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    @Override
    public String toString() {
        return "Bonequinha {" +
                "Cor da Pele='" + corDaPele + '\'' +
                ", Cor do Olho='" + corDoOlho + '\'' +
                ", Cor do Cabelo='" + corDoCabelo + '\'' +
                ", Nome='" + name + '\'' +
                ", Valor=" + valor +
                '}';
    }
}
