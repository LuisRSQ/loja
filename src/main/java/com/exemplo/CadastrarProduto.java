package com.exemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarProduto {

    public static void adicionarProduto(Scanner scanner, ArrayList<Item> itens){

        System.out.println("Informe o codigo do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o preco do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o caminho da imagem do produto: ");
        String imagem = scanner.nextLine();


        Item novoitem = new Item(codigo, nome, preco, imagem);
        itens.add(novoitem);
        System.out.println("Produto adicionado!");

    }
}
