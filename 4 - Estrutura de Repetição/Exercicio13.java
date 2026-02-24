import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        // Desenvolva um programa que permite calcular a soma de números a partir do número 1 até um número informado pelo usuário.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular a soma até esse número: ");
        int numeroUsuario = scanner.nextInt();

        if (numeroUsuario > 0) {
            int resultadoSoma = calcularSomaAteN(numeroUsuario);

            System.out.println("Resultado");
            System.out.println("A soma de 1 até " + numeroUsuario + " é " + resultadoSoma);
        } else {
            // Exibir uma mensagem de erro se o número não for válido
            System.out.println("Erro");
            System.out.println("Por favor, digite um número válido maior que zero");
        }
    }

    public static int calcularSomaAteN(int numero) {
        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            soma += i;
        }

        return soma;
    }
}