package Login_page;

import java.util.*;

public class Bank_customer {


    public String customer_name, customer_email;
    public long mobile_number, customer_aadhar, customer_acc_no;
    public int acc_pin, balance, customer_id;
    public Bank_customer(String customer_name, long mobile_number, String customer_email, long customer_aadhar, int acc_pin, long customer_acc_no) {
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.mobile_number = mobile_number;
        this.customer_aadhar = customer_aadhar;
        this.balance = 1000;
        Random random = new Random();
        this.customer_id = (int) (random.nextDouble() * 1000);
        this.customer_acc_no = customer_acc_no;
        this.acc_pin = acc_pin;

    }

    public void customer_details() {
        System.out.println("Name of the Customer: " + customer_name);
        System.out.println("Account Number  of the Customer: " + customer_acc_no);
        System.out.println("Mobile Number of Customer: " + mobile_number);
        System.out.println("Email of the Customer: " + customer_email);
        System.out.println("Aadhar Number of the Customer: " + customer_aadhar);
    }
}


