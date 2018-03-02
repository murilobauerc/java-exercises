/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoradois;
import java.util.Scanner;

public class CalculadoraDois {
    public static void main(String[] args) {
        int soma, subtracao;
        double multiplicacao, divisao;
        java.util.Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o primeiro numero:");
        int primeiroNumero = teclado.nextInt();
        System.out.print("Informe o segundo numero:");
        int segundoNumero = teclado.nextInt();

        soma = primeiroNumero + segundoNumero;
        subtracao = primeiroNumero - segundoNumero;
        multiplicacao = primeiroNumero * segundoNumero;
        
        System.out.print("A soma dos dois numeros fornecidos é:" + soma);
        System.out.print("\nA subtração dos dois numeros fornecidos é:" + subtracao);
        System.out.print("\nA multiplicação dos dois numeros fornecidos é:" + multiplicacao);
        if(segundoNumero == 0){
            System.out.print("\nImpossivel dividir por zero.\n");
        }else{
            divisao = primeiroNumero / (double)segundoNumero;
            System.out.print("\nA divisão dos dois numeros fornecidos é:" + divisao);
        }
    }
}
