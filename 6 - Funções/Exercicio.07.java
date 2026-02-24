// 7 - Faça um programa que receba 3 números e mostre, utilizando funções: 
// - Os números em ordem crescente 
// - Os números em ordem decrescente 
// - Os números pares 
// - Os números ímpares 
// - Os números maiores que 3 e menores que 10 

import java.util.Arrays;
import java.util.Scanner;

public class AnaliseNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = scanner.nextInt();

        // Chamando as funções para realizar as diferentes análises
        imprimirOrdemCrescente(num1, num2, num3);
        imprimirOrdemDecrescente(num1, num2, num3);
        imprimirNumerosPares(num1, num2, num3);
        imprimirNumerosImpares(num1, num2, num3);
        imprimirNumerosEntre3e10(num1, num2, num3);

        scanner.close();
    }

    // Função para imprimir os números em ordem crescente
    public static void imprimirOrdemCrescente(int num1, int num2, int num3) {
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        System.out.println("Números em ordem crescente: " + Arrays.toString(numeros));
    }

    // Função para imprimir os números em ordem decrescente
    public static void imprimirOrdemDecrescente(int num1, int num2, int num3) {
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nNúmeros em ordem decrescente.");
    }

    // Função para imprimir os números pares
    public static void imprimirNumerosPares(int num1, int num2, int num3) {
        System.out.print("Números pares: ");
        if (num1 % 2 == 0) System.out.print(num1 + " ");
        if (num2 % 2 == 0) System.out.print(num2 + " ");
        if (num3 % 2 == 0) System.out.print(num3 + " ");
        System.out.println();
    }

    // Função para imprimir os números ímpares
    public static void imprimirNumerosImpares(int num1, int num2, int num3) {
        System.out.print("Números ímpares: ");
        if (num1 % 2 != 0) System.out.print(num1 + " ");
        if (num2 % 2 != 0) System.out.print(num2 + " ");
        if (num3 % 2 != 0) System.out.print(num3 + " ");
        System.out.println();
    }

    // Função para imprimir os números maiores que 3 e menores que 10
    public static void imprimirNumerosEntre3e10(int num1, int num2, int num3) {
        System.out.print("Números entre 3 e 10: ");
        if (num1 > 3 && num1 < 10) System.out.print(num1 + " ");
        if (num2 > 3 && num2 < 10) System.out.print(num2 + " ");
        if (num3 > 3 && num3 < 10) System.out.print(num3 + " ");
        System.out.println();
    }
}