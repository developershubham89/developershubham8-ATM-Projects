package ATMProjects;




import java.util.Scanner;



class ATM{
    final int pin=7873;
    float balance;

//    ATM(){
//        System.out.println("Enter a PIN :");
//        Scanner sc=new Scanner(System.in);
//        int enterPin=sc.nextInt();
//        if(enterPin==pin){
//            checkOption();
//        }
//        else{
//            System.out.println("Enter a valid pin");
//            new ATM();
//        }
//    }

    public void menu(){
        System.out.println("Enter a PIN :");
        Scanner sc=new Scanner(System.in);
        int enterPin=sc.nextInt();
        if(enterPin==pin){
            checkOption();
        }
        else{
            System.out.println("Enter a valid pin");
            menu();
        }
    }
    public void checkOption(){
        System.out.println("Enter Your Option :");
        System.out.println("1. Checkbalance ");
        System.out.println("2. Withdrow Money ");
        System.out.println("3. Deposite Money ");
        System.out.println("4. Exit ");

        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        if(option==1){
            Checkbalance();
        }
        else if (option==2) {
            WithdrowMoney();
        }
        else if(option==3){
            DepositeMoney();
        }
        else if(option==4){
           return;
        }
        else{
            System.out.println("Please Enter valid Options ");
        }
    }
    public void Checkbalance(){
        System.out.println("Balance : "+balance);
        new ATM();
    }
    public void WithdrowMoney(){
        System.out.println("Enter Amount to Withdrow :");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        if(amount>balance){
            System.out.println("Insufficent Balance ! ");
        }
        else{
            balance=balance-amount;
            System.out.println("Money Withdrowl Successfully !");
        }
        menu();
    }
    public void DepositeMoney(){
        System.out.println("Enter Amount to Deposite :");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        balance=balance+amount;
        System.out.println("Balance Deposited Successfully !");
        menu();
    }
}

public class ATMmachine {
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.menu();
    }
}
