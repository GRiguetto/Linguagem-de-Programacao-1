// 3 - Faça um algoritmo para calcular o cubo e o quadrado de todos os números
// pertencentes a um intervalo, incluindo o limite superior e inferior (utilize
// uma função criada por você que retorne o valor do cubo e do quadrado do número). 

import java.util.Scanner;

public class CalculoCuboQuadrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite inferior do intervalo:");
        int limiteInferior = scanner.nextInt();

        System.out.println("Digite o limite superior do intervalo:");
        int limiteSuperior = scanner.nextInt();

        System.out.println("Cubo e quadrado dos números no intervalo [" + limiteInferior + ", " + limiteSuperior + "]:");
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            int quadrado = calcularQuadrado(i);
            int cubo = calcularCubo(i);

            System.out.println("Número: " + i + ", Quadrado: " + quadrado + ", Cubo: " + cubo);
        }

        scanner.close();
    }

    // Função para calcular o quadrado de um número
    public static int calcularQuadrado(int numero) {
        return numero * numero;
    }

    // Função para calcular o cubo de um número
    public static int calcularCubo(int numero) {
        return numero * numero * numero;
    }
}