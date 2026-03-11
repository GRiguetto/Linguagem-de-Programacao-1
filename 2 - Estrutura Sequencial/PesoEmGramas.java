/*  9 - Faça um algoritmo que leia o peso
    de uma pessoa em quilo, calcule e mostre
    o peso em gramas.
*/
import java.util.Scanner;

public class PesoEmGramas {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //variaveis
        double kilos = 0.0 , gramas = 0.0;

        System.out.println("informe seu peso em kilos");
        kilos = reader.nextDouble();

        gramas = kilos *1000;

        System.out.println("Seu peso em gramas é: " + gramas);

        reader.close();
    }
}