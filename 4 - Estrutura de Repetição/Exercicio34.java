// Repita o exercício anterior para um total de 1000 pessoas do sexo masculino, ou seja, o algoritmo só irá fazer a computação dos valores se a pessoa for do sexo masculino. No final do exercício, imprima também quantas pessoas não são do sexo masculino

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 0;
        int totalMasculino = 0;
        int totalNaoMasculino = 0;
        int totalIdade = 0;
        int idadeMaisVelha = Integer.MIN_VALUE;
        int idadeMaisNova = Integer.MAX_VALUE;
        double alturaTotal = 0;
        double pesoTotal = 0;

        for (int i = 0; i < 1000; i++) {
            System.out.println("\nInforme os dados para a pessoa " + (i + 1) + ":");
            
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            if (Character.toUpperCase(sexo) == 'M') {
                totalMasculino++;

                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                totalIdade += idade;

                if (idade > idadeMaisVelha) {
                    idadeMaisVelha = idade;
                }

                if (idade < idadeMaisNova) {
                    idadeMaisNova = idade;
                }

                System.out.print("Altura: ");
                double altura = scanner.nextDouble();
                alturaTotal += altura;

                System.out.print("Peso: ");
                double peso = scanner.nextDouble();
                pesoTotal += peso;
            } else {
                totalNaoMasculino++;
            }
        }

        scanner.close();

        if (totalMasculino > 0) {
            double mediaIdade = (double) totalIdade / totalMasculino;
            double mediaAltura = alturaTotal / totalMasculino;
            double mediaPeso = pesoTotal / totalMasculino;

            System.out.println("\nResultados para pessoas do sexo masculino:");
            System.out.println("Média de Idade: " + mediaIdade);
            System.out.println("Idade da pessoa mais velha: " + idadeMaisVelha);
            System.out.println("Idade da pessoa mais nova: " + idadeMaisNova);
            System.out.println("Média de Altura: " + mediaAltura);
            System.out.println("Média de Peso: " + mediaPeso);

            System.out.println("\nTotal de pessoas não do sexo masculino: " + totalNaoMasculino);
        } else {
            System.out.println("\nNenhuma pessoa do sexo masculino foi informada.");
        }
    }
}