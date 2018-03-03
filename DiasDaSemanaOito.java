package com.company;
import java.util.Scanner;

public class DiasDaSemanaOito {

    public static void main(String[] args) {
	// write your code here
        java.util.Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número:");
        int diaSemana = teclado.nextInt();
        switch(diaSemana){
            case 1:
                System.out.print("Domingo");
                break;
            case 2:
                System.out.print("Segunda-Feira");
                break;
            case 3:
                System.out.print("Terca-Feira");
                break;
            case 4:
                System.out.print("Quarta-Feira");
                break;
            case 5:
                System.out.print("Quinta-Feira");
                break;
            case 6:
                System.out.print("Sexta-Feira");
                break;
            case 7:
                System.out.print("Sábado");
                break;
            default:
                System.out.print("Dia Invalido");

        }
    }
}
