package org.example;

public class Main {
    public static void main(String[] args) {

        Zoologico zoo = new Zoologico("Zoologico Santa Rita", "Avenida Inatel");

        Coruja coruja = new Coruja("Corujinha",2 , "Marrom", 15);
        Peixe peixe = new Peixe("Tubarão", 0, "Branco", 2);
        Leao leao = new Leao("Simba", 4, "Dourado", 30);
        Pato pato = new Pato("Patinho Feio", 2, "Malhado", 5);

        zoo.animal[0] = coruja;
        zoo.animal[1] = peixe;
        zoo.animal[2] = leao;
        zoo.animal[3] = pato;

        System.out.println("-------------------------------");
        System.out.println("Infromações do Zoologico: ");
        System.out.println("Nome: " + zoo.getNome());
        System.out.println("Endereço: " + zoo.getEndereco());

        for (int i = 0; i < zoo.animal.length; i++) {
            if(zoo.animal[i]!=null){
                if (zoo.animal[i] instanceof Coruja){
                    Coruja c = (Coruja) zoo.animal[i];
                    System.out.println("-------------------------------");
                    System.out.println("O primeiro animal do " + zoo.getNome() + " é uma Coruja");
                    System.out.println("Nome: " + c.nome);
                    System.out.println("Cor: " + c.cor);
                    System.out.println("Número de patas: " + c.nPatas);
                    System.out.println(c.nome + " tem um voo de " + c.getAlturaVoo() + " metros");
                    c.fazBarulho();
                }else if (zoo.animal[i] instanceof Peixe){
                    Peixe p = (Peixe) zoo.animal[i];
                    System.out.println("-------------------------------");
                    System.out.println("O segundo animal do " + zoo.getNome() + " é um Peixe");
                    System.out.println("Nome: " + p.nome);
                    System.out.println("Cor: " + p.cor);
                    System.out.println("Número de barbatanas: " + p.getnBarbatanas());
                    p.fazBarulho();
                }else if (zoo.animal[i] instanceof Leao){
                    Leao l = (Leao) zoo.animal[i];
                    System.out.println("-------------------------------");
                    System.out.println("O terceiro animal do " + zoo.getNome() + " é um Leão");
                    System.out.println("Nome: " + l.nome);
                    System.out.println("Cor: " + l.cor);
                    System.out.println("Número de patas: " + l.nPatas);
                    System.out.println(l.nome + " tem uma juba maravilhosa de " + l.getTamanhoJuba() + " cm");
                    l.fazBarulho();
                }else if (zoo.animal[i] instanceof Pato){
                    Pato pa = (Pato) zoo.animal[i];
                    System.out.println("-------------------------------");
                    System.out.println("O quarto animal do " + zoo.getNome() + " é um Pato");
                    System.out.println("Nome: " + pa.nome);
                    System.out.println("Cor: " + pa.cor);
                    System.out.println("Número de patas: " + pa.nPatas);
                    System.out.println(pa.nome + " tem uma bico de " + pa.getTamanhoBico() + " cm");
                    pa.fazBarulho();
                }

            }
        }

    }
}