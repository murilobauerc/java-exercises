package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // write your code here
        ArrayList<Integer> numerosInteiros = new ArrayList<Integer>();
        System.out.print("Digite valores positivos inteiros." + "\n");
        while (true) {
            System.out.print("Informe um numero: ");
            int num = input.nextInt();
            if (num < 0) {
                System.out.print("Voce digitou um numero negativo, a lista foi encerrada." + "\n");
                break;
            } else numerosInteiros.add(num);
        }
        System.out.print("Informe uma posicao da lista que será removida: ");
        int n = input.nextInt();

        System.out.print("Impressão da ArrayList." + "\n");
        for (int i = 0; i < numerosInteiros.size(); i++) {
            System.out.print(numerosInteiros.get(i) + " - ");
        }
        for (int i = 0; i < numerosInteiros.size(); i++) {
            if (i == n) {
                numerosInteiros.remove(i);
            }
        }
        Collections.sort(numerosInteiros);
        System.out.print("\n\nImpressão da ArrayList ordenada após a remoção." + "\n");
        for (int i = 0; i < numerosInteiros.size(); i++) {
            System.out.print(numerosInteiros.get(i) + " - ");
        }
    }
}