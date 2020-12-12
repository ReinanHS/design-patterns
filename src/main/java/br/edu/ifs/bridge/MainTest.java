package br.edu.ifs.bridge;

import br.edu.ifs.bridge.refrigerante.CocaCola;
import br.edu.ifs.bridge.refrigerante.Fanta;
import br.edu.ifs.bridge.refrigerante.Guarana;
import br.edu.ifs.bridge.refrigerante.Sprite;
import br.edu.ifs.bridge.tamanho.TamanhoFamilia;
import br.edu.ifs.bridge.tamanho.TamanhoGrande;
import br.edu.ifs.bridge.tamanho.TamanhoMedio;
import br.edu.ifs.bridge.tamanho.TamanhoPequeno;

public class MainTest {
    public static void main(String[] args) {
        CocaCola cocaCola = new CocaCola();
        Guarana guarana = new Guarana();
        Fanta fanta = new Fanta();
        Sprite sprite = new Sprite();

        TamanhoFamilia tamanhoFamilia = new TamanhoFamilia(cocaCola);
        TamanhoGrande tamanhoGrande = new TamanhoGrande(guarana);
        TamanhoMedio tamanhoMedio = new TamanhoMedio(fanta);
        TamanhoPequeno tamanhoPequeno = new TamanhoPequeno(sprite);

        tamanhoFamilia.beber();
        tamanhoGrande.beber();
        tamanhoMedio.beber();
        tamanhoPequeno.beber();
    }
}
