package ExpressoesAritmeticas;

import java.util.Locale;

public class SaidaDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // trocando a virgula pelo ponto.

        System.out.println("Isso é uma saída de dados");
        System.out.print("Outra saida de tela, sem quebra linha");
        System.out.println();

        double altura = 1.97;
        int peso = 200;

        System.out.printf("MMC: %.2f%n", peso / (altura * altura
        ));

        String nome = "Lucas Vinicius";

        for (int i = 0; i < nome.length(); i++) {
            System.out.print(nome.charAt(i) + "__");
        }

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products: %n%s, which price is $ %.2f%n" +
                        "%s, which price is $ %.2f%n%nRecord: %d years old, code %d and gender: %s" +
                        "%n%nMeasure with eight decimal places: %.8f%n" +
                        "Rouded (three decimal places): %.3f %n" +
                        "Us decimal point: %.3f"
                , product1, price1, product2, price2, age, code, gender, measure, measure, measure);


    }

}
