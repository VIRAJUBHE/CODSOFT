/*              ATM Interface
1. Create a class to represent the ATM machine.
2. Design the user interface for the ATM , including options such as withdrawing , depositing  , and checking the balance.
3. Implementing methods for each option , such as withdrawn(amount) , deposit(amount) , and checkBalance()
4. Create a class to represent the user's bank account , which stores the account balance .
5. Connect the ATM class with the user's bank account class to access and modify the account balance.
6. Validate user input to ensure it is within acceptance limits (e.g., sufficient balance for withdrawls ).
7. Display appropriate message to the user based on their chosen options and the success or failure of their transcations.
 */


import java.util.Scanner;
import java.util.Random;

public class AtmInterface extends ATM{
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.display();
    }
}

class ATM extends user{
    user u = new user();
    int money = u.Balance();
    Scanner sc = new Scanner(System.in);

    public void display(){
        int choice;
        do{
            System.out.println("\n*****ATM*****");
            System.out.println("1. WITHDRAW MONEY");
            System.out.println("2. DEPOSIT MONEY");
            System.out.println("3. CHECK BALANCE");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("\nHow much Money want to withdraw");
                    int widr = sc.nextInt();
                    
                    if(widr <= (money)){
                        withdraw(widr);
                        
                    }
                    else
                        System.out.println("\nNot having enough money in the account\n");
                    break;
                case 2:
                    System.out.println("\nHow much Money want to Deposit");
                    int depomo = sc.nextInt();
                    deposit(depomo);
                    break;
                case 3:
                    CheckBalance();
                    break;
                case 4:
                    break;
            }
            System.out.println("\nWant to continue ( 1 or 0 )");
            choice = sc.nextInt();
        }while(choice == 1);
    }

    public void withdraw(int amount){
        money  -= amount;
        System.out.println("\nMoney has been Successfully deducted from the Account\n");
    }

    public void deposit (int amount){
        money += amount;
        System.out.println("\nMoney has been Successfully Added in the Account\n");
    }

    public void CheckBalance(){
        System.out.println("\nBalance is = "+money);
    }
}

class user{

    public int Balance(){
        Random ran = new Random();
        int x = ran.nextInt(5000 , 50000);
        return x;
    }
}