import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        // Faça um algoritmo para calcular o cubo e o quadrado de todos os números pertencentes a um intervalo, incluindo o limite superior e inferior

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite inferior do intervalo: ");
        double limiteInferior = scanner.nextDouble();

        System.out.print("Digite o limite superior do intervalo: ");
        double limiteSuperior = scanner.nextDouble();

        calcularCuboQuadradoNoIntervalo(limiteInferior, limiteSuperior);
    }

    public static void calcularCuboQuadradoNoIntervalo(double limiteInferior, double limiteSuperior) {
        for (double i = limiteInferior; i <= limiteSuperior; i++) {
            double quadrado = calcularQuadrado(i);
            double cubo = calcularCubo(i);

            System.out.println("Número: " + i);
            System.out.println("Quadrado: " + quadrado);
            System.out.println("Cubo: " + cubo + "\n");
        }
    }

    public static double calcularQuadrado(double numero) {
        return numero * numero;
    }

    public static double calcularCubo(double numero) {
        return numero * numero * numero;
    }
}