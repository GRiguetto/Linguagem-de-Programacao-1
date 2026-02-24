// // 23 - Um sistema de equações lineares do tipo: 
// ax + by = c 
// dx + ey = f 
// pode ser resolvido segundo mostrado abaixo: 
// y=af−cdae−bd x=ce−bfae−bd
// Faça um programa que leia os coeficientes a, b, c, d, e, f, calcule e imprima os valores de x e y. 

import java.util.Scanner;

public class Ex21Scanner
{

    public static void main(String[] args)
    {
        int a, b, c, d, e, f, x, y;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite, em ordem, os coeficientes a, b, c, d, e, f:");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();
        f = input.nextInt();

        y = ((a * f) - (c * d)) / ((a * e) - (b * d));
        x = ((c * e) - (b * f)) / ((a * e) - (b * d));

        System.out.println("\n\nx = " + x + "\ny = " + y);
    }
}