import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        //Criando um novo objeto para reperesentar a Classe Scanner
        Scanner getDadosMenu = new Scanner(System.in);

        String nome = "Danilo";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;
        int numeroSelecionado = 0;

        System.out.println("************************************************");
        System.out.println("\nDados do correntista do Banco");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo de Conta:  " + tipoConta);
        System.out.println("Saldo do Cliente: " + saldo);
        System.out.println("\n************************************************");



        //Criando o menu com textBOX
        String menu = """
                **Digite sua opção **
                1 - Consultar Saldos
                2 - Transferir Valor
                3 - Receber valor
                4- Sair
                """;

        while (opcao != 4) {

            System.out.println(menu);
            opcao = getDadosMenu.nextInt();


            if (opcao == 1) {
                System.out.println("Saldo da Conta =" + saldo);

            } else if (opcao == 2) {
                System.out.println("Qual valor você deseja transferir ?");
                double valor = getDadosMenu.nextDouble();
                if (valor > saldo)
                    System.out.println("Saldo insifucienete");
                else {

                    saldo = saldo - valor;
                    System.out.println("Seu novo saldo é "+ saldo);
                    
                }

            } else if (opcao == 3) {
                System.out.println("Qual é o valor que foi depositado ?");
                double valor = getDadosMenu.nextDouble();

                saldo += valor;

                System.out.println("Meu novo saldo é igual : " + saldo);

            } else if (opcao !=4) {
                System.out.println("Opção inavlida bb!");
            }

        }

        getDadosMenu.close();

    }


}
