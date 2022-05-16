import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {
    @Test
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance(), 1);
    }

    @Test
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(400, 0);
        bankAccount.deposit(500);
        assertEquals(900, bankAccount.getBalance(),1);
    }
}
