package demos;

//import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class BankAccount
{
    private Integer balance;
    public BankAccount(Integer IntialBalance)
    {
        balance=IntialBalance;
    }
    public Integer withdraw(Integer amount)
    {
        if(balance<amount)
        {
            throw new NotEnoughFundsExceptoin(amount,balance);
        }
        balance-=amount;
        return balance;
    }
}
class NotEnoughFundsExceptoin extends RuntimeException
{
    NotEnoughFundsExceptoin(Integer amount,Integer balance)
    {
        super("Attempted to withdraw"+amount+"with the balance of"+balance);
    }
}
public class Actitvity2 {
    @Test
    public void notEnough()
    {
        BankAccount bank=new BankAccount(10);
        assertThrows(NotEnoughFundsExceptoin.class, () -> {
    bank.withdraw(11);
});


    }
    public void enoughFunds()
    {
        BankAccount bank=new BankAccount(100);
        assertDoesNotThrow(() -> bank.withdraw(50));
    }
}
