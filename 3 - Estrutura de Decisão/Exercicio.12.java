//Faça um algoritmo para calcular a conta de energia elétrica de uma casa. O valor de cada KWH é 1.5. Quando a casa é de uma aposentada, a conta tem um desconto de 15%
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de KWH consumidos: ");
        double kwhConsumido = scanner.nextDouble();

        System.out.print("A pessoa é aposentada? (true/false): ");
        boolean aposentado = scanner.nextBoolean();

        if (kwhConsumido < 0) {
            System.err.println("Por favor, informe um valor válido para o consumo em KWH.");
        } else {
            double contaEnergia = calcularContaEnergia(kwhConsumido, aposentado);
            System.out.printf("A conta de energia é: R$ %.2f%n", contaEnergia);
        }

        scanner.close();
    }

    private static double calcularContaEnergia(double kwhConsumido, boolean aposentado) {
        double valorPorKWH = 1.5;
        double totalConta = kwhConsumido * valorPorKWH;

        if (aposentado) {
            double desconto = 0.15;
            totalConta -= totalConta * desconto;
        }

        return totalConta;
    }
}