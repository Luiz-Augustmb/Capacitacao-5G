import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner valorTecado = new Scanner(System.in);

        SUV suv = new SUV(200500.21, "Banco", 2023, "4x4");
        Sedan sedan = new Sedan(150000.30, "Roxo", 2021, 1);
        Hatch hatch = new Hatch(60000.15, "Vermelho", 2020, 4);

        boolean flag = true;
        int opcaoMenu;

        while (flag){

            System.out.println("Bem vindo a concessionária Barbosa");
            System.out.println("1 - Modelo SUV");
            System.out.println("2 - Modelo Sedan");
            System.out.println("3 - Modelo Hatch");
            System.out.println("0 - Sair do menu");

            opcaoMenu = valorTecado.nextInt();
            valorTecado.nextLine();

            switch (opcaoMenu){
                case 1:
                    suv.mostraInfo();
                    break;
                case 2:
                    sedan.mostraInfo();
                    break;
                case 3:
                    hatch.mostraInfo();
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