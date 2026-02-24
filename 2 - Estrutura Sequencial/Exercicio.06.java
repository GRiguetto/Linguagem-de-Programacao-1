// 6 - Faça um algoritmo para ler dois números e realizar as operações aritméticas: adição, subtração e multiplicação, imprimindo o resultado para cada operação. 

import java.util.Scanner;

public class Ex4Scanner
{

    public static void main(String[] args)
    {

        float num1, num2, numsAdicao, numsSubtracao, numsMultiplicacao;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        num1 = input.nextFloat();

        System.out.println("Digite o segundo número:");
        num2 = input.nextFloat();

        numsAdicao = num1 + num2;
        numsSubtracao = num1 - num2;
        numsMultiplicacao = num1 * num2;

        System.out.println("Adição: " + numsAdicao);
        System.out.println("Subtração: " + numsSubtracao);
        System.out.println("Multiplicação: " + numsMultiplicacao);
        
        input.close();
    }
}