// 18 - Você foi encarregado de desenvolver o modulo de cálculo da folha de pagamento de uma empresa. O funcionamento do programa deve ser o seguinte:  
// - Peça o nome do empregado; 
// - Peça o salário bruto; 
// - Peça o valor do Imposto de Renda (em R$) a ser descontado; 
// - Peça o valor da previdência (em R$) a ser descontado; 
// - Calcule o valor do salário líquido do empregado; 
// - Informe o salário líquido com a seguinte frase: 
// “Fulano, seu salário líquido é: ......”. 

import java.util.Scanner;

public class Ex16Scanner
{

    public static void main(String[] args)
    {
        String nome;
        float salarioBruto;
        float ir;
        float inss;
        float salarioLiquido;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do empregado:");
        nome = input.nextLine();
        System.out.println("Digite seu salário bruto:");
        salarioBruto = input.nextFloat();
        System.out.println("Digite o valor do Imposto de Renda:");
        ir = input.nextFloat();
        System.out.println("Digite o valor do INSS:");
        inss = input.nextFloat();

        salarioLiquido = salarioBruto - ir - inss;

        System.out.printf("%s, seu salário líquido é de R$%.2f", nome, salarioLiquido);
    }
}