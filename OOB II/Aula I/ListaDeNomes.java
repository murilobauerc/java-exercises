package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNomes {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList();
        nomes.add("D'alessandro");
        nomes.add("Cebolinha");
        nomes.add("Everton");
        nomes.add("Nico");
        nomes.add("Rafael Moura");
        nomes.add("Neymar");
        nomes.add("Coutinho");
        nomes.add("Taison");
        nomes.add("Tales");
        nomes.add("Murilo");

        System.out.print("Digite um nome: ");
        String nomeInformado = teclado.nextLine();

        if(nomes.contains(nomeInformado)){
            System.out.print("O nome informado pelo usuário está contido na lista." + "\n");
        }else{
            System.out.print("O nome informado pelo usuário não está contido na lista." + "\n");
        }
    }
}
