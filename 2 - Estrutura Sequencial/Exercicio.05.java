// 5 - Faça um algoritmo que leia duas notas, calcule e mostre a média ponderada dessas notas, sabendo que os pesos devem ser dados pelo usuário. 

import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();

        double mediaPonderada = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);

        System.out.println("A média ponderada é: " + mediaPonderada);

        scanner.close();
    }
}