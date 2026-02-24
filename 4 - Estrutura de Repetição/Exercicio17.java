import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        // Desenvolva um algoritmo para calcular o fatorial de um número.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long resultado = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }

    public static long calcularFatorial(int numero) {
        if (numero < 0 || numero != (int) numero) {
            return -1; // Fatorial não definido para números negativos ou não inteiros
        }

        if (numero == 0) {
            return 1;
        }

        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}