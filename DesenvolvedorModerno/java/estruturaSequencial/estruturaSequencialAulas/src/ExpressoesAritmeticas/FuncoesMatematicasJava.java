package ExpressoesAritmeticas;

public class FuncoesMatematicasJava {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A,B,C;

        // Raiz quadrada Math.sqrt();

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.printf("Raiz quadrada de %.1f = %.2f%n",x,A);
        System.out.printf("Raiz quadrada de %.1f = %.2f%n",y,B);
        System.out.printf("Raiz quadrada de 25 = %.2f%n",C);

        System.out.println();
        // X elevado Y Math.pow(x, y);

        A = Math.pow(x,y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.printf("%.1f elavado a %.1f = %.2f%n",x,y,A);
        System.out.printf("%.1f elavado ao quadrado = %.2f%n",x,B);
        System.out.printf("5 elavado ao quadrado = %.2f%n",C);


        System.out.println();
        // A recebe valor absoluto de X Math.abs(x)
        // valor absoluto = valor sem sinal, se for negativo tira o sinal

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.printf("Valor absoluto de %.1f = %.1f%n",y,A);
        System.out.printf("Valor absoluto de %.1f = %.1f%n",z,B);


        System.out.println(Math.pow(10,2));

    /*    delta = Math.pow(b, 2.0) - 4*a*c;
        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);*/

//        Funcoes Matematicas do Java java.lang.Math

    }

}
