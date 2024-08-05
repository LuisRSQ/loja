package com.exemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class Comprar {

    private ArrayList<Item> itensCarrinho;
    private ArrayList<Integer> quantidades;

    public Comprar(){

        itensCarrinho = new ArrayList<>();
        quantidades = new ArrayList<>();
    }

    public void adicionarItem(Scanner scanner, ArrayList<Item> itensDisponiveis){

        while(true){

            System.out.println("Itens disponiveis: ");
            ListarProdutos.listarProdutos(itensDisponiveis);

            System.out.println("Digite o codigo do item que deseja comprar ou 'sair' para finalizar: ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("sair")){

                break;
            }

            int codigo;

            try{

                codigo = Integer.parseInt(input);

            }catch (NumberFormatException e){

                System.out.println("Codigo invalido!");
                continue;
            }

            Item itemSelecionado = null;

            for(Item item : itensDisponiveis){

                if(item.getCodigo() == codigo){

                    itemSelecionado = item;
                    break;
                }
            }

            if(itemSelecionado == null){

                System.out.println("Codigo invalido!");
                continue;
            }

            System.out.println("Informe a quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            itensCarrinho.add(itemSelecionado);
            quantidades.add(quantidade);
        }

    }

    public void calcularTotal(){

        double total = 0;

        System.out.println("Itens no carrinho: ");
        for(int i = 0; i < itensCarrinho.size(); i++){

            Item item = itensCarrinho.get(i);
            int quantidade = quantidades.get(i);
            System.out.println(item + ", Quantidade: " + quantidade);
            total += item.getPreco() * quantidade;
        }

        System.out.println("Total a pagar: R$ " + total);
    }
}
