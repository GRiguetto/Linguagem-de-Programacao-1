// 11 - Desenvolva um algoritmo que: 
// - Peça o ano de nascimento; 
// - Calcule e mostre a idade em dias. 

import java.util.Scanner;

public class Ex8Scanner
{

    public static void main(String[] args)
    {
        int anoNasc;
        int idadeDias;
        int idade;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o ano de nascimento?");
        anoNasc = input.nextInt();

        idade = 2023 - anoNasc;
        idadeDias = idade * 365;

        System.out.println("\n\nIdade: " + idade);
        System.out.println("Idade em dias: " + idadeDias);

        input.close();
    }
}