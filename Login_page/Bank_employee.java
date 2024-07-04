package Login_page;

public class Bank_employee {
    public String employee_name, employee_role;
    public int employee_id;
    public long employee_number;

    public Bank_employee(String employee_name, int employee_id, long employee_mobile_no, String employee_role) {
        this.employee_name = employee_name;
        this.employee_number = employee_mobile_no;
        this.employee_id = employee_id;
        this.employee_role = employee_role;
    }

    public void employee_details() {
        System.out.println("Name of the employee: " + employee_name);
        System.out.println("Id of the Employee: " + employee_id);
        System.out.println("Mobile Number of Employee: " + employee_number);
        System.out.println("Role of Employee: " + employee_role);
    }
}
