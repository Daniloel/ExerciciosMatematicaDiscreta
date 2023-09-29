import java.util.Random;
import java.util.Scanner;

/*O programa simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa,
o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.
Este exercico foi feito através do curso da Alura*/
public class Adivinhacao {


    public static void main(String[] args) {

        Scanner leitura= new Scanner(System.in);

        // Conjunto de numeros defino o cojunto de numeros como inteiro.
        int sorteio = new Random().nextInt(100); // gera um número aleatório entre 0 e 100;
        //Conjunto de numeros inteiros
        int tentativas = 0;

        //cuidado porque o while começa com a letra minusculas
        while (tentativas < 5) {

            System.out.println("Digite um numero !");
            int numeroEscolhido = leitura.nextInt();
            tentativas++;

            // Logica condicional -> 
            //Aqui é buscada a verdade para o numeroEscolhido
            if (numeroEscolhido == sorteio){
                System.out.println("Parabens você é o bichão da Goiaba, acertou em " + tentativas + "tentativas");
                break;
            } else if (numeroEscolhido > sorteio ) {
                System.out.println("O numero escolhido é menor ");

            } else {
                System.out.println("O numero digitado é maior");
            }

            
            if (tentativas == 5) {

                System.out.println("Bizonho você não acertou o numero era " + sorteio);

            }

        }

    }
}



