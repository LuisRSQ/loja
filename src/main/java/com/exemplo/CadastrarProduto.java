package com.exemplo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarProduto {

    private static final String IMAGE_DIRECTORY = "C:\\Users\\sandr\\OneDrive\\Área de Trabalho\\trabalho\\loja\\Imagens";

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
        String imagemCaminho = scanner.nextLine();
        String novoCaminho = IMAGE_DIRECTORY + "\\" + new File(imagemCaminho).getName();

        try{

            Files.copy(new File(imagemCaminho).toPath(), new File(novoCaminho).toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){

            System.out.println("Erro ao copiar a imagem: " + e.getMessage());
            return;
        }

        Item novoitem = new Item(codigo, nome, preco, novoCaminho);
        itens.add(novoitem);
        System.out.println("Produto adicionado!");

    }
}
