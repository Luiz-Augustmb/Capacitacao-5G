package org.example;

public class Coruja extends Animal{

    private int alturaVoo;

    public Coruja(String nome, int nPatas, String cor, int alturaVoo) {
        super(nome, nPatas, cor);
        this.alturaVoo = alturaVoo;
    }


    @Override
    public void fazBarulho(){
        System.out.println(this.nome + " - HUHUUHUUU!");
    }

    public int getAlturaVoo() {
        return alturaVoo;
    }
}
