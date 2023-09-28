public class Condicionais {

    //Testando if end else
    public static void main(String[] args) {

        //Declarando Variaveis
        int anoLancamento =2022;
        boolean incluidoNoPalno = true;
        double notaDoFilme = 8.3;
        String tipoPlano = "Plus";

        //Realizando condições

        if(anoLancamento >= 2020) {
            System.out.println("Este filme é velho");
        }else{
            System.out.println("Este filme esta em alta");
        }

//Usando a lógica OU
        if(incluidoNoPalno == true || tipoPlano.equals("Plus")){
            System.out.println("Filme Liberado");
        }else{
            System.out.println("Precisa comprar");
        }
//Usando a Lógica "e" =and
        if(incluidoNoPalno == true && tipoPlano.equals("Plus")){
            System.out.println("Filme Liberado");
        }else{
            System.out.println("Precisa comprar");
        }

        
    }
}
