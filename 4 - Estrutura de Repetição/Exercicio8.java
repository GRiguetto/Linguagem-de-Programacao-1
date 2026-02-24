import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // Faça um algoritmo para ler cinco números e imprimir o cubo e o quadrado de cada um deles

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        double n1q = Math.pow(n1, 2);
        double n1c = Math.pow(n1, 3);

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        double n2q = Math.pow(n2, 2);
        double n2c = Math.pow(n2, 3);

        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();
        double n3q = Math.pow(n3, 2);
        double n3c = Math.pow(n3, 3);

        System.out.print("Digite o quarto número: ");
        double n4 = scanner.nextDouble();
        double n4q = Math.pow(n4, 2);
        double n4c = Math.pow(n4, 3);

        System.out.print("Digite o quinto número: ");
        double n5 = scanner.nextDouble();
        double n5q = Math.pow(n5, 2);
        double n5c = Math.pow(n5, 3);

        System.out.println("Primeiro número");
        printResultado(n1, n1q, n1c);

        System.out.println("Segundo número");
        printResultado(n2, n2q, n2c);

        System.out.println("Terceiro número");
        printResultado(n3, n3q, n3c);

        System.out.println("Quarto número");
        printResultado(n4, n4q, n4c);

        System.out.println("Quinto número");
        printResultado(n5, n5q, n5c);
    }

    public static void printResultado(double numero, double quadrado, double cubo) {
        System.out.println("Número: " + numero);
        System.out.println("Ao quadrado: " + quadrado);
        System.out.println("Ao cubo: " + cubo + "\n");
    }
}