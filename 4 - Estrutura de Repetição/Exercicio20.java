public class Exercicio20 {
    public static void main(String[] args) {
        // Fazer um programa que calcule e escreva o valor de S.
        // S = 37*38/1 + 36*37/2 + 35*36/3 + ... + 1*2/37

        double S = 0.0;

        for (int i = 1; i < 38; i++) {
            double termo = (37 - i + 1.0) * (37 - i + 2.0) / i;
            S += termo;
        }

        System.out.println("O valor de S é: " + S);
    }
}