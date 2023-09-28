import java.util.Scanner;

public class OutroLoop {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double nota =0;
        double mediaAvaliacao = 0;
        int totalNotas =0;

        while ( nota!= -1){

            System.out.println("Digite a nota ou -1");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotas++;
            }

        };

        System.out.println("A media da nota é " +mediaAvaliacao/totalNotas);

    }
}
