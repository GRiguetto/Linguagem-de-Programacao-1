public class Exercicio7 {
    public static void main(String[] args) {
        // Elabore um algoritmo para calcular a soma dos números ímpares de 1000 a 10.

        System.out.println("Este programa vai somar todos os números ímpares entre 1000 e 10\n");

        int soma = 0;

        for (int i = 1000; i >= 10; i--) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println("A soma de todos os números ímpares entre 1000 e 10 é: " + soma);
    }
}