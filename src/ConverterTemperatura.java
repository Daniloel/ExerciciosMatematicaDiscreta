public class ConverterTemperatura {



    public static void main ( String [] args){

        double temperaturaCelsius = 33;
        double temperaturaFahrenheit = (temperaturaCelsius *1.8) +32;

        //Aqui ele está usando o format para concatenas as informações ele traz a % seguida do tipó da variavel.
        String mensagem = String.format("A temperatura de %f celsius é equivalente a %f Fahrenheit", temperaturaCelsius, temperaturaFahrenheit);
        System.out.println(mensagem);


        //Aqui ele vai trazer o valor da variavel inteira ele esta fazendo casting pis ele esta trazendo uma double represxentada por uma inteira
        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaFahrenheitInteira);




    }



}
