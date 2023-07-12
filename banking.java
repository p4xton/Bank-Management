import java.util.Scanner;


class banking {

    static double balance = 0;

    public static void checkBalance()
     {  
        System.out.println("Your current balance is $" + balance); 
     }


     public static void deposit()
     {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("$" + amount + " has been deposited to your account.");
        checkBalance();
     }

     public static void Withdraw()
     {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("Insufficient funds.");
        }
        else{
            balance -= amount;
            System.out.println("$" + amount + " has been withdraw from your account.");
        }
        checkBalance();
     }

     public static void Exit()
     {  
        System.out.println("Thank you for banking with us . Have a great day!"); 
     }

       

     

public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        int option=0;

        while (option != 4)
        {
            System.out.println("Welcome to the Bank of Paxton");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter an option:  ");
            option = scanner.nextInt();


            switch (option) 
            {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    Withdraw();
                    break;
                case 4:
                    Exit();
                    break;
            
                default:
                System.out.println("Invalid option. Try Again!");
                    break;
            }

        }

} 
}       









