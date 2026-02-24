//Faça um algoritmo para calcular o valor da conta de água, considerando a seguinte tabela de gastos: 

// m³ 	Valor de cada m³ 
// 0 - 10 	R$ 1,20 
// 11 - 20 	R$ 1,50 
// Acima de 20 	R$ 2,00
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor consumido em m³: ");
        double consumo = scanner.nextDouble();

        double valorTotal = 0.0;

        if (consumo > 20) {
            valorTotal = (consumo - 20) * 2 + 10 * 1.5 + 10 * 1.2;
        } else if (consumo > 10 && consumo <= 20) {
            valorTotal = (consumo - 10) * 1.5 + 10 * 1.2;
        } else {
            valorTotal = consumo * 1.2;
        }

        System.out.println("Valor total da conta de água: R$ " + valorTotal);

        scanner.close();
    }
}