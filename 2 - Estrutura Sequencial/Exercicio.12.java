// // 12 - Desenvolva um algoritmo que: 
// - Peça o valor do produto; 
// - Peça o valor da alíquota; 
// - Calcule o valor em reais da porcentagem informada. 

import java.util.Scanner;

public class Ex9Scanner
{

    public static void main(String[] args)
    {
        float valorProduto;
        float aliquota;
        float porcentagem;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        valorProduto = input.nextFloat();

        System.out.println("Digite o valor da alíquota (em %): ");
        aliquota = input.nextFloat();

        porcentagem = valorProduto * (aliquota / 100);

        System.out.printf("\n\nO valor em reais da porcentagem informada é: %.2f", porcentagem);

        input.close();
    }
}