package com.exemplo;

public class Item {

    private int codigo;
    private String nome;
    private double preco;
    private String imagem;

    public Item(int codigo, String nome, double preco, String imagem){

        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getImagem() {
        return imagem;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Preço: " + preco + ", Imagem: " + imagem;
    }
}
