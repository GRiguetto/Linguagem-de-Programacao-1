/*-faça um programa que receba uma quantidada inderteminada de dados de funcionarios: Nome email salario departamento
  -valide cada entaa  da seguinte forma: Nome deve ter pelo menos 10 caracteres, email dete conter @ e . e pelomenos 15 caracteres,
    Salario deve ser maior que 1000.00, departamentonão podeser vazio
  -Ao final calcule e mostre: O departamento do Funcionario que recebe o maio salario, a média dos salarios de todosfuncionarios
     Os emails dos funcionarios de TI, quanto seria os salarios se tivese um aumento de 20%
*/


//imports
import java.util.Scanner;

public class Prog03 {

    public static void main(String[] args) {
        
        //Scanner
        Scanner reader = new Scanner(System.in);

        //Variaveis
        String nome = new String();
        String email = new String();
        String setor = new String();
        String setorMaiorSalario = new String();
        String ListaAumento = new String();
        String emailLista = new String();
        Float salario = 0.0f, MaiorSalario = 0.0f, SomaSalario= 0.0f;
        int cont = 0;
        char continuar;

        //Constantes
        final float aumento = 1.2f;

        do {
            
            try{
                do{

                    System.out.println("Informe o Nome: ");
                    nome = reader.nextLine();
                    if(nome.length()<10)
                          System.out.println(" O nome deve conter pelo menos 10 caracteres.");

                }while(nome.length()<10);
                
                do{
                    System.out.println("Informe o Email: ");
                    email = reader.nextLine();
                    if (email.contains("@") == false || email.contains(".") == false){
                        System.out.println("Deve ser um email valido. adicione um (@) e (.)");
                    }
                    if(email.length() <15){
                        System.out.println("O email deve conter no minimo 15 caracteres");
                    }
                }while(email.contains("@") == false || email.contains(".") == false || email.length() <15);

                do{
                    System.out.println("Informe o Salario: ");
                    salario = reader.nextFloat();
                    if(salario < 1000.00)
                        System.out.println("Salario errado, deve ser superior a R$1000,00");

                }while(salario < 1000);

                reader.nextLine();//limpa o "buffer" memoria temporaria que etsa com um /n armazenada

                do{   

                    System.out.println("Informe o Setor: 1 - TI | 2 - RH | 3 - Operacional");
                    setor = reader.nextLine();
                    if(setor == "" || setor == null){
                        System.out.println("todo usuario deve ter um setor.");
                    }
                    
                    if(setor.equalsIgnoreCase("ti") || setor.equalsIgnoreCase("1")){
                        emailLista = emailLista + "\n" + email;
                    } 

                }while(setor == "" || setor == null);
            }catch(Exception erro){

                String erroMensagem = erro.getMessage();
                System.out.println("Erro: " + erroMensagem);
                    
            }


            cont++;
            SomaSalario =+ salario;
            if(salario > MaiorSalario){
                MaiorSalario = salario;
                setorMaiorSalario = setor;
            }
            ListaAumento = ListaAumento + "\n" + cont + "  |  " + nome + "  |  " + salario + "  |  " + salario*aumento;

            System.out.println("deseja digitar mais um funcionario (s/n)");
            continuar = reader.next().charAt(0);
               
            reader.nextLine();//limpa o "buffer" memoria temporaria que etsa com um /n armazenada

        } while(continuar == 's' || continuar == 'S');

        System.out.println("O maior salario e de que setor ele é: "+setorMaiorSalario + " | " + MaiorSalario );
        System.out.println("A media salarial é: " + SomaSalario/cont);
        System.out.println("\nLista de email dos Funcionarios da ti");
        System.out.println(emailLista);
        System.out.println("\nLista de todos os funcionarios");
        System.out.println("id | Nome do Funcionario | Salario atual | Aumento de 20%");
        System.out.println(ListaAumento);


    }//Final main

}//Final Class
