package formasGeometricasMrl;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroInserido;
        System.out.print("Informe quantas figurasGeometricas geometricas voce deseja criar:  ");
        numeroInserido = input.nextInt();
        ArrayList<FiguraGeometrica> figurasGeometricas = new ArrayList<FiguraGeometrica>();
        int formaGeometricaEscolhida;
        for (int i = 0; i < numeroInserido; i++) {
            System.out.println("\nInforme a figura: ");
            System.out.println("1. Quadrado\n 2. Retângulo\n 3. Círculo");
            formaGeometricaEscolhida = input.nextInt();
            switch (formaGeometricaEscolhida) {
                case 1:
                    System.out.print("\nLado do quadrado:");
                    double ladoDoQuadrado = input.nextDouble();
                    figurasGeometricas.add(new Quad(ladoDoQuadrado));
                    break;
                case 2:
                    System.out.print("\nBase do retângulo:");
                    double baseDoRetangulo = input.nextDouble();
                    System.out.print("Informe a altura do Retângulo: ");
                    double height = input.nextDouble();
                    figurasGeometricas.add(new Retangulo(height, baseDoRetangulo));
                    break;
                case 3:
                    System.out.print("\nInforme o radius do Círculo: ");
                    double radius = input.nextDouble();
                    figurasGeometricas.add(new Circulo(radius));
                    break;
                default:
                    System.out.println("erro");
                    break;
            }
        }
        System.out.println(figurasGeometricas);

    }

}
