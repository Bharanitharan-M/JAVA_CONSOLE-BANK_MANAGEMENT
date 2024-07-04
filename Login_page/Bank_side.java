package Login_page;

import java.util.*;

public class Bank_side {
    Scanner scan = new Scanner(System.in);
    static final String Bank_username = "Mbvemployee";
    static final String Bank_password = "Mbv@2004";

    public int Bank_login() {
        int login_success = 0;
        int bank_login_limit = 3;
        while (bank_login_limit > 0) {
            System.out.print("Enter the USERNAME: ");
            String enter_bank_username = scan.nextLine();
            System.out.print("Enter the PASSWORD: ");
            String enter_bank_password = scan.nextLine();
            if (enter_bank_username.equals(Bank_username) && enter_bank_password.equals(Bank_password)) {
                System.out.println("\t\t\t\t\t\t\t\t\tLogin Successfully!");

                login_success = 1;
                break;
            } else {
                bank_login_limit--;
                System.out.println("\t\t\t\t\t* There are only " + bank_login_limit + " chances remaining.");
            }
        }
        return 1;
    }

}
