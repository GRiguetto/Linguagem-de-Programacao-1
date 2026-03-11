public class VariaveisExercicio {

    public static void main(String[] args) {
        // a) Ana Maria é mãe de cinco filhos. Ela caminha todos os dias 10 km para levá-los à escola “EEPSG Josuá da Silva”
        String nomeMae    = "Ana Maria";
        int qtdFilho      = 5;
        int qtdDistancia  = 10;
        String nomeEscola = "EEPSG Josua da Silva";

        System.out.println(nomeMae + " é mãe de" + qtdFilho +" filhos. Ela caminha todos os dias " + qtdDistancia+" km para levá-los à escola "+nomeEscola);

        // b) Sr. Felisberto representou o Brasil nas Olimpíadas de Barcelona em 1982. Ele ganhou 3 medalhas no nado livre.
       
        String nomeAtleta       = "Felisberto";
        String paisRepresentado = "Brasil";
        String paisOlimpiada    = "Barcelona";
        int ano                 = 1982;
        int qtdMedalha          = 3;
        String modalidade       = "nado livre" ;

        System.out.println("Sr. "+nomeAtleta+" representou o "+paisRepresentado+" nas Olimpíadas de "+paisOlimpiada+" em "+ano+". Ele ganhou "+qtdMedalha+ " medalhas no "+ modalidade);

        // c) José comeu meia maçã. Ele precisou subir cinco degraus para alcançá-la.
        
        String nomeMenino = "José";
        double qtdMaça    = 0.5;
        String fruta      = "maçã";
        int qtdDegrau     = 5;

        System.out.println(nomeMenino + " comeu "+qtdMaça+" "+fruta+". Ele precisou subir " +qtdDegrau+ " degraus para alcançá-la.");

        // d) A fórmula para calcular a área do círculo é PI * (RAIO * RAIO).
        
        double raioCirculo;
        double areaCirculo;

        areaCirculo = 10.0;
        raioCirculo = 5.0;

        System.out.println("A fórmula para calcular a área do círculo é PI (" +raioCirculo + areaCirculo+")");

        // e) José ganhou cinco carros no sorteio “Ajuda de amigos!”.

        String nomeGanhador = "José";
        int qtdCarro        = 5;
        String nomeSorteio  = "Ajuda de amigos";

        System.out.println(nomeGanhador + " ganhou " + qtdCarro + " carros no sorteio " + nomeSorteio);

        // f) O salário de Pedro mal dá para comprar alguns quilos de carne.
        
        String nomeTrabalhador = "Pedro";
        double salarioPedro    = 10.0;

        System.out.println("O salario de " + nomeTrabalhador+ " mal dá para comprar alguns quilos de carne, o salario é R$"+salarioPedro);

        // g) Maria é muito tímida, ela mal consegue falar a frase: “Eu quero uma passagem para São Paulo”. Ela tem três irmãos e dois primos.
        
        String nomeTimida = "Maria";
        String fraseMaria = "Eu quero uma passagem para São Paulo";
        int qtdIrmãos     = 3;
        int qtdPrimo      = 2;

        System.out.println(nomeTimida + " é muito tímida, ela mal consegue falar a frase: " + fraseMaria + " ela tem " + qtdIrmãos +" irmãos e "+ qtdPrimo+ " primos.");
    }
}