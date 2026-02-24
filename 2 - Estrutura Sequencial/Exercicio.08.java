// 8 - Faça um programa para calcular o cubo de um número informado pelo usuário. Em seguida, faça a diferença desse resultado com o número lido. 

import java.util.Scanner;

public class Ex6Scanner
{

    public static void main(String[] args)
    {
        int num;
        int cuboNum;
        int diferenca;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        num = input.nextInt();

        cuboNum = num * num * num;

        diferenca = cuboNum - num;

        System.out.println("\n\nNúmero lido: " + num);
        System.out.println("Cubo do número: " + cuboNum);
        System.out.println("Diferença: " + diferenca);
        
        input.close();
    }
}