//Uma empresa de modelo está contratando garotas para iniciar um trabalho de divulgação de produtos de beleza. Para isso, está selecionando garotas que tenham o seguinte perfil: (L2 – ex.14) 
// a. Idade superior a 18 anos 
// b. Cabelos loiros 
// c. Altura superior a 1,75 m 
// d. Peso inferior a 60 kg 
// e. Seios: 85 a 87 cm 
// f. Cintura: 60 cm 
// g. Olhos verdes 
// h. Quadril: 60 cm 

// Você foi escalado por sua empresa para elaborar um algoritmo que permite entrar com os valores referentes às características acima e, informar se a garota foi selecionada ou não
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da garota: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a cor do cabelo da garota: ");
        scanner.nextLine(); // Limpar o buffer
        String cabelo = scanner.nextLine().toLowerCase();

        System.out.print("Digite a altura da garota em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o peso da garota em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a medida dos seios da garota em cm: ");
        double seios = scanner.nextDouble();

        System.out.print("Digite a medida da cintura da garota em cm: ");
        double cintura = scanner.nextDouble();

        System.out.print("Digite a cor dos olhos da garota: ");
        scanner.nextLine(); // Limpar o buffer
        String olhos = scanner.nextLine().toLowerCase();

        System.out.print("Digite a medida do quadril da garota em cm: ");
        double quadril = scanner.nextDouble();

        Garota garota = new Garota(idade, cabelo, altura, peso, seios, cintura, olhos, quadril);

        System.out.println(verificarSelecao(garota));

        scanner.close();
    }

    private static String verificarSelecao(Garota garota) {
        if (garota.getIdade() > 18 &&
            garota.getCabelo().equals("loiro") &&
            garota.getAltura() > 1.75 &&
            garota.getPeso() < 60 &&
            garota.getSeios() >= 85 && garota.getSeios() <= 87 &&
            garota.getCintura() == 60 &&
            garota.getOlhos().equals("verdes") &&
            garota.getQuadril() == 60) {
            return "Parabéns! A garota foi selecionada.";
        } else {
            return "Desculpe, a garota não atende aos critérios de seleção.";
        }
    }
}

class Garota {
    private int idade;
    private String cabelo;
    private double altura;
    private double peso;
    private double seios;
    private double cintura;
    private String olhos;
    private double quadril;

    public Garota(int idade, String cabelo, double altura, double peso, double seios, double cintura, String olhos, double quadril) {
        this.idade = idade;
        this.cabelo = cabelo;
        this.altura = altura;
        this.peso = peso;
        this.seios = seios;
        this.cintura = cintura;
        this.olhos = olhos;
        this.quadril = quadril;
    }

    public int getIdade() {
        return idade;
    }

    public String getCabelo() {
        return cabelo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getSeios() {
        return seios;
    }

    public double getCintura() {
        return cintura;
    }

    public String getOlhos() {
        return olhos;
    }

    public double getQuadril() {
        return quadril;
    }
}