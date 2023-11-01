package org.example;

public class Pato extends Animal{

    private float tamanhoBico;

    public Pato(String nome, int nPatas, String cor, float tamanhoBico) {
        super(nome, nPatas, cor);
        this.tamanhoBico = tamanhoBico;
    }

    @Override
    public void fazBarulho(){
        System.out.println(this.nome + "- QUAK QUAK!");
    }

    public float getTamanhoBico() {
        return tamanhoBico;
    }
}
