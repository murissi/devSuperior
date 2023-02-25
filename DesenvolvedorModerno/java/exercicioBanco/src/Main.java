import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Usuario marcos = new Usuario(500,8532,"Marcos");
        System.out.println(marcos.getSaldo());


        marcos.setNome("Roberto");
        marcos.setDeposito(200);
        System.out.println(marcos.getSaldo());

        marcos.setSaca(300);
        System.out.println(marcos.getSaldo());
    }
}