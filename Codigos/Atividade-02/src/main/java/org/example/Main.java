package org.example;


public class Main {
    public static void main(String[] args) {

        /*
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        piloto1.nome = "Luiz";
        piloto1.vilao = false;
        kart1.nome = "Ferrari";
        kart1.motorKart.cilindradas = "50";
        kart1.motorKart.velocidadeMaxima = 150;
        kart1.pilotoKart = piloto1;

        piloto2.nome = "Augusto";
        piloto2.vilao = true;
        kart2.nome = "MacLaren";
        kart2.motorKart.cilindradas = "70";
        kart2.motorKart.velocidadeMaxima = 200;
        kart2.pilotoKart = piloto2;
        // metodos piloto e kart 1
        piloto1.soltaSuperPoder();
        kart1.pular();
        kart1.fazerDrift();
        kart1.soltarTurbo();
        kart1.motorKart.mostraInfo();

        // metodos piloto e kart 2
        piloto2.soltaSuperPoder();
        kart2.pular();
        kart2.fazerDrift();
        kart2.soltarTurbo();
        kart2.motorKart.mostraInfo();

         */

        Zumbi zumbi = new Zumbi("Guto", 100, true, 12);

        zumbi.mostraInfo();
        zumbi.comer();
        zumbi.atacado();


    }
}
