package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void avisoMaiorOuMenor(int segundaResposta, int primeiraResposta, int tentativasAcerto) {
        if (segundaResposta > primeiraResposta) {
            System.out.println("Tente chutar um número menor.");
        } else {
            if (segundaResposta < primeiraResposta) {
                System.out.println("Tente chutar um número maior.");
            } else {
                System.out.println("Voce acertou o numero. Parabéns!!!");
                System.out.println("A quantidade de tentativas até o acerto foram de: " + tentativasAcerto);
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int tentativasAcerto = 0, primeiroUsuario, segundoUsuario;
        System.out.println("O jogo é para 1 ou 2 jogadores?");
        int numJogadores = teclado.nextInt();
        if(numJogadores == 1) {
            Random rand = new Random();
            int numAleatorio = rand.nextInt(1000) + 1;
            System.out.print("Digite um número entre 1 e 1000 para adivinhar o numero: ");
            int chute = teclado.nextInt();
            if(chute == numAleatorio){
                System.out.println("Voce acertou o numero. Parabéns!!!");
            }else{ System.out.println("Você não acertou o número! O numero sorteado era: " + numAleatorio); }
        }else{
            System.out.print("Digite um número entre 1 e 1000 para o segundo jogador adivinhar: ");
            primeiroUsuario = teclado.nextInt();
            do{
                System.out.print("Digite um número entre 1 e 1000 para adivinhar o numero: ");
                segundoUsuario = teclado.nextInt();
                tentativasAcerto++;

                avisoMaiorOuMenor(segundoUsuario, primeiroUsuario, tentativasAcerto);
            }while(segundoUsuario != primeiroUsuario);
        }
    }
}