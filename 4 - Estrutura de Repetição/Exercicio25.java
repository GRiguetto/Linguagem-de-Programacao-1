import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        // Escrever um algoritmo que leia 10 valores, um de cada vez, e conte quantos
        // deles estão no intervalo [10,20] e quantos deles estão fora do intervalo,
        // escrevendo estas informações.

        Scanner scanner = new Scanner(System.in);
        int dentroIntervalo = 0;
        int foraIntervalo = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            double valor = scanner.nextDouble();

            if (valor >= 10 && valor <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }

        System.out.println("Valores dentro do intervalo [10, 20]: " + dentroIntervalo);
        System.out.println("Valores fora do intervalo [10, 20]: " + foraIntervalo);
    }
}