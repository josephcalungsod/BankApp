import org.example.DTO.BankAccount;
import org.example.Service.BankAccountService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class BankAppTest {

    BankAccountService bankAccountService = new BankAccountService();


    @Before
    public void setup()
    {
        bankAccountService.addBankAccount(new BankAccount(1, "Tom", 3400.2));
        bankAccountService.addBankAccount(new BankAccount(2, "Joe", 4700.6));
        bankAccountService.addBankAccount(new BankAccount(3, "Jerry", 5000.7));
        bankAccountService.addBankAccount(new BankAccount(4, "Bob", 2060.5));
        bankAccountService.addBankAccount(new BankAccount(5, "Tim", 2780.8));
        bankAccountService.addBankAccount(new BankAccount(6, "Sarah", 6750.5));
    }

    @Test
    public void findBalanceByBankAccountTest()
    {

        double expectedResult = 6750.5;
        double actualResult = bankAccountService.findBalanceByBankAccount(6);
        Assert.assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    public void withdrawTest()
    {
        double expectedResult = 4000.7;
        bankAccountService.withdraw(3, 1000.0);
        double actualResult = bankAccountService.findBalanceByBankAccount(3);
        Assert.assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    public void depositTest()
    {
        double expectedResult = 6000.7;
        bankAccountService.deposit(3, 1000.0);
        double actualResult = bankAccountService.findBalanceByBankAccount(3);
        Assert.assertEquals(expectedResult, actualResult, 0.1);
    }


//    @Test
//    public void updateBankAccountTest()
//    {
//        String expectedResult = "BankAccount{accountNumber=2, customerName='Joe', balance=5200.9}";
//        bankAccountService.updateBankAccount(new BankAccount(2, "Joe", 5200.9));
//        ArrayList<BankAccount> accountList = bankAccountService.getBankAccountList();
//        String actual = "";
//        for (BankAccount x: accountList){
//            if(x.getAccountNumber() == 2)
//                actual = x.toString();
//        }
//        Assert.assertEquals
//    }

    // git commit test






}
