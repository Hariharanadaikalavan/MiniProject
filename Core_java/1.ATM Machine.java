import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;
    
    public ATM(){
                }
    
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    
    public double getDespositAmount(){
        return depositAmount;
    }
    public void setDepositAmount(double despositAmount){
        this.depositAmount=depositAmount;
    }
    
    public double getWithdrawAmount(){
        return withdrawAmount;
    }
    public void setWithdraAmount(double withdrawAmount){
        this.withdrawAmount=withdrawAmount;
    }
    
}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

interface AtmOperationInterFace {
     public void viewBalance();
    public void withdrawAmount(double withdrawAmount);
    public void despositAmount(double despositAmount);
    public void viewMiniStatement();
}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
class AtmOperation implements AtmOperationInterFace{
    ATM atm=new ATM();
    Map<Double,String> miniStatement=new HashMap<>();
    @Override
    public void viewBalance(){
      System.out.println("Available Balance is :"+atm.getBalance());
    }
    @Override
    public void withdrawAmount(double withdrawAmount){
        if(withdrawAmount<=atm.getBalance()){
          miniStatement.put(withdrawAmount,"<--Amount withdrawn");
        System.out.println(withdrawAmount+"Collect the cash and please get the atm cards finally go to home saftely");
        atm.setBalance(atm.getBalance()-withdrawAmount);
        viewBalance();
        }else{
            System.out.println("Insuficient Balance you account would be debited with 27Rupess Respectively");
            }
    }
    @Override
    public void despositAmount(double despositAmount){
        miniStatement.put(despositAmount, "<--Amount deposited");
        System.out.println(despositAmount+" Deposited Sucessffully!!!!");
        atm.setBalance(atm.getBalance()+despositAmount);
        viewBalance();
       }
    @Override
    public void viewMiniStatement(){
for(Map.Entry<Double,String> obj1:miniStatement.entrySet()){
            System.out.println(obj1.getKey()+""+obj1.getValue());
   }
    }
}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
public class MainClass {
  public static void main(String hari[]){
      AtmOperationInterFace obj=new AtmOperation();
      int atmNumber=123456;
      int atmpin=123456;
      Scanner in=new Scanner(System.in) ;
      
      System.out.print("Enter the ATM number : ");
      int Number=in.nextInt();
      System.out.print("Enter the pin : ");
      int Pin=in.nextInt();
      if((atmNumber==Number)&&(atmpin==Pin)){
          System.out.println("Welcome to \"HARIHARAN World Bank\"");
          
          while(true){
              System.out.println("1.View Avaiable\n 2.Withdraw Amount\n3.DepositeAmount\n4.View Statement\n5.Exit");
              System.out.println("Enter Choice : ");
              int ch=in.nextInt();
              switch (ch) {
                  case 1:
                      obj.viewBalance();
                      break;
                  case 2:
                      System.out.println("Enter the amound to withdraw");
                      double withdrawAmount=in.nextDouble();
                      obj.withdrawAmount(withdrawAmount);
                      break;
                  case 3:
                      System.out.println("Enter amount to Deposit:");
                      double depositeAmount=in.nextDouble();
                      obj.despositAmount(depositeAmount);
                      break;
                  case 4:
                      obj.viewMiniStatement();
                      break;
                  case 5:
                      System.out.println("Collect the Atm cards\nThanks for Visiting Hariharan World Bank");
                      System.exit(0);
                  default:
                      System.out.println("Please enter 1 to 5 Respectively");
                      break;
              }
              
          }
      }else{
          System.out.println("Kindly check the pin your enter");
          System.out.println("Better luck next time\n \nPlease out my site Don't waste my time");      
          System.exit(0);
      }
      
  }    
}
