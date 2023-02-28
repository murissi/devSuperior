public class BoxingUnboxingWrapper {
    public static void main(String[] args) {

        int x = 20;
        Object obj = x;

        System.out.println(obj);

        int y = (int) obj;

        // Wrappers
        // No java os tipos primtivos possuem classes que equivalem a eles
        // ex:
        Character v = 'F';
        char z = v;

        Integer a = 1;
        int b = a;


    }
}
