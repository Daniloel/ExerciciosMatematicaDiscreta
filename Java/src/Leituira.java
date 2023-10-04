import java.util.Scanner;

public class Leituira {

// Atalho para System.out.put =sout
    //Esta classe vai utilizar o método Scanner, para pegar informação do teclado
    public static void main(String[] args) {

//Scanner faz a leitura de entradas do teclado
        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Qual é o ano do lançamento");
        int anoLacamento = leitura.nextInt();

        System.out.println("digite sua avaliação do filme");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoLacamento);
        System.out.println(avaliacao);






    }

}
