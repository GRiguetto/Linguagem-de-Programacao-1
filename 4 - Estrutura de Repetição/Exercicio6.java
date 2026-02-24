public class Exercicio6 {
    public static void main(String[] args) {
        // Elabore um algoritmo para calcular a soma dos números ímpares de 0 a 100.

        System.out.println("Este programa vai somar todos os números ímpares entre 0 e 100\n");

        int soma = 0;

        for (int i = 1; i <= 100; i += 2) {
            soma += i;
        }

        System.out.println("A soma dos números ímpares de 0 a 100 é: " + soma);
    }
}