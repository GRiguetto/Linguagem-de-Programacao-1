/*  4 - Faça um algoritmo para ler três números inteiros
    e calcule a multiplicação entre eles. 
*/

import java.util.Scanner;
public class CalculoMultiplicacao {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //variaveis
        int valor1, valor2, valor3, resultado;

        System.out.println("digite os tres valores sem sequencia");
        valor1 = reader.nextInt();
        valor2 = reader.nextInt();
        valor3 = reader.nextInt();

        resultado = valor1 * valor2 * valor3;

        System.out.println(valor1 + " X " + valor2 + " X " + valor3 + " = " + resultado);
        reader.close();
    }
}