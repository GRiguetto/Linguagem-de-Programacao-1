//17 - Faça o cálculo da área de um retângulo a partir dos valores de base e de altura introduzidos pelo usuário. 

import java.util.Scanner;

public class Ex14Scanner
{

    public static void main(String[] args)
    {
        float base;
        float altura;
        float area;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a base do retângulo:");
        base = input.nextFloat();

        System.out.println("Digite a altura do retângulo:");
        altura = input.nextFloat();

        area = base * altura;

        System.out.println("\n\nA área do retângulo é de " + area);

        input.close();
    }
}