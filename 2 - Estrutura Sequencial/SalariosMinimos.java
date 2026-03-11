/*  10 - Faça um algoritmo que receba o valor
    do salário mínimo, o salário do funcionário,
    calcule e mostre a quantidade de salários mínimos
    que esse funcionário recebe. 
*/
import java.util.Scanner;

public class SalariosMinimos {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //constante

        final double SALARIO_MINIMO = 1621.00;

        //variaveis

        double salario = 0;
        int contSal = 0;

        System.out.println("Informe seu salario");
        salario = reader.nextDouble();

        do{
            salario = salario - SALARIO_MINIMO;
            contSal ++;

        }while(salario > 0 );

        System.out.println("seu salario é "+ contSal + " veze maior que o salario minimo ("+SALARIO_MINIMO+") e ainda sobra :" +salario );

        reader.close();
    }
}