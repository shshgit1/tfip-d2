package bankaccount;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class bankaccount{
private String name;
private String accountNumber;
public float accountBalance=0f;
private List<String> transactions;
private boolean isClosed;
private String accountCreateDate;
private String accountCloseDate;


public bankaccount()
{
}
public bankaccount(String name, float balance)
{this.accountBalance=balance;

    this.name=name;
    this.accountBalance=balance;
    this.accountNumber=Integer.toString((int)(Math.random()*1000000000));
transactions=new ArrayList<>();

}
    public static void main(String[] args) {
        
    }

       public float getAccountBalance() {
        return accountBalance;
    }
    public String setName(String name)
    {
        return this.name=name;

    }
    public String getName()
    {
        
        return this.name;

    }
    public String getAccountNumber()
    {
        return this.accountNumber;
    }
 
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

      public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public boolean isIsClosed() {
        return this.isClosed;
    }
    public void setIsClosed(boolean isClosed) {
        this.isClosed = true;
    }
    public String getAccountCreateDate() {
        return accountCreateDate;
    }
    public void setAccountCreateDate(String accountCreateDate) {
        this.accountCreateDate = accountCreateDate;
    }
    public String getAccountCloseDate() {
        return accountCloseDate;
    }
    public void setAccountCloseDate(String accountCloseDate) {
        this.accountCloseDate = accountCloseDate;
    }
    public void deposit(float amount)
    { /* if (amount<0 || isClosed)
        {
            throw new IllegalArgumentException();
        }
      String deptransaction= "Deposit" + amount + " at "+ Calendar.getInstance().getTimeInMillis();
               transactions.add(deptransaction); */
        String deptransaction= "Deposit" + amount + " at "+ Calendar.getInstance().getTimeInMillis();
        transactions.add(deptransaction);
         this.accountBalance=this.accountBalance+amount;

    }
    public void withdraw(float amount)
    {
        if (amount>accountBalance || isClosed)
        {
            throw new IllegalArgumentException();
        }
       String transaction= "Withdraw" + amount + " at "+ Calendar.getInstance().getTimeInMillis();
               transactions.add(transaction);
               this.accountBalance=amount-this.accountBalance;

    }
}