import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String cep = "12345-678";
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o CEP: ");
        cep = reader.nextLine();
    
        if (validacoes.validaCEP(cep)){
            System.out.println("CEP válido.");
        }else{
            System.out.println("CEP invalido. ");
        }

        System.out.println("Digite a nota: ");
        double nota = reader.nextDouble();

        if (validacoes.ValidarNota(nota)){
            System.out.println("Nota válida.");
        }else{
            System.out.println("Nota inválida.");
        }

        System.out.println("Digite um número: ");
        double valor = reader.nextDouble();
        if(validacoes.ValidarPositivo(valor)){
            System.out.println("Número positivo.");
        }else{
            System.out.println("Número negativo.");
        }

        System.out.println("digite um número: ");
        double numero = reader.nextDouble();
        if(validacoes.ValidarParImpar(numero)){
            System.out.println("Número par.");
        }else{
            System.out.println("Número ímpar.");
        }
        

        reader.close();



    }
  
   
}
