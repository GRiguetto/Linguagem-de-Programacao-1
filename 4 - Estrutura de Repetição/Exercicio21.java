public class Exercicio21 {
    public static void main(String[] args) {
        // Faça um programa que calcule e escreva o valor de S.
        // S = 1/1 + 3/2 + 5/3 + ... + 99/50

        double S = 0.0;

        for (int numerador = 1; numerador < 100; numerador += 2) {
            int divisor = numerador / 2 + 1;
            double termo = (double) numerador / divisor;
            S += termo;
        }

        System.out.println("O valor de S é igual a " + S + ".");
    }
}