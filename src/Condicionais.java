public class Condicionais {

    //EXERCICIO PROPOSTO POR CURSO ALURA
    public static void main(String[] args) {

        //Declarando Variaveis
        //DEFININDO OS CONJUNTOS QUE SERÃO TRABALHADOS
        int anoLancamento =2022;
        boolean incluidoNoPalno = true;
        double notaDoFilme = 8.3;
        String tipoPlano = "Plus";

        //Realizando condições

        // UASNDO A LOGICA CONDICIONAL ONDE VEJO DE TENHO VV || VF || FV| VV
        if(anoLancamento >= 2020) {
            System.out.println("Este filme é velho");
        }else{
            System.out.println("Este filme esta em alta");
        }

          //Usando a lógica OU (APLICANDO A TABELA DA VERDADE PARA VE SE A VARIAVEL É VERDADEIRA)
        if(incluidoNoPalno == true || tipoPlano.equals("Plus")){
            System.out.println("Filme Liberado");
        }else{
            System.out.println("Precisa comprar");
        }
        //Usando a Lógica "e" =and (APLICANDO A LOGICA PARA VER SE AS DUAS CONDIÇÕES ATENDE )
        if(incluidoNoPalno == true && tipoPlano.equals("Plus")){
            System.out.println("Filme Liberado");
        }else{
            System.out.println("Precisa comprar");
        }

        
    }
}
