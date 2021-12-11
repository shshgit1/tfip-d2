package bankaccount;

public class FixedDepositAccount extends bankaccount 
{
        private float interest= 0.03f;
        private int durationInMonths=6;
        private boolean isInterestAndDurationChanged=false;
        private boolean isDurationChanged=true;
        private boolean isInterestChanged=false;

public static void main(String[] args) {
FixedDepositAccount fd= new FixedDepositAccount("Qaz", 100f, 0.03f, 6);
fd.getBalance();
fd.deposit(1);
fd.withdraw(1);
fd.setdurationInMonths(3);

}
        public FixedDepositAccount(String name, Float balance){
            
        }
public FixedDepositAccount(String name, Float balance, Float interest){

}
public FixedDepositAccount(String name, Float balance, Float interest, Integer duration){
this.setName(name);
this.setAccountBalance(balance);
this.interest = interest;
this.durationInMonths= duration;

}
@Override
public void withdraw(float amount){
System.out.println("??");
}
@Override
public void deposit(float amount){
    System.out.println("dep");
}
public void getBalance()
{
    float a= this.getAccountBalance();
float newBal= a+(a*interest);
    System.out.println(newBal);
    
}

public void setdurationInMonths(int x)
{
    if (isDurationChanged==false)
    {
    if (x==3 || x==6)
    {
        durationInMonths=x;
        System.out.println("duration: "+x);
        isDurationChanged=true;
        System.out.println(isDurationChanged);
    }
    else
    {
    System.out.println("wrong duration set");
    }
   
}
else
System.out.println("duration changed before");
}
}
