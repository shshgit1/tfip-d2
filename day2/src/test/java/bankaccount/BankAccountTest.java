package bankaccount;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BankAccountTest{
  
    public static void main(String[] args) {
        BankAccountTest kk=new BankAccountTest();
        kk.testDeposit();
    }
            @Test
        public void testGetName() {
            bankaccount account = new bankaccount("Pink Panther",12);
            assertTrue(account.getName().equals("Pink Panther"));
            System.out.println("testGetName successful");
            System.out.println(account.getName());
        }
        @Test
        public void testAccountNum()
        {
            bankaccount testacc = new bankaccount("test one",33);
            assertTrue(!testacc.getAccountNumber().isEmpty());
            System.out.println(testacc.getAccountNumber());
        }
        @Test
        public void testGetAccountBal()
        {
            bankaccount testacc = new bankaccount("test one",33);
            assertTrue(testacc.getAccountBalance()==33);
            System.out.println(testacc.getAccountBalance());
        }
        @Test
        public void testSetAccountBal()
        {
            bankaccount testacc = new bankaccount("test one",33);
            testacc.setAccountBalance(78);
            assertTrue(testacc.getAccountBalance()==78);
            
            System.out.println(testacc.getAccountBalance());

        }
        @Test
        public void isClosedWorking()
        {
            bankaccount testacc = new bankaccount("test one",33);
            testacc.isIsClosed();
            if (testacc.isIsClosed()){
                String a="closed";
                System.out.println("bank is +"+ a);
                           }
                           else
                           {
                               System.out.println("bank is open");
                           }
                        }

    @Test
       public void testDeposit()
         {
              bankaccount testacc = new bankaccount("test one",33);
              testacc.deposit(55f);

              float a=testacc.getAccountBalance();
              assertTrue(a==88f);

              System.out.println(a);

              

         }
        
}
