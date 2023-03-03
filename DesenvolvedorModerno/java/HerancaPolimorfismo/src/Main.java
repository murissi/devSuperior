public class Main {
    public static void main(String[] args) {


        Account acc = new Account(1001,"Alex",0.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0,500.0);

        //Upcasting
        // Pegar uma subclass e atribuir a uma varivel da mae

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"BOb",0.0,200.0);
        Account acc3 = new SavingsAccount(1004, "Anna",0.0,0.01);


        //Downcasting
        // Converter um objeto da super classe para subclasse
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);

        // Essa operação não é permitida. |
        // BusinessAccount acc5 = (BusinessAccount) acc3;

        // Quando não sabemos se o casting vai funcionar usamos o instanceof
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");

            // Sobrescrita
            Account ac1 = new Account(1001, "Alex", 1000.0);
            ac1.withdraw(200);
            System.out.println(ac1.getBalance());

            Account ac2 = new SavingsAccount(1002,"Maria",1000.0,0.01);
            ac2.withdraw(200);
            System.out.println(ac2.getBalance());

            Account ac3 = new BusinessAccount(1003,"Bob",1000.0,500);
            ac3.withdraw(200);
            System.out.println(ac3.getBalance());
        }
    }
}