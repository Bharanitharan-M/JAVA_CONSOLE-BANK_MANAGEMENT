package Primary_function;

import Login_page.Bank_customer;
import Login_page.Bank_employee;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Primary_operation {
    public  Scanner scan = new Scanner(System.in);
    public  ArrayList<Bank_customer> customer_obj = new ArrayList<>();
    public  ArrayList<Bank_employee> employee_obj = new ArrayList<>();
    public  final String color = "\u001B[31m";
    public final String reset_color = "\u001B[0m";
    public  final String success = "\u001B[32m";

    public  void automatic_call() {

        employee_obj.add(new Bank_employee("Bharanitharan", 501, 9677323935L, "Manager"));
        employee_obj.add(new Bank_employee("Ramesh", 502, 9789313935L, "Assistant Manager"));
        employee_obj.add(new Bank_employee("Suresh", 503, 7072478709L, "Customer Service"));
        employee_obj.add(new Bank_employee("Ajay", 504, 9876013454L, "Loan Officer"));
        employee_obj.add(new Bank_employee("Vijay", 505, 9789015811L, "Cashier"));


        customer_obj.add(new Bank_customer("Bharathi", 7690365809L, "bharathi543@gmail.com", 9087653456L, 2454, 1234567890L));
        customer_obj.add(new Bank_customer("Dinesh", 7690875434L, "dinesh543@gmail.com", 98765432135L, 1503, 1345678901L));
        customer_obj.add(new Bank_customer("Hariharan", 8765487543L, "hariharan543@gmail.com", 1468024670L, 1544, 1245678901L));
        customer_obj.add(new Bank_customer("Ramesh", 9078677543L, "ramesh5432@gmail.com", 8907889900L, 0, 9087563412L));

    }
    public  void next_login_success() {
        int employee_exit = 1;
        while (employee_exit != 0) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tManager Page");
            System.out.println("\t\t\t1) Add new Customer");
            System.out.println("\t\t\t2) Add the employee");
            System.out.println("\t\t\t3) Change the Details of Customer");
            System.out.println("\t\t\t4) Display all Employee");
            System.out.println("\t\t\t5) Display all Customer");
            System.out.println("\t\t\t6) Display The Employee");
            System.out.println("\t\t\t7) Display The  Customer");
            System.out.println("\t\t\t9) Enter to exit");
            System.out.print("Enter your choice: ");
            int employee_choice = scan.nextInt();
            long change_acc_no;
            while (employee_exit != 0) {
                switch (employee_choice) {
                    case 1:
                        System.out.print("Enter Customer Name: ");
                        String customer_name = scan.next();
                        scan.nextLine();
                        System.out.print("Enter Customer Mobile Number: ");
                        long customer_number = scan.nextLong();
                        String customer_email = "";
                        int email = 1;
                        while (email == 1) {
                            System.out.print("Enter Customer  Email: ");
                            customer_email = scan.next();
                            String regex = "^(.+)@(.+)$";
                            Pattern pattern = Pattern.compile(regex);
                            Matcher matcher = pattern.matcher(customer_email);
                            if (!matcher.matches())
                                System.out.println(color + "Email is invalid! Please Re-enter it..." + reset_color);
                            else
                                email = 0;
                        }
                        System.out.print("Enter Customer Aadhaar Number: ");
                        long customer_aadhaar = scan.nextLong();
                        System.out.println("Enter Customer Account number: ");
                        long customer_acc_no = scan.nextLong();
                        customer_obj.add(new Bank_customer(customer_name, customer_number, customer_email, customer_aadhaar, 0, customer_acc_no));
                        System.out.println("\t\t\t2) Add the employee");
                        System.out.println("\t\t\t3) Change the Details of Customer");
                        System.out.println("\t\t\t4) Display all Employee");
                        System.out.println("\t\t\t5) Display all Customer");
                        System.out.println("\t\t\t6) Display The Employee");
                        System.out.println("\t\t\t7) Display The  Customer");
                        System.out.println("\t\t\t9) Enter to exit");
                        System.out.print("Enter your choice: ");
                        employee_choice = scan.nextInt();
                        break;
                    case 2:
                        System.out.print("Enter Employee Name: ");
                        String employee_name = scan.next();
                        System.out.print("Enter Employee Mobile Number: ");
                        long employee_number = scan.nextLong();
                        System.out.print("Enter Employee Role: ");
                        String employee_role = scan.next();
                        System.out.print("Enter Employee Id: ");
                        int employee_id = scan.nextInt();
                        employee_obj.add(new Bank_employee(employee_name, employee_id, employee_number, employee_role));
                        System.out.println("\t\t\t1) Add new Customer");
                        System.out.println("\t\t\t3) Change the Details of Customer");
                        System.out.println("\t\t\t4) Display all Employee");
                        System.out.println("\t\t\t5) Display all Customer");
                        System.out.println("\t\t\t6) Display The Employee");
                        System.out.println("\t\t\t7) Display The  Customer");
                        System.out.println("\t\t\t9) Enter to exit");
                        System.out.print("Enter your choice: ");
                        employee_choice = scan.nextInt();
                        break;
                    case 3:
                        System.out.println();
                        System.out.println(color + "You can only change these Details" + reset_color);
                        System.out.println("\t\t\t1) Change Mobile Number");
                        System.out.println("\t\t\t2) Change E-mail address");
                        System.out.println("\t\t\t3) Change both details");
                        System.out.println("\t\t\t9) Exit");
                        System.out.print("Enter your Choice: ");
                        int change_choice = scan.nextInt();
                        switch (change_choice) {
                            case 1:
                                System.out.println();
                                System.out.print("Enter the Customer Account number: ");
                                change_acc_no = scan.nextLong();
                                for (Bank_customer change_details : customer_obj) {
                                    if (change_details != null) {
                                        if (change_acc_no == change_details.customer_acc_no) {
                                            System.out.println();
                                            System.out.print("Enter the mobile number of customer: ");
                                            long change_cust_number= scan.nextLong();
                                            if(change_cust_number !=  change_details.mobile_number) {
                                                change_details.mobile_number = change_cust_number;
                                                System.out.println(color + "Mobile Number Successfully Changed" + reset_color);
                                            }
                                            else
                                                System.out.println(color + "Mobile Number Already connected with this account" + reset_color);

                                        } else {
                                            System.out.println(color + "Sorry! Account Not found." + reset_color);
                                        }
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                System.out.println();
                                System.out.print("Enter the Customer Account address: ");
                                long change_email_acc_no = scan.nextLong();
                                for (Bank_customer change_email_details : customer_obj) {
                                    if (change_email_details != null) {
                                        if (change_email_acc_no == change_email_details.customer_acc_no) {
                                            String change_customer_email;
                                            int change_email = 1;
                                            while (change_email == 1) {
                                                System.out.print("Enter Customer New Email: ");
                                                change_customer_email = scan.next();
                                                String regex = "^(.+)@(.+)$";
                                                Pattern pattern = Pattern.compile(regex);
                                                Matcher matcher = pattern.matcher(change_customer_email);
                                                if (!matcher.matches())
                                                    System.out.println(color + "Email is invalid! Please Re-enter it..." + reset_color);
                                                else {
                                                    change_email = 0;
                                                    change_email_details.customer_email = change_customer_email;
                                                    System.out.println(color + "Email Successfully Changed" + reset_color);
                                                }
                                            }
                                        } else {
                                            System.out.println(color + "Sorry! Account Not found." + reset_color);
                                        }
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.println();
                                System.out.print("Enter the Customer Account number: ");
                                change_acc_no = scan.nextLong();
                                for (Bank_customer change_details : customer_obj) {
                                    if (change_details != null) {
                                        if (change_acc_no == change_details.customer_acc_no) {
                                            System.out.println();
                                            System.out.print("Enter the mobile number of customer: ");
                                            change_details.mobile_number = scan.nextLong();
                                            System.out.println(color + "Mobile Number Successfully Changed" + reset_color);


                                            String change_customer_email;
                                            int change_email = 1;
                                            while (change_email == 1) {
                                                System.out.print("Enter Customer  Email: ");
                                                change_customer_email = scan.next();
                                                String regex = "^(.+)@(.+)$";
                                                Pattern pattern = Pattern.compile(regex);
                                                Matcher matcher = pattern.matcher(change_customer_email);
                                                if (!matcher.matches())
                                                    System.out.println(color + "Email is invalid! Please Re-enter it..." + reset_color);
                                                else {
                                                    change_email = 0;
                                                    change_details.customer_email = change_customer_email;
                                                    System.out.println(color + "Email Successfully Changed" + reset_color);
                                                }
                                            }
                                        } else {
                                            System.out.println(color + "Sorry! Account Not found." + reset_color);
                                        }
                                        break;
                                    }
                                }
                                break;

                        }
                        System.out.println("\t\t\t1) Add new Customer");
                        System.out.println("\t\t\t2) Add the employee");
                        System.out.println("\t\t\t4) Display all Employee");
                        System.out.println("\t\t\t5) Display all Customer");
                        System.out.println("\t\t\t6) Display The Employee");
                        System.out.println("\t\t\t7) Display The  Customer");
                        System.out.println("\t\t\t9) Enter to exit");
                        System.out.print("Enter your choice: ");
                        employee_choice = scan.nextInt();
                        break;
                    case 4:
                        for (Bank_employee Employee_details : employee_obj) {
                            if (Employee_details != null) {
                                System.out.println();
                                Employee_details.employee_details();
                                System.out.println();
                            } else
                                break;
                        }
                        System.out.println("\t\t\t1) Add new Customer");
                        System.out.println("\t\t\t2) Add the employee");
                        System.out.println("\t\t\t3) Change the Details of Customer");
                        System.out.println("\t\t\t5) Display all Customer");
                        System.out.println("\t\t\t6) Display The Employee");
                        System.out.println("\t\t\t7) Display The  Customer");
                        System.out.println("\t\t\t9) Enter to exit");
                        System.out.print("Enter your choice: ");
                        employee_choice = scan.nextInt();
                        break;
                    case 5:
                        for (Bank_customer Customer_details : customer_obj) {
                            if (Customer_details != null) {
                                System.out.println();
                                Customer_details.customer_details();
                                System.out.println();
                            } else
                                break;
                        }
                        System.out.println("\t\t\t1) Add new Customer");
                        System.out.println("\t\t\t2) Add the employee");
                        System.out.println("\t\t\t3) Change the Details of Customer");
                        System.out.println("\t\t\t4) Display all Employee");
                        System.out.println("\t\t\t6) Display The Employee");
                        System.out.println("\t\t\t7) Display The  Customer");
                        System.out.println("\t\t\t9) Enter to exit");
                        System.out.print("Enter your choice: ");
                        employee_choice = scan.nextInt();
                        break;
                    case 6:
                        int no_employee = 0;
                        System.out.println();
                        System.out.print("Enter the Employee Id: ");
                        int employee_display = scan.nextInt();
                        for (Bank_employee Employee_details : employee_obj) {
                            if (Employee_details != null) {
                                if (employee_display == Employee_details.employee_id) {
                                    System.out.println();
                                    Employee_details.employee_details();
                                    System.out.println();
                                    break;
                                } else {
                                    no_employee++;
                                }
                            }
                        }
                        if(no_employee == employee_obj.size())
                            System.out.println(color+"Employee Details Not found!"+reset_color);
                        System.out.println("\t\t\t1) Add new Customer");
                        System.out.println("\t\t\t2) Add the employee");
                        System.out.println("\t\t\t3) Change the Details of Customer");
                        System.out.println("\t\t\t4) Display all Employee");
                        System.out.println("\t\t\t5) Display all Customer");
                        System.out.println("\t\t\t7) Display The  Customer");
                        System.out.println("\t\t\t9) Enter to exit");
                        System.out.print("Enter your choice: ");
                        employee_choice = scan.nextInt();
                        break;
                    case 7:
                        int no_customer = 0;
                        System.out.println();
                        System.out.print("Enter the Customer Account Number: ");
                        long customer_display = scan.nextLong();
                        for (Bank_customer Customer_details : customer_obj) {
                            if (Customer_details != null) {
                                if (customer_display == Customer_details.customer_acc_no) {
                                    System.out.println();
                                    Customer_details.customer_details();
                                    System.out.println();
                                    break;
                                }
                                else
                                    no_customer++;
                            }
                            }
                        if(no_customer == customer_obj.size())
                            System.out.println(color + "Customer Not Found!" + reset_color);


                        System.out.println("\t\t\t1) Add new Customer");
                        System.out.println("\t\t\t3) Change the Details of Customer");
                        System.out.println("\t\t\t4) Display all Employee");
                        System.out.println("\t\t\t5) Display all Customer");
                        System.out.println("\t\t\t6) Display The Employee");
                        System.out.println("\t\t\t9) Enter to exit");
                        System.out.print("Enter your choice: ");
                        employee_choice = scan.nextInt();
                        break;
                    case 9:
                        employee_exit = 0;
                        break;
                }
            }
        }
    }
    
    
                                     //ATM OPEARTION
    
    public void atm_operation()
    {
        int customer_choice = 1;
        while (customer_choice == 1) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tATM Page");
            System.out.println("\t\t\t1) Withdraw");
            System.out.println("\t\t\t2) Deposit");
            System.out.println("\t\t\t3) Set ATM PIN");
            System.out.println("\t\t\t4) Change ATM PIN");
            System.out.println("\t\t\t5) Check the Balance");
            System.out.println("\t\t\t9) Enter to exit");
            System.out.print("Enter your choice: ");
            int atm_choice = scan.nextInt();
            while (customer_choice == 1) {
                switch (atm_choice) {
                    case 1:
                        System.out.println();
                        System.out.print("Enter your 4 digit pin number: ");
                        int enter_pin = scan.nextInt();
                        for (Bank_customer pin_check : customer_obj) {
                            if (pin_check != null) {
                                if (pin_check.acc_pin == enter_pin) {
                                    System.out.println();
                                    System.out.print("Enter The amount to Withdraw: ");
                                    int withdraw_balance = scan.nextInt();
                                    if (pin_check.balance < withdraw_balance) {
                                        System.out.println(color + "Insufficient Balance!" + reset_color);
                                    } else {
                                        System.out.println(success + "Successfully Withdraw" + reset_color);
                                        pin_check.balance -= withdraw_balance;
                                        System.out.println(color+"Current balance: "+pin_check.balance+" "+reset_color);
                                    }

                                } else {
                                    System.out.println(color + "Account not found!Try to change the pin number" + reset_color);
                                }
                                break;
                            }

                        }
                        System.out.println("\t\t\t2) Deposit");
                        System.out.println("\t\t\t3) Set ATM PIN");
                        System.out.println("\t\t\t4) Change ATM PIN");
                        System.out.println("\t\t\t5) Check the Balance");
                        System.out.println("\t\t\t9) Enter to exit");
                        System.out.print("Enter your choice: ");
                        atm_choice = scan.nextInt();
                        break;
                    case 2:
                        System.out.println();
                        System.out.print("Enter the 4 digit atm pin: ");
                        int deposit_pin = scan.nextInt();

                        for (Bank_customer deposit_cash : customer_obj) {
                            if (deposit_cash != null) {
                                if (deposit_pin == deposit_cash.acc_pin) {

                                    System.out.print("Enter the Deposit amount: ");
                                    int amount = scan.nextInt();
                                    deposit_cash.balance += amount;
                                    System.out.println(success + "Successfully Deposit" + reset_color);
                                    System.out.println(color+"Current balance: "+deposit_cash.balance+" "+reset_color);

                                } else {
                                    System.out.println(color + "Account not found!Try to change the pin number" + reset_color);
                                }
                                break;

                            }
                        }
                        System.out.println("\t\t\t1) Withdraw");
                        System.out.println("\t\t\t2) Deposit");
                        System.out.println("\t\t\t3) Set ATM PIN");
                        System.out.println("\t\t\t4) Change ATM PIN");
                        System.out.println("\t\t\t5) Check the Balance");
                        System.out.println("\t\t\t9) Enter to exit");
                        System.out.print("Enter your choice: ");
                        atm_choice = scan.nextInt();
                        break;
                    case 3:
                        System.out.println();
                        System.out.print("Enter your Account Number: ");
                        long acc_no = scan.nextLong();

                        for (Bank_customer set_atm : customer_obj) {
                            if (set_atm != null) {
                                if (acc_no == set_atm.customer_acc_no) {
                                    if (set_atm.acc_pin <= 0) {

                                        System.out.println();
                                        System.out.print("Enter the 4 digit number: ");
                                        set_atm.acc_pin = scan.nextInt();
                                        System.out.println(success+"ATM pin updated"+reset_color);
                                    } else {
                                        System.out.println(color + "Sorry! You already set the pin number.Try to change it" + reset_color);
                                    }
                                    break;

                                }

                            } else {
                                System.out.println(color + "Account number not found!" + reset_color);
                                break;
                            }
                        }
                        System.out.println("\t\t\t1) Withdraw");
                        System.out.println("\t\t\t2) Deposit");
                        System.out.println("\t\t\t4) Change ATM PIN");
                        System.out.println("\t\t\t5) Check the Balance");
                        System.out.println("\t\t\t9) Enter to exit");
                        System.out.print("Enter your choice: ");
                        atm_choice = scan.nextInt();
                        break;
                    case 4:
                        System.out.println();
                        System.out.print("Enter your Account Number: ");
                        long change_acc_no = scan.nextLong();

                        for (Bank_customer change_atm : customer_obj) {
                            if (change_atm != null) {
                                if (change_acc_no == change_atm.customer_acc_no) {
                                    if (change_atm.acc_pin != 0) {
                                        System.out.println();
                                        System.out.print("Enter the 4 digit number: ");
                                        change_atm.acc_pin = scan.nextInt();
                                        System.out.println(success+"ATM pin updated"+reset_color);
                                    } else {
                                        System.out.println(color + "Sorry! You not set the pin number yet! Try to change it" + reset_color);
                                    }
                                    break;

                                }

                            } else {
                                System.out.println(color + "Account number not found!" + reset_color);
                                break;
                            }
                        }
                        System.out.println("\t\t\t1) Withdraw");
                        System.out.println("\t\t\t2) Deposit");
                        System.out.println("\t\t\t3) Set ATM PIN");
                        System.out.println("\t\t\t5) Check the Balance");
                        System.out.println("\t\t\t9) Enter to exit");
                        System.out.print("Enter your choice: ");
                        atm_choice = scan.nextInt();
                        break;
                    case 5:
                        System.out.println();
                        System.out.print("Enter your 4 digit pin number: ");
                        int balance_pin = scan.nextInt();
                        for (Bank_customer pin_check : customer_obj) {
                            if (pin_check != null) {
                                if (pin_check.acc_pin == balance_pin) {
                                    System.out.println();
                                    System.out.println(color + "Current balance: " + pin_check.balance + " " + reset_color);


                                }
                                }
                            else {
                                System.out.println(color + "Account not found!Try to change the pin number" + reset_color);
                                break;
                            }
                        }
                        System.out.println("\t\t\t1) Withdraw");
                        System.out.println("\t\t\t2) Deposit");
                        System.out.println("\t\t\t3) Set ATM PIN");
                        System.out.println("\t\t\t4) Change ATM PIN");
                        System.out.println("\t\t\t9) Enter to exit");
                        System.out.print("Enter your choice: ");
                        atm_choice = scan.nextInt();
                        break;
                    case 9:
                        customer_choice = 0;
                        break;

                }
            }
        }
    }
}
