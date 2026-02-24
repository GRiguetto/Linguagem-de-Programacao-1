//Uma empresa está fazendo análise de uma determinada população. Os seguintes dados são obtidos das pessoas: 
// a. Idade 
// b. Cor de Cabelos (Castanhos, Pretos, Loiros ou Outro) 
// c. Altura 
// d. Peso 
// e. Sexo (Masculino ou Feminino)
 
//Faça um algoritmo para mostrar, ao final do processamento os seguintes dados: 
// a. Quantas pessoas possuem idade superior a 18 anos 
// b. Qual é a média das idades, a idade da pessoa mais idosa e a idade da pessoa mais jovem? 
// c. Quantas pessoas em porcentagem possuem cabelos castanhos, pretos, loiros e outros? 
// d. Quantas pessoas possuem altura superior a 1,70 m 
// e. Quantas pessoas peso superior a 80 kg. 
// f. Quantas pessoas em porcentagem são do sexo masculino e quantas são do sexo feminino.
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas;
        int idade;
        String corCabelo;
        double altura;
        double peso;
        String sexo;

        int countIdadeSuperior18 = 0;
        int somaIdades = 0;
        int idadeMaisJovem = Integer.MAX_VALUE;
        int idadeMaisIdosa = Integer.MIN_VALUE;

        int countCabelosCastanhos = 0;
        int countCabelosPretos = 0;
        int countCabelosLoiros = 0;
        int countCabelosOutro = 0;

        int countAlturaSuperior170 = 0;
        int countPesoSuperior80 = 0;

        int countSexoMasculino = 0;
        int countSexoFeminino = 0;

        System.out.print("Digite o número total de pessoas: ");
        totalPessoas = scanner.nextInt();

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("\nDados da pessoa " + (i + 1) + ":");
            
            System.out.print("Idade: ");
            idade = scanner.nextInt();
            somaIdades += idade;

            if (idade > 18) {
                countIdadeSuperior18++;
            }

            if (idade < idadeMaisJovem) {
                idadeMaisJovem = idade;
            }

            if (idade > idadeMaisIdosa) {
                idadeMaisIdosa = idade;
            }

            System.out.print("Cor de Cabelos (Castanhos, Pretos, Loiros ou Outro): ");
            corCabelo = scanner.next().toLowerCase();

            switch (corCabelo) {
                case "castanhos":
                    countCabelosCastanhos++;
                    break;
                case "pretos":
                    countCabelosPretos++;
                    break;
                case "loiros":
                    countCabelosLoiros++;
                    break;
                default:
                    countCabelosOutro++;
                    break;
            }

            System.out.print("Altura (em metros): ");
            altura = scanner.nextDouble();
            
            if (altura > 1.70) {
                countAlturaSuperior170++;
            }

            System.out.print("Peso (em kg): ");
            peso = scanner.nextDouble();

            if (peso > 80) {
                countPesoSuperior80++;
            }

            System.out.print("Sexo (Masculino ou Feminino): ");
            sexo = scanner.next().toLowerCase();

            if (sexo.equals("masculino")) {
                countSexoMasculino++;
            } else if (sexo.equals("feminino")) {
                countSexoFeminino++;
            } else {
                System.out.println("Sexo não reconhecido.");
            }
        }

        scanner.close();

        double mediaIdades = somaIdades / (double) totalPessoas;
        double percentCabelosCastanhos = (countCabelosCastanhos / (double) totalPessoas) * 100;
        double percentCabelosPretos = (countCabelosPretos / (double) totalPessoas) * 100;
        double percentCabelosLoiros = (countCabelosLoiros / (double) totalPessoas) * 100;
        double percentCabelosOutro = (countCabelosOutro / (double) totalPessoas) * 100;
        double percentSexoMasculino = (countSexoMasculino / (double) totalPessoas) * 100;
        double percentSexoFeminino = (countSexoFeminino / (double) totalPessoas) * 100;

        System.out.println("\nResultados:");
        System.out.println("a. Pessoas com idade superior a 18 anos: " + countIdadeSuperior18);
        System.out.println("b. Média das idades: " + mediaIdades);
        System.out.println("   Idade da pessoa mais jovem: " + idadeMaisJovem);
        System.out.println("   Idade da pessoa mais idosa: " + idadeMaisIdosa);
        System.out.println("c. Porcentagem de pessoas com cabelos castanhos: " + percentCabelosCastanhos + "%");
        System.out.println("   Porcentagem de pessoas com cabelos pretos: " + percentCabelosPretos + "%");
        System.out.println("   Porcentagem de pessoas com cabelos loiros: " + percentCabelosLoiros + "%");
        System.out.println("   Porcentagem de pessoas com outros tipos de cabelo: " + percentCabelosOutro + "%");
        System.out.println("d. Pessoas com altura superior a 1.70m: " + countAlturaSuperior170);
        System.out.println("e. Pessoas com peso superior a 80 kg: " + countPesoSuperior80);
        System.out.println("f. Porcentagem de pessoas do sexo masculino: " + percentSexoMasculino + "%");
        System.out.println("   Porcentagem de pessoas do sexo feminino: " + percentSexoFeminino + "%");
    }
}