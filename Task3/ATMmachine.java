package Task3;

import java.util.*;

class ATMcode
{   
    int pin = 9999; float Balance=0;
    Scanner sc = new Scanner(System.in);
    ATMcode()
    {
    System.out.print("Enter your pin :- ");
    int userpin= sc.nextInt();
    
    if(userpin ==pin)
    {
        System.out.println("\nLogin Succesfullly..Welcome!!!");
        menu();
    }
    else
    {
        System.out.println("Invalid pin!!!");
       // userpin = sc.nextInt();
       new ATMcode();
    }
  }
    
    public void menu()
    {
       System.out.println("\nSelect an option from the following ..");
       System.out.println("1. Check Balance");
       System.out.println("2. Withdraw Money");
       System.out.println("3. Deposit Money");
       System.out.println("4. Exit");
       System.out.print("\nEnter your choice :- ");
       int option = sc.nextInt();
       
       switch(option)
       {
           case 1 : Checkbalance(); break;
           case 2 : Withdraw(); break;
           case 3 : Deposit(); break;
           case 4 : System.exit(0);
           default : System.out.println("\nPlease choose valid Option !"); menu();
       }
    }
    
    public void Checkbalance()
    {
        System.out.println("Your Current Balance :- "+Balance);
        menu();
    }
    
    public void Withdraw()
    {
        System.out.print("Enter amount to withdraw :-  ");
         float amount = sc.nextFloat();
         if(amount<=Balance) 
         {
             System.out.println("\nAmount Withdraw Succesfully..!!");
             Balance = Balance - amount;
             menu();
         }
         else 
         {
             System.out.println("\nInsufficent Balance..!!");
             menu();
         }
    }
    public void Deposit()
    {
        System.out.print("Enter amount to be deposit :-");
        float deposit = sc.nextFloat();
        Balance = Balance + deposit;
        System.out.println("\nAmount deposited Successfully..!!");
        menu();
    }
   
}

public class ATMmachine
{
    public static void main(String args[])
    {
        System.out.println("~~ Welcome to ATM Machine ~~~\n");
        ATMcode atm = new ATMcode();
    }
}