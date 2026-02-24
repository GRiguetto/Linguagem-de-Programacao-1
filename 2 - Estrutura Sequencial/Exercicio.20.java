// 20 - Você foi contratado por uma loja de eletrônicos para fazer um algoritmo que calcule a conversão de dólares para real.
// Sabe-se que o programa deverá ler a cotação do dólar do dia e o valor a ser convertido. 

import java.util.Scanner;

public class Ex18Scanner
{

    public static void main(String[] args)
    {
        float dolarDiario;
        float dinheiroReal;
        float dinheiroDolar;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o valor do dólar hoje?");
        dolarDiario = input.nextFloat();
        System.out.println("Qual a quantidade em US$?");
        dinheiroDolar = input.nextFloat();

        dinheiroReal = dinheiroDolar * dolarDiario;

        System.out.printf("\n\nUS$%.2f correspondem a R$%.2f", dinheiroDolar, dinheiroReal);
    }
}