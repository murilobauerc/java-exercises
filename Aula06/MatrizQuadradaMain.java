package matrizquadrada;

import java.util.Scanner;
/* Faça um programa em Java que solicite ao usuário a dimensão de uma matriz quadrada de valores inteiros.
   Após, solicite ao usuário o valor de cada uma das posições.
   Por fim, calcule:

   A soma dos valores da diagonal principal - OK
   O produto dos valores da diagonal secundária - OK
   A soma dos valores que não estão nas posições das diagonais 
*/    
public class MatrizQuadradaMain {
    public static void main(String[] args) {
        java.util.Scanner teclado = new Scanner(System.in);
        // TODO code application logic here
        System.out.print("Informe a dimensão desejada para uma matriz quadrada (digite apenas UM numero inteiro): ");
        int dimensaoMatriz = teclado.nextInt();
        int [][]matrizQuadrada = new int[dimensaoMatriz][dimensaoMatriz];

        System.out.print("Digite o valor de cada uma das posições da matriz " + dimensaoMatriz + "x" + dimensaoMatriz + "\n");
        
        // preenchendo a matriz/array multidimensional/vetor multidimensional/array de arrays
        for(int i=0; i < matrizQuadrada.length; i++){
            for(int j=0; j < matrizQuadrada.length; j++){
                System.out.print("Insira cada elemento da matriz[" +i+ "][" +j+"]:");
                matrizQuadrada[i][j] = teclado.nextInt();   
            }   
        }
        
        // Soma dos valores da diagonal principal
        // O produto dos valores da diagonal secundária 
        //  A soma dos valores que não estão nas posições das diagonais
        int sumDP = 0, prodDS = 1, sumValoresNaoDiagonais = 0;
        
        for(int i=0; i < matrizQuadrada.length; i++) {
            sumDP += matrizQuadrada[i][i]; 
            for(int j=0; j < matrizQuadrada.length; j++){
                if (i == matrizQuadrada.length - j - 1) {
                    prodDS *= matrizQuadrada[i][j];
                }
                if(i != matrizQuadrada.length - j - 1 && i != j) {
                    sumValoresNaoDiagonais += matrizQuadrada[i][j];
                }
            }
        }
        System.out.print("Soma dos valores da diagonal principal: " + sumDP + "\n");
        System.out.print("Produto dos valores da diagonal secundária: " + prodDS + "\n");
        System.out.print("A soma dos valores que não estão nas posições das diagonais: " + sumValoresNaoDiagonais + "\n");
    
    }
}