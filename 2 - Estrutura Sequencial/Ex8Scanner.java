// 11 - Desenvolva um algoritmo que: 
// - Peça o ano de nascimento; 
// - Calcule e mostre a idade em dias. 

import java.util.Scanner;

public class Ex8Scanner
{

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        //constantes
        final int ANO_ATUAL = 2026;
        //variaveis
        int anoNasc = 0, qtdDias = 0;

        System.out.println("informe seu ano de nascimento ");
        anoNasc = reader.nextInt();

        qtdDias = (ANO_ATUAL - anoNasc)*365; 

        System.out.println("A quantidade de dias que voce existe é: " +  qtdDias);



        reader.close();
    }
}