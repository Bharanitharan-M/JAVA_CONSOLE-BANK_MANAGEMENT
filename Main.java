import Login_page.*;

import Primary_function.Primary_operation;
public class Main {
    public static void main(String[] args) {
        Primary_operation pf = new Primary_operation();

        pf.automatic_call();
        Bank_side bank_obj = new Bank_side();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMBV BANK");
        System.out.println("Login to continue");
        System.out.println("\t\t\t1) Manager login");
        System.out.println("\t\t\t2) ATM Option");
        System.out.print("Enter your choice: ");
        int choice = pf.scan.nextInt();
        System.out.println();
        switch (choice) {
            case 1:
                int login_success = bank_obj.Bank_login();
                if (login_success == 1)
                    pf.next_login_success();
                break;
            case 2:
                pf.atm_operation();
                break;

        }
    }
}