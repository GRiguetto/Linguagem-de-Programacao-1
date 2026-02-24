//16 - Escreva um algoritmo que solicite ao usuário a altura e o raio de um cilindro circular e imprima o volume do cilindro. 
// O volume do cilindro circular é calculado pela seguinte formula: 
// - volume ← 3.141592 * raio * raio * altura 

import java.util.Scanner;

public class Ex13Scanner
{

    public static void main(String[] args)
    {
        float altura;
        float raio;
        float volume;
        final float PI = 3.141592f;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a altura do cilindro:");
        altura = input.nextFloat();

        System.out.println("Digite o raio do cilindro:");
        raio = input.nextFloat();

        volume = PI * raio * raio * altura;

        System.out.println("\n\nO volume do cilindro é de: " + volume);

        input.close();

    }
}