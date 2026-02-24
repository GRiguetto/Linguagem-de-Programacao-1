// 4 - Faça um algoritmo para ler três números inteiros e calcule a multiplicação entre eles. 

import java.util.Scanner;

public class CalculoMultiplicacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int numero3 = scanner.nextInt();

        int resultado = numero1 * numero2 * numero3;

        System.out.println("O resultado da multiplicação é: " + resultado);

        scanner.close();
    }
}