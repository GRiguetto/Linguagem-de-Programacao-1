//14 - Desenvolva um programa para calcular o salário líquido de um funcionário. O programa deve: 
// - Pedir o salário bruto do funcionário; 
// - Calcular o valor do IR com alíquota de 10%; 
// - Calcular o valor do INSS com alíquota de 5%; 
// - Calcular o salário líquido do funcionário. 

import java.util.Scanner;

public class Ex11Scanner
{

    public static void main(String[] args)
    {
        float salarioBruto;
        float valorIR;
        float valorINSS;
        float salarioLiquido;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o salário bruto:");
        salarioBruto = input.nextFloat();

        valorIR = salarioBruto * 0.1f;

        valorINSS = salarioBruto * 0.05f;

        salarioLiquido = salarioBruto - valorIR - valorINSS;

        System.out.printf("\n\nO salário líquido, em R$, é de: %.2f", salarioLiquido);

        input.close();
    }
}