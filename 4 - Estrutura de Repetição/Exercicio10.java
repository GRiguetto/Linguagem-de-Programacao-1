import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Faça um algoritmo para um intervalo de números informados pelo usuário e calcular, para cada número, a raiz quadrada e sua metade

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite inferior do intervalo: ");
        double limiteInferior = scanner.nextDouble();

        System.out.print("Digite o limite superior do intervalo: ");
        double limiteSuperior = scanner.nextDouble();

        calcularRaizQuadradaEMetadeNoIntervalo(limiteInferior, limiteSuperior);
    }

    public static void calcularRaizQuadradaEMetadeNoIntervalo(double limiteInferior, double limiteSuperior) {
        System.out.println("Resultados:");

        for (double i = limiteInferior; i <= limiteSuperior; i++) {
            double raizQuadrada = calcularRaizQuadrada(i);
            double metade = calcularMetade(i);

            System.out.println("Número: " + i);
            System.out.println("Raiz Quadrada: " + raizQuadrada);
            System.out.println("Metade: " + metade + "\n");
        }
    }

    public static double calcularRaizQuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public static double calcularMetade(double numero) {
        return numero / 2;
    }
}