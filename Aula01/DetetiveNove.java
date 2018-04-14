package com.company;
import java.util.Scanner;

public class DetetiveNove {

    public static void main(String[] args) {
        int count = 0;
        java.util.Scanner teclado = new Scanner(System.in);
        // write your code here
        System.out.print("Telefonou para a vítima?");
        String primeiraPergunta = teclado.nextLine();
        System.out.print("Esteve no local do crime?");
        String segundaPergunta = teclado.nextLine();
        System.out.print("Mora perto da vítima?");
        String terceiraPergunta = teclado.nextLine();
        System.out.print("Devia para a vítima?");
        String quartaPergunta = teclado.nextLine();
        System.out.print("Já trabalhou com a vítima?");
        String quintaPergunta = teclado.nextLine();
        if (primeiraPergunta.equals("Sim")) count++;
        if (segundaPergunta.equals("Sim")) count++;
        if (terceiraPergunta.equals("Sim")) count++;
        if (quartaPergunta.equals("Sim")) count++;
        if(quintaPergunta.equals("Sim")) count++;

        if (count == 2) {
            System.out.print("Suspeita");
        }else if (count == 3 || count == 4) {
            System.out.print("Cumplice");
        }else if (count == 5) {
            System.out.print("Assassino");
        }else{
            System.out.print("Inocente");
        }
    }
}

