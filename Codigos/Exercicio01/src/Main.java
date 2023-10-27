import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        boolean flag = true;
        int opcaoMenu;

        while (flag){
            System.out.println("Bem vindo GO KART!");
            System.out.println("1 - Informações Kart 1");
            System.out.println("2 - Informações Kart 2");
            System.out.println("0 -Sair do menu");

            opcaoMenu = sc.nextInt();
            sc.nextLine();

            switch (opcaoMenu){
                case 1:
                    // metodos piloto e kart 1
                    piloto1.soltaSuperPoder();
                    kart1.pular();
                    kart1.fazerDrift();
                    kart1.soltarTurbo();
                    kart1.motorKart.mostraInfo();
                    System.out.println("---------------------");
                    break;
                case 2:
                    // metodos piloto e kart 2
                    piloto2.soltaSuperPoder();
                    kart2.pular();
                    kart2.fazerDrift();
                    kart2.soltarTurbo();
                    kart2.motorKart.mostraInfo();
                    System.out.println("---------------------");
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Valor Inválido");
                    System.out.println("---------------------");
                    break;
            }
        }





    }
}