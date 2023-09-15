package org.example;


import org.example.DTO.BankAccount;
import org.example.Service.BankAccountService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BankAccountService bankAccountService = new BankAccountService();
      //  bankAcountService.bankAccountList();

        bankAccountService.addBankAccount(new BankAccount(1, "Tom", 3400.2));
        bankAccountService.addBankAccount(new BankAccount(2, "Joe", 4700.6));
        bankAccountService.addBankAccount(new BankAccount(3, "Jerry", 5000.7));
        bankAccountService.addBankAccount(new BankAccount(4, "Bob", 2060.5));
        bankAccountService.addBankAccount(new BankAccount(5, "Tim", 2780.8));
        bankAccountService.addBankAccount(new BankAccount(6, "Sarah", 6750.5));

        ArrayList<BankAccount> accountlist = bankAccountService.getBankAccountList();
        for (BankAccount x: accountlist){
            System.out.println(x);
        }

        bankAccountService.updateBankAccount(new BankAccount(2, "Joe", 5200.9));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        ArrayList<BankAccount> accountlist2 = bankAccountService.getBankAccountList();
        for (BankAccount x: accountlist2){
            System.out.println(x);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        bankAccountService.deleteBankAccount(5);
        ArrayList<BankAccount> accountlist3 = bankAccountService.getBankAccountList();
        for (BankAccount x: accountlist3){
            System.out.println(x);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(bankAccountService.findBankAccount(2));

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(bankAccountService.findBalanceByBankAccount(3));

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        bankAccountService.withdraw(3, 1000.0);
        System.out.println(bankAccountService.findBalanceByBankAccount(3));

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        bankAccountService.deposit(3, 1000.0);
        System.out.println(bankAccountService.findBalanceByBankAccount(3));

    }
}