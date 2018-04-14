package com.company;
import java.util.Scanner;


public class SomaImparSeis {

    public static void main(String[] args) {
        // write your code here
        int soma = 0;
        java.util.Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número inteiro positivo:");
        int numeroInformado = teclado.nextInt();
        if (numeroInformado <= 0 || numeroInformado == 0) {
            System.out.print("Numero Invalido");
        } else {
            for (int n = 0; n <= numeroInformado; n++) {
                if (n % 2 != 0) {
                    soma += n;
                }
            }
            System.out.print(soma);
        }
    }
}
