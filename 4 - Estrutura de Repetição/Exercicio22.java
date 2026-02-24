import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        // Faça um programa para escrever os números primos até um número informado pelo usuário.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número limite: ");
        int limite = scanner.nextInt();

        listarPrimos(limite);
    }

    public static boolean ePrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void listarPrimos(int limite) {
        if (limite < 2) {
            System.out.println("Por favor, insira um número válido maior ou igual a 2.");
            return;
        }

        System.out.println("Números primos até " + limite + ":");

        for (int i = 2; i <= limite; i++) {
            if (ePrimo(i)) {
                System.out.println(i);
            }
        }
    }
}