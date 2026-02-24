import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        // Faça um algoritmo para calcular a tabuada de um número informado pelo usuário.
        // O usuário, se a tabuada do 5 for selecionada, deverá visualizar o seguinte resultado:
        // 5 x 1 = 5, ...., 5 x 10 = 50. Por fim, o algoritmo deverá calcular e imprimir a soma de todos os valores resultantes dos cálculos.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular a tabuada: ");
        int numero = scanner.nextInt();

        calcularTabuada(numero);
    }

    public static void calcularTabuada(int numero) {
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

            soma += resultado;
        }

        System.out.println("A soma dos valores é " + soma);
    }
}