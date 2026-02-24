// 1 - Faça um algoritmo para ler um número, somá-lo com o valor 10 e mostrar a média entre este número e o valor 10.

import java.util.Scanner;

public class Ex1Scanner {

    public static void main(String[] args) {
        float numero, media;

        Scanner input = new Scanner(System.in);
        System.out.println("Escreva um número inteiro:");
        numero = input.nextFloat();

        numero += 10;

        media = (numero + 10) / 2;

        System.out.println("O valor final é " + media);

        input.close();
    }
}