package br.edu.ifs.builder;

import br.edu.ifs.builder.funcionarios.Atendente;
import br.edu.ifs.builder.funcionarios.Chapeiro;
import br.edu.ifs.builder.produtos.builders.*;
import br.edu.ifs.builder.produtos.items.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {
    protected String nome;
    protected ArrayList<Produto> menu = new ArrayList<Produto>();
    protected Atendente atendente;
    protected Chapeiro chapeiro;
    protected ArrayList<Produto> listaPedidos = new ArrayList<Produto>();

    public Restaurante(Atendente atendente, Chapeiro chapeiro) {
        this.atendente = atendente;
        this.chapeiro = chapeiro;
        this.cadastrarMenu();
    }

    protected void cadastrarMenu(){
        this.menu.add( (new HamburguerTradicionalBuilder() ).getHamburguer() );
        this.menu.add( (new CheeseBurgerGourmetBuilder() ).getCheeseBurger() );
        this.menu.add( (new BatataPequenaBuilder() ).getBatata() );
        this.menu.add( (new BatataMediaBuilder() ).getBatata() );
        this.menu.add( (new BatataGrandeBuilder() ).getBatata() );
        this.menu.add( (new BonequinhaBebeBuilder() ).getBonequinha() );
        this.menu.add( (new CarrinhoControleRemotoBuilder() ).getCarrinho() );
        this.menu.add( (new CocaColaBuilder() ).getRefrigerante() );
        this.menu.add( (new GuaranaBuilder() ).getRefrigerante() );
    }

    public void mostrarMenu(){
        System.out.println("Menu do restaurante: ");
        for (int i = 0; i < this.menu.size(); i++) {
            System.out.println("["+i+"] - "+ this.menu.get(i));
        }
    }

    public ArrayList<Produto> anotarPedido(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ID do item para fazer o pedido: ");

        try{
            int idPeido = scanner.nextInt();

            if(idPeido >= 0 && idPeido < this.menu.size()){
                this.listaPedidos.add( this.menu.get(idPeido) );

                System.out.println("Você deseja finalizar seu pedido [y/n]: ");
                String result = scanner.next();

                if(result.equals("y") || result.equals("Y")){
                    return this.listaPedidos;
                }
            }else System.out.println("Valor inválido, digite novamente");

            return this.anotarPedido();

        }catch (Exception exception){
            System.out.println("Ocorreu um erro inesperado tente novamente.");
            return this.anotarPedido();
        }
    }

    public void produzirPedido(){
        PedidoBuilder pedidoBuilder = new PedidoBuilder();
        double valorTotal = 0.0;

        for (int i = 0; i < this.listaPedidos.size(); i++) {
            if(this.listaPedidos.get(i) instanceof Sanduiche){
                pedidoBuilder.builderSanduiche((Sanduiche) this.listaPedidos.get(i));
            } else if(this.listaPedidos.get(i) instanceof Batata){
                pedidoBuilder.builderBatata((Batata) this.listaPedidos.get(i));
            } else if(this.listaPedidos.get(i) instanceof Brinquedo){
                pedidoBuilder.builderBrinquedo((Brinquedo) this.listaPedidos.get(i));
            }else if(this.listaPedidos.get(i) instanceof Refrigerante){
                pedidoBuilder.builderRefrigerante((Refrigerante) this.listaPedidos.get(i));
            }

            valorTotal += this.listaPedidos.get(i).getValor();
        }

        System.out.println(pedidoBuilder.getPedido());
        System.out.println("O valor total foi de R$"+valorTotal);
    }

    public void realizarAtendimento(){
       ArrayList<Produto> pedidos = this.anotarPedido();
       this.produzirPedido();
    }
}
