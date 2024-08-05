package com.exemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

    private ArrayList<Item> itens;

    public Loja() {

        itens = new ArrayList<>();

    }

    public void iniciar(){

        Scanner scanner = new Scanner(System.in);

        Comprar comprar = new Comprar();

        while (true) {

            System.out.println("1- Adicionar item");
            System.out.println("2- Listar produtos");
            System.out.println("3- Comprar itens");
            System.out.println("4- Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){

                case 1:

                    CadastrarProduto.adicionarProduto(scanner, itens);

                    break;

                case 2:

                    ListarProdutos.listarProdutos(itens);

                break;

                case 3:

                    comprar.adicionarItem(scanner, itens);
                    comprar.calcularTotal();

                break;

                case 4:

                    return;

                default:

                    System.out.println("Opcao invalida!!");
            }
        }


    }
}
