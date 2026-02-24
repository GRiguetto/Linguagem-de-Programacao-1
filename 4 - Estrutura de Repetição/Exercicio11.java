import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        // Faça um algoritmo para ler 100 números, calcular a soma dos números, a média e o maior e menor número encontrados

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[100];

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextDouble();
        }

        calcularEExibirEstatisticas(numeros);
    }

    public static void calcularEExibirEstatisticas(double[] numeros) {
        double soma = 0;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 0; i < numeros.length; i++) {
            double numero = numeros[i];

            soma += numero;

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        double media = soma / numeros.length;

        System.out.println("Resultados");
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior Número: " + maior);
        System.out.println("Menor Número: " + menor);
    }
}