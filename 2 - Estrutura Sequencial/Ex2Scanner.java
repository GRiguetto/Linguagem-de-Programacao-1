// 2 - Faça um algoritmo para ler quatro notas e imprimir a média ponderada dessas notas. Considere que os pesos das notas são: 1, 2, 3 e 4, respectivamente. 

import java.util.Scanner;


public class Ex2Scanner {

    public static void main(String[] args)
    {
        float nota1, nota2, nota3, nota4, mediaPonderada;

        Scanner reader = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        nota1 =reader.nextFloat();

        System.out.println("Digite a segunda nota:");
        nota2 =reader.nextFloat();

        System.out.println("Digite a terceira nota:");
        nota3 =reader.nextFloat();

        System.out.println("Digite a quarta nota:");
        nota4 =reader.nextFloat();

        mediaPonderada = (nota1 * 1 + nota2 * 2 + nota3 * 3 + nota4 * 4)/10;
        
        System.out.println("Média ponderada: " + mediaPonderada);
        
        reader.close();
    }
}