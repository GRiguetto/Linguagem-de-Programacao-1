// 4 - Elabore um algoritmo para ler os números N e P, e calcule a exponenciação de NP utilizando uma função chamada expon( ... ) que você deverá criar. 

import java.util.Scanner;

public class CalculoExponenciacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de N:");
        int n = scanner.nextInt();

        System.out.println("Digite o valor de P:");
        int p = scanner.nextInt();

        long resultadoExponenciacao = expon(n, p);

        System.out.println("O resultado da exponenciação de " + n + " elevado a " + p + " é: " + resultadoExponenciacao);

        scanner.close();
    }

    // Função para calcular a exponenciação de NP
    public static long expon(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }
            return resultado;
        }
    }
}