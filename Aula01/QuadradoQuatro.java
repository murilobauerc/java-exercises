package com.company;
import java.util.Scanner;

public class QuadradoQuatro {
    public static void main(String[] args) {
        // write your code here
        java.util.Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a altura do quadrilátero:");
        int alturaQuadrilatero = teclado.nextInt();
        System.out.print("Informe a largura do quadrilátero:");
        int larguraQuadrilatero = teclado.nextInt();
        for (int x = 0; x < alturaQuadrilatero; x++) {
            for (int y = 0; y < larguraQuadrilatero; y++) {
                System.out.print("X");
            }
            System.out.print("\n");
        }
    }
}
