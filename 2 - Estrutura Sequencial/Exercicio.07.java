// 7 - Faça um algoritmo que leia um número inteiro e imprima seu dobro e sua metade. 

import java.util.Scanner;

public class Ex5Scanner
{

    public static void main(String[] args)
    {

        int num1, dobro, metade;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        num1 = input.nextInt();

        dobro = num1 * 2;
        metade = num1 / 2;
        // metade = (float) num1 / 2;

        System.out.println("Dobro: " + dobro);
        System.out.println("Metade: " + metade);
        
        input.close();
    }
}