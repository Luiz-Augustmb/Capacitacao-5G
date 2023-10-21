package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in);

        // Exercicio 01
        /*
        int ano;
        System.out.print("Entre com o ano a ser verificado se é bissexto: ");
        ano = valorTeclado.nextInt();

        if ((ano % 400) == 0){
            System.out.println(ano + " é bissexto");
        } else if ((ano % 4) == 0 && (ano % 100) != 0 ){
            System.out.println(ano + " é bissexto");
        }else {
            System.out.println(ano + " não é bisseto");
        }

         */

        // Exercicio 02
        /*
        int diaSemana;
        System.out.print("Entre com um valor entre 1 e 7: ");
        diaSemana = valorTeclado.nextInt();
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Valor Inválido");
                break;
        }

         */


        // Exercicio 03
        /*
        int soma = 0;
        for (int i = 0; i < 16; i++){
            soma += i;
        }
        System.out.println(soma);

         */


        // Exercicios 04
        /*
        int cont = 0, idade, soma = 0;
        do {
            System.out.print("Informe a idade: ");
            idade = valorTeclado.nextInt();
            if (idade>0){
                soma += idade;
                cont++;
                continue;
            }else{
                System.out.println("Idade não pode ser negativa");
                break;
            }
        }while (cont < 5);
        System.out.println("Soma das idades: " + soma);

         */


        valorTeclado.close();
    }
}