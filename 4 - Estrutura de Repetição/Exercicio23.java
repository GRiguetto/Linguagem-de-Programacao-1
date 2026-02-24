import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        // Faça um programa que calcule a soma dos números pares e ímpares
        // a partir de um valor inicial e final informados pelos usuários.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Informe o valor final: ");
        int valorFinal = scanner.nextInt();

        calcularSoma(valorInicial, valorFinal);
    }

    public static void calcularSoma(int valorInicial, int valorFinal) {
        if (valorInicial > valorFinal) {
            System.out.println("Intervalo inválido. O valor inicial deve ser menor ou igual ao valor final.");
            return;
        }

        int somaPares = 0;
        int somaImpares = 0;

        for (int i = valorInicial; i <= valorFinal; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            } else {
                somaImpares += i;
            }
        }

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
    }
}