package junit;

import Inheritance.exercises.bankaccount.BankAccountFlexible;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccountFlexible account1;
    private BankAccountFlexible account2;

    @BeforeEach
    public void setup() throws Exception {
    }

    @Test
    public void instanceTest() {
        account1 = new BankAccountFlexible("IBAN1");
        account2 = new BankAccountFlexible("IBAN2");
        assertEquals(account2.amount,0.0);
    }

   /* @Test
    public void operationsTest() {
        fail("Not yet implemented");
    }

    @Test
    public void printBalanceTest() {
        fail("Not yet implemented");
    }
*/


}
