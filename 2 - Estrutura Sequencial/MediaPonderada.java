/*  5 - Faça um algoritmo que leia duas notas, 
    calcule e mostre a média ponderada dessas 
    notas, sabendo que os pesos devem ser dados 
    pelo usuário. 
*/
import java.util.Scanner;
public class MediaPonderada {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //variaveis
        double peso1, peso2, nota1, nota2, media;

        System.out.println("informe os pesos da prova 1 e da prova 2.");
        peso1 = reader.nextDouble();
        peso2 = reader.nextDouble();

        System.out.println("agora informe as notas das provas");
        nota1 = reader .nextDouble();
        nota2 = reader .nextDouble();

        media = nota1*peso1+nota2*peso2 / (peso1 + peso2);

        System.out.println("media final: " + media);

    }
}