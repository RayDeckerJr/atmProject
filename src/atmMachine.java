

import java.util.Scanner;

public class atmMachine {
    public static Scanner in;
    private static float balance = 0;
    private static int anotherTrans;

    public static void main(String args[]){
        in = new Scanner(System.in);
        transation();
    }

    private static void transation(){
        int choice;

        System.out.println("Please Select An Option: ");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance");

        choice = in.nextInt();

        switch (choice){
            case 1:
                //For Withdraw
                float amount;
                System.out.println("Please Enter Amount To Withdraw: ");
                amount = in.nextFloat();
                if (amount > balance || amount == 0){
                    System.out.println("Insufficient Funds.");
                    anotherTransaction();
                } else {
                    balance = balance - amount;
                    System.out.println( "$"+amount + " Withdrawn.\n" + "$"+balance + " Remaining.");
                    anotherTransaction();
                }

                break;

            case 2:
                //For Deposit
                float deposit;
                System.out.println("Please Enter Amount To Deposit: ");
                deposit = in.nextFloat();
                //update balance
                balance = deposit;
                System.out.println("$"+deposit + " Deposited. \nYour Total Balance Is: "+ "$"+balance );
                anotherTransaction();
                break;

            case 3:
                //For Balance
                System.out.println("Your Total Balance Is: "+ "$"+balance );
                anotherTransaction();
                break;

            default:
                System.out.println("Invalid Option: \n\n");
                anotherTransaction();
                break;
        }

    }
    private static void anotherTransaction(){
        System.out.println("Do You Want Another Transaction? \n\n Press 1 For Another Transaction.\n2 To Exit.");
        anotherTrans = in.nextInt();
        if(anotherTrans == 1){
            transation();
        } else if (anotherTrans == 2){
            System.out.println("Thank You. Have A Nice Day!");
        } else {
            System.out.println("Invalid Option.\n\nPress 1 For Another Transaction.\n2 To Exit.");
            anotherTransaction();
        }
    }
}
