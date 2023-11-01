package org.example;

public class Leao extends Animal{

    private float tamanhoJuba;

    public Leao(String nome, int nPatas, String cor, float tamanhoJuba) {
        super(nome, nPatas, cor);
        this.tamanhoJuba = tamanhoJuba;
    }

    @Override
    public void fazBarulho(){
        System.out.println( this.nome + " - ARGHHHH!");
    }

    public float getTamanhoJuba() {
        return tamanhoJuba;
    }
}
