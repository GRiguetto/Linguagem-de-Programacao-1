// 29 - Faça um algoritmo que leia o ano de nascimento de uma pessoa e o ano atual, calcule e mostre: 
// - A idade dessa pessoa em anos; 
// - A idade dessa pessoa em meses; 
// - A idade dessa pessoa em dias; 
// - A idade dessa pessoa em semanas. 

import java.util.Scanner;

public class CalculoIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idadeAnos = anoAtual - anoNascimento;
        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeAnos * 365;
        int idadeSemanas = idadeAnos * 52;

        System.out.println("Idade em anos: " + idadeAnos + " anos");
        System.out.println("Idade em meses: " + idadeMeses + " meses");
        System.out.println("Idade em dias: " + idadeDias + " dias");
        System.out.println("Idade em semanas: " + idadeSemanas + " semanas");

        scanner.close();
    }
}