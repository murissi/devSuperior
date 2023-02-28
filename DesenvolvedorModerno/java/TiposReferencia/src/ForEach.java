public class ForEach {
    public static void main(String[] args) {
        // For each
        String[] vect = {"Maria","Bob","Alex"};

        // Percorre todos os elementos de vect chamando de nome
        for (String nome : vect) {
            System.out.println(nome);
        }


        int[] idade = {1,2,3,4,4,5,6,7,8,9,10};

        for (int i : idade) {
            System.out.println(i);
        }

    }
}
