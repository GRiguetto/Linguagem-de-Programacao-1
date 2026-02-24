//19 - Você foi contratado por uma empresa de construção para fazer um programa que calcule o salário líquido dos operários no fim de cada mês.
// Sabe-se que cada operário recebe R$ 3,00 por cada hora trabalhada, e que se desconta 8% do salário bruto para INSS. 

import java.util.Scanner;

public class Ex17Scanner
{

    public static void main(String[] args)
    {
        int horasTrabalhadas;
        float salarioBruto;
        float salarioFinal;

        Scanner input = new Scanner(System.in);

        System.out.println("Quantas horas o funcionário trabalhou no mês?");
        horasTrabalhadas = input.nextInt();

        salarioBruto = horasTrabalhadas * 3;
        salarioFinal = salarioBruto * 0.92f;

        System.out.printf("\n\nO salário final é de R$%.2f", salarioFinal);
    }
}