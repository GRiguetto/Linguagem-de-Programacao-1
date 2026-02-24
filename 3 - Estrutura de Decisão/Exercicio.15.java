//Faça um algoritmo para calcular o valor da conta de energia elétrica de uma casa, considerando a tabela a seguir. A conta deve ser calculada proporcionalmente, ou seja, se o usuário gastou 55 kWh ele pagará 50 kWh ao preço de R$ 1,00 e 5 ao preço de R$ 1,30. (L2 – ex.13) 

// kWh 	Valor  
// 0 - 50 	R$ 1,00 
// 51 - 100 	R$ 1,30 
// 101 - 150 	R$ 1,60 
// Acima de 150 	R$ 2,00
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de kWh consumidos: ");
        double kwh = scanner.nextDouble();

        double valorConta = calcularConta(kwh);

        System.out.printf("O valor da conta de energia é R$ %.2f%n", valorConta);

        scanner.close();
    }

    private static double calcularConta(double kwh) {
        if (kwh <= 50) {
            return kwh * 1.00;
        } else if (kwh <= 100) {
            return (50 * 1.00) + ((kwh - 50) * 1.30);
        } else if (kwh <= 150) {
            return (50 * 1.00) + (50 * 1.30) + ((kwh - 100) * 1.60);
        } else {
            return (50 * 1.00) + (50 * 1.30) + (50 * 1.60) + ((kwh - 150) * 2.00);
        }
    }
}