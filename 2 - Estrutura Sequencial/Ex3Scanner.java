/*  3 - Faça um algoritmo para ler dois números e fazer a 
troca dos valores digitados pelo usuário. Após a troca, 
imprima os novos valores obtidos. 
*/

import java.util.Scanner;

public class Ex3Scanner {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        //variaveis
        int valor1, valor2, transição;

        System.out.println("\nDigite o 1° valor: ");
        valor1 = reader.nextInt();

        System.out.println("\nDigite o 2° valor: ");
        valor2 = reader.nextInt();

        System.out.println("\nfazendo a transição dos valores");
        transição = valor1;

        System.out.println("\nTransição recebeu " + valor1);
        valor1 = valor2;

        System.out.println("\nvalor 1 recebe " + valor2);
        valor2 = transição;
        
        System.out.println("\nvalor 2 recebe " + transição);

        System.out.println("\nValores final");
        System.out.println("Valor 1 = " + valor1);
        System.out.println("Valor 2 = " + valor2);
        
        reader.close();

    }
}