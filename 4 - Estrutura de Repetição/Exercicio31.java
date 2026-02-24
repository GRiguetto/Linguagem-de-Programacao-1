import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
// Suponha que serão digitados 100 números inteiros via teclado, faça um algoritmo para: 
// · Somar os números positivos 
// · Contar os números negativos. 
// · A média dos números negativos e a média dos números positivos. 
// · A diferença entre o total de números positivos e negativos
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 100;
        int somaPositivos = 0;
        int contNegativos = 0;
        int somaNegativos = 0;

        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                somaPositivos += numero;
            } else if (numero < 0) {
                contNegativos++;
                somaNegativos += numero;
            }
        }

        scanner.close();

        double mediaPositivos = somaPositivos / (double) totalNumeros;
        double mediaNegativos = contNegativos > 0 ? somaNegativos / (double) contNegativos : 0;

        System.out.println("Soma dos números positivos: " + somaPositivos);
        System.out.println("Total de números negativos: " + contNegativos);
        System.out.println("Média dos números positivos: " + mediaPositivos);
        System.out.println("Média dos números negativos: " + mediaNegativos);
        System.out.println("Diferença entre total de positivos e negativos: " + (somaPositivos - somaNegativos));
    }
}