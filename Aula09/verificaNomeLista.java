package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	// write your code here
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Murilo");
        nomes.add("D'alessandro");
        nomes.add("Dourado");
        nomes.add("Luan");
        nomes.add("Arthur");
        nomes.add("Tales");
        nomes.add("Elgio");
        nomes.add("Adelina");
        nomes.add("Fulano");
        nomes.add("Ciclano");

        System.out.print("Informe um nome: ");
        String nomeInformado = input.nextLine();

        if(nomes.contains(nomeInformado)){
            System.out.print("O nome informado pelo usuário está contido na lista." + "\n");
        }else{
            System.out.print("O nome informado pelo usuário não está contido na lista." + "\n");
        }
    }
}
