// 22 - Durante uma viagem à Inglaterra você foi obrigado a comprar um termômetro, e verificou que este estava marcando a temperatura em Fahrenheit.
// Faça um algoritmo para calcular a conversão de graus Celsius para Fahrenheit, tendo que:
// - fahrenheit ← 1.8 * celsius + 32 

import java.util.Scanner;

public class Ex20Scanner
{

    public static void main(String[] args)
    {
        float celsius;
        float fahrenheit;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira a temperatura em ºC:");
        celsius = input.nextFloat();

        fahrenheit = (celsius * 1.8f) + 32;

        System.out.println(celsius + "ºC equivalem a " + fahrenheit + "ºF");
    }
}