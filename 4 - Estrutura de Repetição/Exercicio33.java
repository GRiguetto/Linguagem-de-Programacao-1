
// Faça um algoritmo para ler um número até que o usuário deseja terminar a entrada dos dados e, receber as seguintes informações: a média dos números, o maior e o menor número
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 0;
        double soma = 0;
        double numero;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        char continuar;

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextDouble();

            soma += numero;
            totalNumeros++;

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.next().charAt(0);

        } while (Character.toUpperCase(continuar) == 'S');

        scanner.close();

        if (totalNumeros > 0) {
            double media = soma / totalNumeros;

            System.out.println("\nResultados:");
            System.out.println("Média dos números: " + media);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        } else {
            System.out.println("Nenhum número foi inserido.");
        }
    }
}