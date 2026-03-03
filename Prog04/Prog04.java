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
        String modalidade1 = "";
        String modalidade2 = "";
        String modalidade3 = "";
        String turno      = "";
        String lista      = "";
        char continuar;
        String ModOpcao, TurOpcao;
        int cont = 0;

        //Contadores de mais votado
        int vot11 = 0, vot12 = 0, vot13 = 0, vot21 = 0, vot22 = 0, vot23 = 0, vot31 = 0, vot32 = 0, vot33 = 0;

        //contadore dos maiores votos de cada periodo
        int MaiorVotoManha = 0 , MaiorVotoTarde = 0, MaiorVotoNoite = 0;
        String VencedorManha = "", VencedorTarde = "", VencedorNoite = "";

        try{

            System.out.println("Informe a Primeira Modalidade");
            modalidade1 = reader.nextLine();
            System.out.println("Informe a Segunda Modalidade");
            modalidade2 = reader.nextLine();
            System.out.println("Informe a Terceira Modalidade");
            modalidade3 = reader.nextLine();
            
            
            do{

                do{
                    System.out.println("Informe a modalidade esportiva: \n 1- "+modalidade1+" \n 2- "+modalidade2+" \n 3- "+modalidade3+"");
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
                    modalidade = modalidade1;
                }else if (ModOpcao.equals("2")){
                    modalidade = modalidade2;
                }else{
                    modalidade = modalidade3;
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
                
                if(ModOpcao.equals("1") && TurOpcao.equals("1")){

                    vot11++;

                }
                if(ModOpcao.equals("1") && TurOpcao.equals("2")){

                    vot12++;

                }
                if(ModOpcao.equals("1") && TurOpcao.equals("3")){

                    vot13++;

                }
                if(ModOpcao.equals("2") && TurOpcao.equals("1")){

                    vot21++;

                }
                if(ModOpcao.equals("2") && TurOpcao.equals("2")){

                    vot22++;

                }
                if(ModOpcao.equals("2") && TurOpcao.equals("3")){

                    vot23++;

                }
                if(ModOpcao.equals("3") && TurOpcao.equals("1")){

                    vot31++;

                }
                if(ModOpcao.equals("3") && TurOpcao.equals("2")){

                    vot32++;

                }
                if(ModOpcao.equals("3") && TurOpcao.equals("3")){

                    vot33++;

                }

                

                System.out.println("deseja continuar digitando novos dados? (S/N)");
                continuar = reader.next().charAt(0);
                reader.nextLine(); // limpa buffer

            }while (Character.toUpperCase(continuar) == 'S');

            //cOMPARATIVOS DE TODAS AS ODALIDADE NO PERDIODA DA MANHA
                if( vot11 > MaiorVotoManha){
                    VencedorManha = "O(a) " + modalidade1 + " Foi a Mais votada no Periodo da Manha. Com " + vot11 + " Escritos";
                    MaiorVotoManha = vot11;
                }
                if( vot21 > MaiorVotoManha){
                    VencedorManha = "O(a) " + modalidade2 + " Foi a Mais votada no Periodo da Manha. Com " + vot21 + " Escritos";
                    MaiorVotoManha = vot21;
                }
                if( vot31 > MaiorVotoManha){
                    VencedorManha = "O(a) " + modalidade3 + " Foi a Mais votada no Periodo da Manha. Com " + vot31 + " Escritos";
                    MaiorVotoManha = vot31;
                }

                //COMPARIVOS DE TODAS AS MODALIDADES NO PERIODO DA TARDE
                
                if( vot12 > MaiorVotoTarde){
                    VencedorTarde = "O(a) " + modalidade1 + " Foi a Mais votada no Periodo da Tarde. Com " + vot12 + " Escritos";
                    MaiorVotoTarde = vot12;
                }
                if( vot22 > MaiorVotoTarde){
                    VencedorTarde = "O(a) " + modalidade2 + " Foi a Mais votada no Periodo da Tarde. Com " + vot22 + " Escritos";
                    MaiorVotoTarde = vot22;
                }
                if( vot32 > MaiorVotoTarde){
                    VencedorTarde = "O(a) " + modalidade3 + " Foi a Mais votada no Periodo da Tarde. Com " + vot32 + " Escritos";
                    MaiorVotoTarde = vot32;
                }

                //COMPARATIVOS DE TODAS AS MODALIDADES NO PERIODO DA NOITE

                if( vot13 > MaiorVotoNoite){
                    VencedorNoite = "O(a) " + modalidade1 + " Foi a Mais votada no Periodo da Noite. Com " + vot13 + " Escritos";
                    MaiorVotoNoite = vot13;
                }
                if( vot23 > MaiorVotoNoite){
                    VencedorNoite = "O(a) " + modalidade2 + " Foi a Mais votada no Periodo da Noite. Com " + vot23 + " Escritos";
                    MaiorVotoNoite = vot23;
                }
                if( vot33 > MaiorVotoNoite){
                    VencedorNoite = "O(a) " + modalidade3 + " Foi a Mais votada no Periodo da Noite. Com " + vot33 + " Escritos";
                    MaiorVotoNoite = vot33;
                }

        }catch(Exception e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        System.out.println("Lista de Cadastrados");
        System.out.println(lista);

        System.out.println("\nModalidades com mais competidores de cada Periodo");
        System.out.println(VencedorManha);
        System.out.println(VencedorTarde);
        System.out.println(VencedorNoite);
        
        
        Math.max(vot11, vot21);


    }//final do main

}//final da class