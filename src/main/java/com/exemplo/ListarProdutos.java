package com.exemplo;

import java.util.ArrayList;

public class ListarProdutos {

    public static void listarProdutos(ArrayList<Item> itens){

        System.out.println("Itens disponiveis: ");

        for (Item item : itens){

            System.out.println(item);
        }
    }
}
