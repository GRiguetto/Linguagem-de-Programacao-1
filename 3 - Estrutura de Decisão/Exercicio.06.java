import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia um número e, se ele for positivo, imprima seu inverso;
        // caso contrário, imprima seu quadrado inverso.

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            double inverso = -1 * numero;
            System.out.println("O inverso do número é: " + inverso);
        } else {
            double inverso2 = -1 * numero;
            double quadrado = Math.pow(inverso2, 2);
            System.out.println("O quadrado do inverso é: " + quadrado);
        }
    }
}