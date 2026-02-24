import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia um número e imprima se ele é positivo, negativo ou nulo.

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("O número é Positivo");
        }

        if (numero < 0) {
            System.out.println("O número é Negativo");
        }

        if (numero == 0) {
            System.out.println("O número é Nulo");
        }
    }
}