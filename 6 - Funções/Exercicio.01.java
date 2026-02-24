// 1 - Faça um programa que receba 5 números do tipo float maiores que zero, crie as seguintes funções: 
// - boolean verificaNumero(int float) 
// - void parImpar(int float) 
// - float media(float n1, float n2, float n3, float n4, float n5) 
// - float maior(float n1, float n2, float n3, float n4, float n5) 
// - float menor(float n1, float n2, float n3, float n4, float n5) 
// Ao solicitar cada número, verifique se o mesmo é valido através da função verificaNumero, depois mostre se o número é par
// ou impar utilizando a função parImpar. Ao final mostre a média dos números, qual é o número maior e qual é o número menor. 

import java.util.Scanner;

public class ManipulacaoNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] numeros = new float[5];

        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Digite o " + (i + 1) + "º número: ");
                numeros[i] = scanner.nextFloat();
            } while (!verificaNumero(numeros[i]));

            parImpar(numeros[i]);
        }

        float mediaNumeros = media(numeros[0], numeros[1], numeros[2], numeros[3], numeros[4]);
        float maiorNumero = maior(numeros[0], numeros[1], numeros[2], numeros[3], numeros[4]);
        float menorNumero = menor(numeros[0], numeros[1], numeros[2], numeros[3], numeros[4]);

        System.out.println("Média dos números: " + mediaNumeros);
        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Menor número: " + menorNumero);

        scanner.close();
    }

    // Função para verificar se o número é maior que zero
    public static boolean verificaNumero(float numero) {
        if (numero > 0) {
            return true;
        } else {
            System.out.println("Número inválido. Digite um número maior que zero.");
            return false;
        }
    }

    // Função para verificar se o número é par ou ímpar
    public static void parImpar(float numero) {
        if (numero % 2 == 0) {
            System.out.println("Número " + numero + " é par.");
        } else {
            System.out.println("Número " + numero + " é ímpar.");
        }
    }

    // Função para calcular a média
    public static float media(float n1, float n2, float n3, float n4, float n5) {
        return (n1 + n2 + n3 + n4 + n5) / 5;
    }

    // Função para encontrar o maior número
    public static float maior(float n1, float n2, float n3, float n4, float n5) {
        float maior = n1;

        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }
        if (n4 > maior) {
            maior = n4;
        }
        if (n5 > maior) {
            maior = n5;
        }

        return maior;
    }

    // Função para encontrar o menor número
    public static float menor(float n1, float n2, float n3, float n4, float n5) {
        float menor = n1;

        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        if (n4 < menor) {
            menor = n4;
        }
        if (n5 < menor) {
            menor = n5;
        }

        return menor;
    }
}