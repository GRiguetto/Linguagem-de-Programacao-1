//Um comerciante está necessitando saber qual é o lucro de cada mercadoria vendida em sua loja. Para isso, está necessitando de um programa que permite informar o valor de custo e de venda de um produto, e imprima uma mensagem considerando a tabela a seguir: (L2 – ex.16)
//  Lucro 	Mensagens 
//  Inferior a 10% 	“Lucro baixo” 
//  Entre 10% e 20% 	“Lucro médio” 
//  Acima de 20% 	“Lucro alto”
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de custo do produto: ");
        double valorCusto = scanner.nextDouble();

        System.out.print("Digite o valor de venda do produto: ");
        double valorVenda = scanner.nextDouble();

        double lucroPercentual = ((valorVenda - valorCusto) / valorCusto) * 100;

        String mensagem;

        if (lucroPercentual < 10) {
            mensagem = "Baixo Lucro";
        } else if (lucroPercentual <= 20) {
            mensagem = "Lucro Médio";
        } else {
            mensagem = "Lucro Alto";
        }

        System.out.println("Mensagem: " + mensagem);

        scanner.close();
    }
}