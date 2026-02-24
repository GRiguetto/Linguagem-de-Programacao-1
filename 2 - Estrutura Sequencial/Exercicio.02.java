// 2 - Faça um algoritmo para ler quatro notas e imprimir a média ponderada dessas notas. Considere que os pesos das notas são: 1, 2, 3 e 4, respectivamente. 

import java.util.Scanner;


public class Ex2Scanner {

    public static void main(String[] args)
    {
        float nota1, nota2, nota3, nota4, mediaPonderada;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        nota1 = input.nextFloat();

        System.out.println("Digite a segunda nota:");
        nota2 = input.nextFloat();

        System.out.println("Digite a terceira nota:");
        nota3 = input.nextFloat();

        System.out.println("Digite a quarta nota:");
        nota4 = input.nextFloat();

        mediaPonderada = (1 * nota1 + 2 * nota2 + 3 * nota3 + 4 * nota4) / (1 + 2 + 3 + 4);
        
        System.out.println("Média ponderada: " + mediaPonderada);
        
        input.close();
    }
}