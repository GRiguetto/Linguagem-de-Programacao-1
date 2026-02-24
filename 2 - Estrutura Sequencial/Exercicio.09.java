// 9 - Faça um algoritmo que leia o peso de uma pessoa em quilo, calcule e mostre o peso em gramas.

import java.util.Scanner;

public class PesoEmGramas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em quilos: ");
        double pesoQuilos = scanner.nextDouble();

        double pesoGramas = pesoQuilos * 1000;

        System.out.println("O peso em gramas é: " + pesoGramas);

        scanner.close();
    }
}