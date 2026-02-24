// 25 - Faça um algoritmo que leia o valor dos catetos de um triângulo
// retângulo, calcule e mostre sua hipotenusa.

import java.util.Scanner;

public class HipotenusaTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Digite o valor do segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("A hipotenusa do triângulo é: " + hipotenusa);

        scanner.close();
    }
}