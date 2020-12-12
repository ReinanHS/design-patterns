package br.edu.ifs.bridge.tamanho;

import br.edu.ifs.bridge.refrigerante.ImplementacaoRefrigerante;

public abstract class AbstracaoTamanho {
    protected ImplementacaoRefrigerante refrigerante;

    public AbstracaoTamanho(ImplementacaoRefrigerante refrigerante){
        this.refrigerante = refrigerante;
    }

    public abstract void beber();
}
