import java.util.Scanner;
public class SimpleBankingApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int account=0;
        while (true) {
            //getting the choice from the user
            System.out.println("Press 1 for Deposit");
            System.out.println("Press 2 for Withdraw");
            System.out.println("Press 3 for Checking Balance");
            System.out.println("Press 4 for Exiting");
            System.out.println("Choose one option :");
            int choice=sc.nextInt();
            //taking action accoding according to his choice
            switch (choice) {
                case 1:
                    //depositing the money in his account
                    System.out.println("Enter the amount to deposit : ");
                    int deposit=sc.nextInt();
                    account+=deposit;
                    break;
                case 2:
                    //withdrawing the money from his account
                    System.out.println("Enter the amount to withdraw : ");
                    int withdraw=sc.nextInt();
                    if(withdraw<=account) {
                        account-=withdraw;
                    }
                    //showing the default message to the user if his account has no money
                    else {
                        System.out.println("Insufficient funds!");
                     }
                    break;
                case 3:
                     //showing available message to the user
                    System.out.println("Available balance in your account : "+account);
                    break;
                case 4:
                     //showing greeting message to the user when he wants to exit from the application
                    System.out.println("Thank you for using our Application!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                     //showing default message when he/she choose wrong option
                    System.out.println("You choose wrong option");
                    break;
            }
        }
    }
}
