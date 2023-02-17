public class mainMain {
    public static void main(String[] args) {
        // Funcoes Strings
        String nome = "Lucas Vinicius";
        System.out.println(nome+" Original");

        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.trim()); // elimina espacos dos cantos
        System.out.println(nome.substring(2));
        System.out.println(nome.substring(2,9));

        System.out.println(nome.replace('s','x'));
        System.out.println(nome.replace("as","xx"));

        int i = nome.indexOf("Vi");
        System.out.println(i);

        int j = nome.lastIndexOf("i");
        System.out.println(j);

        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        String word1 =  vect[0];
        String word2 =  vect[1];
        String word3 =  vect[2];

        System.out.println(s);
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);


    }
}