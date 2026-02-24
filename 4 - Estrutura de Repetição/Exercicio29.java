import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Serão lidos N números, faça um algoritmo que escreva o maior e o menor valor informado

        System.out.print("Digite a quantidade de números (N): ");
        int quantidadeNumeros = scanner.nextInt();

        if (quantidadeNumeros <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo maior que zero.");
            return;
        }

        System.out.print("Digite o 1º número: ");
        double numero = scanner.nextDouble();
        double maior = numero;
        double menor = numero;

        for (int i = 2; i <= quantidadeNumeros; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextDouble();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        scanner.close();
    }
}