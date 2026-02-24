// 13 - Faça um algoritmo que: 
// - Peça o valor a prazo do produto; 
// - Peça a alíquota (porcentagem) do desconto; 
// - Calcule o preço à vista do produto; 

import java.util.Scanner;

public class Ex10Scanner
{

    public static void main(String[] args)
    {
        float valorPrazo;
        float aliquota;
        float precoVista;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor a prazo do produto:");
        valorPrazo = input.nextFloat();

        System.out.println("Digite a alíquota do desconto (em %):");
        aliquota = input.nextFloat();

        precoVista = valorPrazo - ((aliquota / 100) * valorPrazo);

        System.out.printf("\n\nO preço à vista, em R$ é de: %.2f", precoVista);

        input.close();
    }
}