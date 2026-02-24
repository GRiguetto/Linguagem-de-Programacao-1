// 24 - Faça um programa que leia os valores A, B, C, D, E, F e encontre o valor de X de acordo com a equação abaixo:
// X=A+BCD−2∗EF+4A

import java.util.Scanner;

public class Ex22Scanner
{

    public static void main(String[] args)
    {
        float a, b, c, d, e, f, x;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite, em sequência, os valores de a, b, c, d, e, f.");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        d = input.nextFloat();
        e = input.nextFloat();
        f = input.nextFloat();

        x = ((a + (b / c)) / (d - (2 * (e / f)))) + (4 * a);

        System.out.println("O valor de x é " + x);
    }
}