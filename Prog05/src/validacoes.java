public class validacoes {
    
    public static boolean validaCEP ( String cep){

        if (!validarTamanho(9, 9, cep))
            return false;
    
        if (cep.charAt(5) != '-')
            return false;

        return true;
    }


    public static boolean validarTamanho( int minimo , int maximo , String valor){

        if( valor.length() < minimo || valor.length() > maximo){
            return false;
        }
        return true;
    }

    public static boolean ValidarNota(double nota){

        if(nota < 0 || nota > 10){
            return false;
        }
        return true;
    }

    public static boolean ValidarPositivo(double valor){
        if(valor <0){
            return false;
        }
        return true;
    }

    public static boolean ValidarParImpar(double numero){
        if(numero % 2 != 0){
            return false;
        }
        return true;
            
        
       
        
    }

}
