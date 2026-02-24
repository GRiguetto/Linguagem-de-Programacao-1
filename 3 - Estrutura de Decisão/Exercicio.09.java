import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leia um número e verifique se ele é maior do que 20.
        // Caso afirmativo, imprima a metade desse número.
        // Caso contrário, imprima o seu quadrado.

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero > 20) {
            double metade = numero / 2;
            System.out.println("A metade do número é " + metade);
        } else {
            double quadrado = Math.pow(numero, 2);
            System.out.println("O quadrado do número é " + quadrado);
        }
    }
}