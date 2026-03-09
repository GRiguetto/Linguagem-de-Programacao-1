// 1 - Faça um algoritmo para ler um número, somá-lo com o valor 10 e mostrar a média entre este número e o valor 10.

import java.util.Scanner;

public class Ex1Scanner {

    public static void main(String[] args) {
        float numero, media;

        Scanner reader = new Scanner(System.in);
        System.out.println("Escreva um número inteiro:");
        numero = reader.nextFloat();

        media = numero/2;

        System.out.println("O valor final é " + media);

        reader.close();
    }
}