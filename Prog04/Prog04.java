/* Vamos realizar a incrição de equipespara os campeonatos
da escola, desta forma, solicitamos que os alinos informen
amodalidade esportiva que deseja participar e o turno que
os jogos devem acontecer.
Para desenvolver isso, solicite primeiramente 3 modalidades
esportivas e os tres trunos desejados, crie um laço de
repetição que mostre as 3 modalidade, o usuario escolha
uma e posteriormente o usuario podera escolher o turno que
deseja particiar desta modalidade,
Ao final mostrea modalidade mais avontade no respectivo turno
*/

import java.util.Scanner;
public class Prog04 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //Variaveis
        String modalidade = "";
        String turno      = "";
        String lista      = "";
        char continuar;
        String ModOpcao, TurOpcao;
        int cont = 0;

        try{
            
            do{

                do{
                    System.out.println("Informe a modalidade esportiva: \n 1- Volei \n 2- Ping Pong \n 3- Skate");
                    ModOpcao = reader.nextLine();
                    if(ModOpcao.equals("1") == false && ModOpcao.equals("2") == false && ModOpcao.equals("3") == false){
                        System.out.println("Modalidade invalida, escolha uma das opções acima");
                    }
                }while(ModOpcao.equals("1") == false && ModOpcao.equals("2") == false && ModOpcao.equals("3") == false);
                
                do{
                    System.out.println("Informe o turno desejado: \n 1- Manha \n 2- Tarde \n 3- Noite");
                    TurOpcao = reader.nextLine();
                    if(TurOpcao.equals("1") == false && TurOpcao.equals("2") == false && TurOpcao.equals("3") == false){
                        System.out.println("Turno invalido, escolha uma das opções acima");
                    }
                }while(TurOpcao.equals("1") == false && TurOpcao.equals("2") == false && TurOpcao.equals("3") == false);

                if(ModOpcao.equals("1")){
                    modalidade = "Volei";
                }else if (ModOpcao.equals("2")){
                    modalidade = "Ping Pong";
                }else{
                    modalidade = "Skate";
                }

                if(TurOpcao.equals("1")){
                    turno = "Manha";
                }else if (TurOpcao.equals("2")){
                    turno = "Tarde";
                }else{
                    turno = "Noite";
                }

                cont++;

                lista = lista + "\n" + "Aluno " + cont + " " + modalidade + " " + turno; 

                System.out.println("deseja continuar digitando novos dados? (S/N)");
                continuar = reader.next().charAt(0);
                reader.nextLine(); // limpa buffer

            }while (Character.toUpperCase(continuar) == 'S');

        }catch(Exception e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        System.out.println("Lista de Cadastrados");
        System.out.println(lista);


    }//final do main

}//final da class