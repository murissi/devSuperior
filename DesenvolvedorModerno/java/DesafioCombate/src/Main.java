import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turnos;

        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Vida inicial: ");
        int vidaInicial = sc.nextInt();
        System.out.print("Ataque: ");
        int ataque = sc.nextInt();
        System.out.print("Armadura: ");
        int armadura = sc.nextInt();

        Campeao campeao01 = new Campeao(nome,vidaInicial,ataque,armadura);

        System.out.println();
        sc.nextLine();

        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Vida inicial: ");
        vidaInicial = sc.nextInt();
        System.out.print("Ataque: ");
        ataque = sc.nextInt();
        System.out.print("Armadura: ");
        armadura = sc.nextInt();

        Campeao campeao02 = new Campeao(nome,vidaInicial,ataque,armadura);

        System.out.print("Quantos turnos você deseja executar? ");
        turnos = sc.nextInt();

        for(int i = 1; i <= turnos; i++) {
            if(campeao01.getVida() > 0 && campeao02.getVida() > 0) {
                System.out.println("Resultado do turno " + i);
                campeao01.takeDamage(campeao02);
                campeao02.takeDamage(campeao01);
                System.out.println(campeao02.status());
                System.out.println(campeao01.status());
                System.out.println();
            } else {
                System.out.println("FIM DO COMBATE");
                break;
            }
        }
    sc.close();
    }

}