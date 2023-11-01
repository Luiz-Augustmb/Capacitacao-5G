package org.example;

public class Zoologico {

    private String nome;
    private String endereco;
    Animal[] animal = new Animal[50];

    public Zoologico(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}
