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

    public static boolean ValidarNota(nota){

        if(){
            
        }
    }

}
