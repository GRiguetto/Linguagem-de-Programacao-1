// Faça um algoritmo para determinar o maior e o menor de quatro números lidos

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();

        System.out.print("Digite o quarto número: ");
        double n4 = scanner.nextDouble();

        double maior = n1;
        double menor = n1;

        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }
        if (n4 > maior) {
            maior = n4;
        }

        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        if (n4 < menor) {
            menor = n4;
        }

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);

        scanner.close();
    }
}