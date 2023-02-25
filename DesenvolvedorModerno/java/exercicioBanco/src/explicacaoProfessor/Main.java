package explicacaoProfessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac1;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            ac1 = new Account(number,name,deposit);

        } else{
            ac1 = new Account(number,name);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(ac1);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();

        ac1.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(ac1);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();

        ac1.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(ac1);




        sc.close();
    }
}
