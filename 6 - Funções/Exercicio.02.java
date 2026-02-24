// 2 - Faça um algoritmo que receba um número correspondente a uma das tabuadas (somente números entre 1 e 10),
// crie uma função que receba o número digitado e imprima a tabuada do respectivo número.
// O programa termina quando o usuário digitar um valor inválido. 

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número para obter a tabuada (1 a 10) ou digite um valor negativo para sair:");
            int numero = scanner.nextInt();

            if (numero < 0 || numero > 10) {
                System.out.println("Programa encerrado.");
                break;
            }

            // Chamar a função para imprimir a tabuada
            imprimirTabuada(numero);
        }

        scanner.close();
    }

    // Função para imprimir a tabuada de um número
    public static void imprimirTabuada(int numero) {
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println();
    }
}