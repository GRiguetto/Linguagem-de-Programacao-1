// Faça um programa para ler 3 números reais e imprimi-los em ordem crescente. Se os números forem iguais, o cálculo o programa não deve ordená-los

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();

        if (n1 == n2 || n2 == n3) {
            System.out.println("Os números são iguais " + n1 + " , " + n2 + " e " + n3);
        } else {
            double menor = Math.min(Math.min(n1, n2), n3);
            double maior = Math.max(Math.max(n1, n2), n3);
            double meio = (n1 + n2 + n3) - menor - maior;

            System.out.println("Os números em ordem crescente são " + menor + " , " + meio + " e " + maior);
        }

        scanner.close();
    }
}