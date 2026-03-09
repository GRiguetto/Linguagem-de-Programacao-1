/*  7 - Faça um algoritmo que leia um número inteiro
    e imprima seu dobro e sua metade. 
*/

import java.util.Scanner;
public class Ex5Scanner
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        //variaveis 
        int num;

        System.out.println("Digite um numero");
        num = reader.nextInt();

        System.out.println("O dobro é = " + (num*2));
        System.out.println("A metade é = " + (num/2));
    }
}