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
        reader.close();
    }
  
   
}
