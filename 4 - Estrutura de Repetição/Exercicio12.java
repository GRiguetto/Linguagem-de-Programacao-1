import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        // Faça um algoritmo para calcular a média de n números informados pelo usuário.
        // Para sair do cálculo, o usuário deverá digitar um número negativo.

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        double numero;
        do {
            System.out.print("Digite um número (digite um número negativo para encerrar): ");
            numero = scanner.nextDouble();

            if (numero >= 0 || Double.isNaN(numero)) {
                numeros.add(numero);
            }
        } while (numero >= 0);

        double media = calcularMedia(numeros);

        System.out.println("Resultado:");
        System.out.println("Números informados: " + numeros);
        System.out.println("Média: " + media);
    }

    public static double calcularMedia(ArrayList<Double> numeros) {
        double soma = 0;

        for (double num : numeros) {
            soma += num;
        }

        return numeros.size() > 0 ? soma / numeros.size() : 0;
    }
}