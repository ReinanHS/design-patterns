package br.edu.ifs.factory_method;

import br.edu.ifs.factory_method.fabrica.*;

import java.util.Scanner;

public class Cliente {
    /**
     * Vetor com as fábricas de carros
     */
    public static FabricaDeCarro[] fabricaDeCarros = {
            new FabricaFiat(),
            new FabricaChevrolet(),
            new FabricaFord(),
            new FabricaVolks(),
    };

    public static void main(String[] args) {
        getListFabricas();
        int index = readListIndex();

        fabricaDeCarros[index].CriarCarro().exibirInfo();
    }

    /**
     * Função para listar todas as fábricas registradas
     */
    public static void getListFabricas(){
        for (int i = 0; i < fabricaDeCarros.length; i++) {
            System.out.println("["+i+"] - "+fabricaDeCarros[i]);
        }
    }

    /**
     * Função para ler o valor da fabrica escolhida pelo usuário
     * @return int - Index do vetor de fabricas
     */
    public static int readListIndex(){
        System.out.println("Digite o ID da fabrica de carro [0.."+(fabricaDeCarros.length-1)+"]: ");
        Scanner scanner = new Scanner(System.in);

        try{
            int index = scanner.nextInt();

            return (index >= 0 && index < fabricaDeCarros.length) ? index : readListIndex();

        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
            return readListIndex();
        }
    }
}
