/*  6 - Faça um algoritmo para ler dois números
    e realizar as operações aritméticas:
    adição, subtração e multiplicação, imprimindo o resultado
    para cada operação. 
*/

import java.util.Scanner;
public class Ex4Scanner
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        //variaveis
        float num1, num2, resultado;

        System.out.println("digite os dois numeros");
        num1 = reader.nextFloat(); 
        num2 = reader.nextFloat();
        
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " X " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));

        reader.close();
    }
}