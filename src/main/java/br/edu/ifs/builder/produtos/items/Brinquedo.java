package br.edu.ifs.builder.produtos.items;

public class Brinquedo extends Produto {
    protected byte idadePublicoAlvo;

    public Brinquedo() { }

    public Brinquedo(String name, Double valor, byte idadePublicoAlvo) {
        super(name, valor);
        this.idadePublicoAlvo = idadePublicoAlvo;
    }

    public byte getIdadePublicoAlvo() {
        return idadePublicoAlvo;
    }

    public void setIdadePublicoAlvo(byte idadePublicoAlvo) {
        this.idadePublicoAlvo = idadePublicoAlvo;
    }
}
