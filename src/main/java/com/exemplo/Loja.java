package com.exemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

    private ArrayList<Item> itens;

    public Loja() {

        itens = new ArrayList<>();

        itens.add(new Item(1, "X-Burguer", 10.00));
        itens.add(new Item(2, "X-Bacon", 15.00));
        itens.add(new Item(3, "X-Eggburguer", 5.00));
        itens.add(new Item(4, "X-Tudo", 20.00));
        itens.add(new Item(5, "X-Salada", 10.00));
    }

    public void iniciar(){

        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> carrinho = new ArrayList<>();

        ArrayList<Integer> quantidades = new ArrayList<>();

        while (true) {

            System.out.println("Itens disponíveis:");

            for (Item item : itens) {

                System.out.println(item);
            }

            System.out.println("Digite o código do item que deseja comprar (ou 'sair' para finalizar):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            int codigo;

            try {

                codigo = Integer.parseInt(input);

            } catch (NumberFormatException e) {

                System.out.println("Código inválido. Tente novamente.");
                continue;
            }

            Item itemSelecionado = null;
            for (Item item : itens) {
                if (item.getCodigo() == codigo) {
                    itemSelecionado = item;
                    break;
                }
            }

            if (itemSelecionado == null) {
                System.out.println("Código inválido. Tente novamente.");
                continue;
            }

            System.out.println("Digite a quantidade:");

            int quantidade = scanner.nextInt();
            scanner.nextLine();

            carrinho.add(itemSelecionado);
            quantidades.add(quantidade);
        }

        double total = 0;

        System.out.println("Itens no carrinho:");

        for (int i = 0; i < carrinho.size(); i++) {

            Item item = carrinho.get(i);

            int quantidade = quantidades.get(i);
            System.out.println(item + ", Quantidade: " + quantidade);

            total += item.getPreco() * quantidade;
        }

        System.out.println("Total a pagar: R$ " + total);
        scanner.close();
    }
}
