/*  8 - Faça um programa para calcular o cubo
    de um número informado pelo usuário.
    Em seguida, faça a diferença desse resultado com o número lido. 
*/
import java.util.Scanner;

public class Ex6Scanner
{

    public static void main(String[] args)
    {   
        Scanner reader = new Scanner(System.in);

        //variaveis 
        long num = 0, cubo = 0 , diferenca = 0;

        System.out.println("Informe um Numero para saber o cubo desse numero");
        num = reader.nextInt();

        cubo = num * num * num;
        diferenca = cubo - num ;

        System.out.println( num  +" ao cubo é = " + cubo);
        System.out.println("A diferença de " + num + " para " + cubo + " é igual á: " + diferenca);



        reader.close();
    }
}