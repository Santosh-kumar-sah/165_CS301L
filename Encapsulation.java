import java.util.Scanner;

class EmployeeEncap{
    private int Account_Balance;
    private int upi_pin = 1234;

    public void setAccount_Balance(int balance){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter UPI PIN to update account balance: ");
        int pin = sc.nextInt();
        if(pin == upi_pin){
            Account_Balance = balance;
            System.out.println("Account Balance Updated Successfully");
        } else {
            System.out.println("Incorrect PIN. Account Balance Update Failed.");
        }
    }

    public void getAccount_Balance(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter UPI PIN to view account balance: ");
        int pin = sc.nextInt();
        if(pin == upi_pin){
            System.out.println("Account available Balance: "+Account_Balance);
           
        } else {
            System.out.println("Incorrect PIN. Cannot retrieve Account Balance.");
        }
       
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        EmployeeEncap emp = new EmployeeEncap();
        emp.setAccount_Balance(5000); // PIN will be asked inside the method
        emp.getAccount_Balance(); // PIN will be asked inside the method

      
    }
}