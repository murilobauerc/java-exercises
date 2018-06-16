package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vetor[] = {1,3,5,7,8,10,13,14,21,25};
        int pos = 0;

        System.out.println("Digite uma posição do vetor: ");
        pos = teclado.nextInt();

        try{
            System.out.println("O valor que está na posição " + pos + " é: " + vetor[pos]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Você digitou uma posição que está fora do limite do vetor.");
        }
    }
}
