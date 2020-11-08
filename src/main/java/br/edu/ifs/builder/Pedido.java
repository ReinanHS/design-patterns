package br.edu.ifs.builder;

import java.util.HashSet;
import java.util.Set;

public class Pedido {
    private Set<String> dentroDaCaixa = new HashSet<String>();
    private Set<String> foraDaCaixa = new HashSet<String>();

    public void adicionarDentroDaCaixa(String item){
        dentroDaCaixa.add(item);
    }

    public void adicionarForaDaCaixa(String item){
        dentroDaCaixa.add(item);
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Seu pedido: \n");
        buffer.append("Dentro da caixa: \n");
        for (String item : this.dentroDaCaixa) { buffer.append("\t" + item + "\n"); }
        buffer.append("Fora da caixa: \n");
        for (String item : this.foraDaCaixa) { buffer.append("\t" + item + "\n"); }
        buffer.append("\nTenha um bom dia\n\n");

        return buffer.toString();
    }
}
