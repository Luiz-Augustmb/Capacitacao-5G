package org.example;

public class Zumbi {

    String nome;
    int vida;
    boolean fome;
    int vitimas;

    public Zumbi(String nome, int vida, boolean fome, int vitimas) {
        this.nome = nome;
        this.vida = vida;
        this.fome = fome;
        this.vitimas = vitimas;
    }

    public void mostraInfo(){
        System.out.println("Nome do Zumbi: " + this.nome);
        System.out.println("Vida do Zumbi: " + this.vida);
        System.out.println("Numero de vitimas do Zumbi: " + this.vitimas);
        if (fome) {
            System.out.println("Zumbi está com fome");
        }else {
            System.out.println("Zumbi não está com fome");
        }
    }

    public void comer(){
        System.out.println(nome + " está comendo cerebros!!!!");
    }

    public void atacado(){
        System.out.println(nome + " foi atacado por um vivo!");
    }

}
