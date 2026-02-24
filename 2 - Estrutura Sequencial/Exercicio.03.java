// 3 - Faça um algoritmo para ler dois números e fazer a troca dos valores digitados pelo usuário. Após a troca, imprima os novos valores obtidos. 

import java.util.Scanner;

public class Ex3Scanner {

    public static void main(String[] args) {

        int valor1, valor2, valorTemporario;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor 1:");
        valor1 = input.nextInt();

        System.out.println("Digite o valor 2:");
        valor2 = input.nextInt();

        valorTemporario = valor1;
        valor1 = valor2;
        valor2 = valorTemporario;

        System.out.println("Após a troca:");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);

        input.close();
    }
}