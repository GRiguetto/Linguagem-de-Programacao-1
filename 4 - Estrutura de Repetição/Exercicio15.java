import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        // Faça um algoritmo para imprimir a quantidade de números ímpares entre um intervalo especificado pelo usuário

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inferior: ");
        int nInferior = scanner.nextInt();

        System.out.print("Digite o número superior: ");
        int nSuperior = scanner.nextInt();

        int qtdNum = 0;

        if (nSuperior <= nInferior) {
            System.out.println("Intervalo inválido");
        } else {
            for (int i = nInferior; i <= nSuperior; i++) {
                if (i % 2 != 0) {
                    qtdNum++;
                }
            }
            System.out.println(qtdNum);
        }
    }
}