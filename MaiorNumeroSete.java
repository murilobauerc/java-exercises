package com.company;
import java.util.Scanner;

public class MaiorNumeroSete {

    public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número:");
        int primeiroNumero = teclado.nextInt();
        System.out.print("Informe outro número:");
        int segundoNumero = teclado.nextInt();

        if (primeiroNumero == segundoNumero){
            System.out.print("Numeros iguais");
        }else if(primeiroNumero > segundoNumero){
            System.out.print("Primeiro numero maior");
        }else{
            System.out.print("Segundo numero maior");
        }
    }
}
