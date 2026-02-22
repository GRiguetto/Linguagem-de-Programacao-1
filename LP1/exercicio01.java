/*Faça um programa que recebe uma quantidade inderteminada  de notas de alunos, calcule e mostre
    - A Maior e Menor Nota
    - As Media Geral 
    - o Nome do aluno que tirou a menor nota e do que tirou a maior nota
    - Qtd de Alunos que tirou abaixo de 6
    - Nome e Nota de Todos Alunos
*/


import java.util.Scanner;
import java.util.ArrayList;

public class exercicio01{

    public static void main(String [] ARGS){

        Scanner reader = new Scanner(System.in);

        //variaveis
        Double Nota, MaiorNota, MenorNota, SomaNota, MediaGeral;
        String Nome, NomeMenor, NomeMaior, Lista;
        int ContNota, ContAbaixo6;
        char Resposta;

        ArrayList<String> Nomes = new ArrayList<String>();
        ArrayList<Double> Notas = new ArrayList<Double>();


        MaiorNota=-1.0;
        MenorNota=11.0;
        ContNota=0;
        ContAbaixo6=0;
        SomaNota=0.0;
        MediaGeral=0.0;
        NomeMaior="";
        NomeMenor="";
        Lista="";

        do{
           System.out.println("\ndigite o nome do aluno para Continuar");
           Nome = reader.next();

           do{
            System.out.println("digite a Nota Geral do(a) "+Nome);
            Nota =reader.nextDouble();
            if(Nota < 0 || Nota > 10){
                System.out.println("Valor invalido digite novamente.");
            }
           }while(Nota < 0 || Nota > 10);
            
            if(Nota<MenorNota){
                MenorNota=Nota;
                NomeMenor=Nome;
            }
            if(Nota > MaiorNota){
                MaiorNota=Nota;
                NomeMaior=Nome;
            }

            if (Nota < 6){
                ContAbaixo6++;
            }

            ContNota++;
            SomaNota= SomaNota+Nota;
            

            Nomes.add(Nome);
            Notas.add(Nota);
            
           System.out.println("Deseja continuar digitando notas? (s/n)");
           Resposta = reader.next().charAt(0); 

           //Concatenação sem usar array
           Lista =Lista +"\n"+ " " + ContNota + " " + Nome + " " + Nota;

        }while(Resposta != 'n' && Resposta != 'N');

        MediaGeral = SomaNota/ContNota;

        System.out.println("O(a) " + NomeMaior + " Teve a maior Nota que foi: " + MaiorNota);
        System.out.println("O(a) " + NomeMenor + " Teve a menor Nota que foi: " + MenorNota);
        System.out.println("A media Geral da Sala foi: " + MediaGeral);
        System.out.println("A quantidade de alunos que tiraram abaixo de 6 foi: " + ContAbaixo6);

        //array list
        System.out.println("Lista de Todos os Alunos");
        for(int i=0; i < ContNota;i++){
            System.out.println(Nomes.get(i) + "   " + Notas.get(i));
        }

        System.out.println(Lista);

        

    }

    
}
