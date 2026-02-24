// Faça um algoritmo para ler três números e ordene-os em ordem crescente

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();

        double menor = Math.min(Math.min(n1, n2), n3);
        double maior = Math.max(Math.max(n1, n2), n3);
        double meio = (n1 + n2 + n3) - menor - maior;

        System.out.println("Os números em ordem crescente são " + menor + " , " + meio + " e " + maior);

        scanner.close();
    }
}