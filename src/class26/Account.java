package class26;

public class Account {
   private double balance;
   private String accountNumber;
   private String type;
   private String accountTitle;


   public void setAccountNumber(String accountNumber){
       if(accountNumber.length()!=16){
           System.out.println("Wrong account number");
       }else{
           this.accountNumber=accountNumber;
       }
   }


      public String getAccountNumber(){
       return  accountNumber;
      }


      public void setBalance(double balance){
       //SANITIZING THE INPUT MEANING CHECKING THE VALUES BEFORE WE CAN ASSIGN THEM.
       if(balance<0){
           System.out.println("Negative balance is not allowed in a current account");
       }else{
           this.balance=this.balance+balance;
       }

   }
   public String getAccountTitle(){
       return  accountTitle;
   }      // IF YOU WANT TO SEE THIS FIELD SO ITS NOT PRIVATE U USE "get"
   public Account(double balance,String accountNumber,String type,String accountTitle){
       this.balance=balance;
       this.accountNumber=accountNumber;
       this.type=type;
       this.accountTitle=accountTitle;
        }
    }

class AccountTester{
    public static void main(String[] args) {

       Account account=new Account(-1000,"JHGYUFF","GIUCGIU","kbjdugiud") ;
        System.out.println(account.getAccountTitle());

    }
}