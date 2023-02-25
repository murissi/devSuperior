public class Main {
    public static void main(String[] args) {

        // Sobrecarga, disponibilizar mais de uma versao para uma operacao.
        Sobrecarga c1 = new Sobrecarga();

        c1.produto = 2;

        Sobrecarga c2 = new Sobrecarga(10);

        // Encapsulamento
        // --------------------------

        Encapsulamento e1 = new Encapsulamento();
        //e1.peso = 1;
        e1.setIdade(3);
        e1.setPeso(5.0);
        e1.getIdade();
        e1.getPeso();





    }

}
