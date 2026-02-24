
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        // Faça um algoritmo para imprimir uma tabela de conversão entre Dólar e Real. A cotação de um Dólar em real deve ser fornecida pelo usuário. A tabela deve conter até 1000 Dólares
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do Dólar em Reais: ");
        double cotacaoDolarParaReal = scanner.nextDouble();

        System.out.println("Dólares\t\tReais");

        for (int dolares = 1; dolares <= 1000; dolares++) {

            double reais = dolares * cotacaoDolarParaReal;

            System.out.printf("%d\t\t%.2f%n", dolares, reais);
        }

        scanner.close();
    }
}