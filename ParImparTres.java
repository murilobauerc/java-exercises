package com.company;

import java.util.Scanner;

public class ParImparTres {

    public static void main(String[] args) {
	// write your code here
        int soma = 0;
        java.util.Scanner teclado = new Scanner(System.in);
        System.out.print("O primeiro usuário informa um número:");
        int primeiroNumero = teclado.nextInt();
        System.out.print("O segundo usuário informa outro número:");
        int segundoNumero = teclado.nextInt();

        soma = primeiroNumero + segundoNumero;
        if (soma % 2 == 0) {
            System.out.print("PAR");
        }else{
            System.out.print("IMPAR");
        }
    }
}
