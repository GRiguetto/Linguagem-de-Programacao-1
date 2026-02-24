// 15 - Desenvolva um algoritmo para calcular o montante resultante de um capital aplicado a juros compostos.
// Você deve pedir o capital (C), a taxa de juros (I) e o tempo (N). Com essas variáveis, você deve calcular o montante (M) pela fórmula: 
// - M ← C * (1 + (I / 100)) ^ N 

import java.util.Scanner;

public class Ex12Scanner
{

    public static void main(String[] args)
    {
        float capital;
        float taxaJuros;
        float tempo;
        float montante;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o capital:");
        capital = input.nextFloat();

        System.out.println("Digite a taxa de juros (em %):");
        taxaJuros = input.nextFloat();

        System.out.println("Digite o tempo:");
        tempo = input.nextFloat();

        montante = capital * (float) Math.pow((1 + (taxaJuros / 100)), tempo);

        System.out.printf("\n\nO montante final é, em R$, de: %.2f", montante);
    }
}