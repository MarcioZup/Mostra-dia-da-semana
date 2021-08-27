package br.com.zup;

import java.util.Scanner;

public class ExibeDiaDaSemana {
    public static void main(String[] args) {

        System.out.println("Entre com um número de 1 a 7 e terá como resposta o dia da semana correspondente: ");

        Scanner teclado = new Scanner(System.in);
        int numeroDigitado = teclado.nextInt();
        teclado.close();

        switch (numeroDigitado){
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
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Você não digitou uma opção válida. reinicie o programa e digite um número de 1 a 7");

        }



    }
}
