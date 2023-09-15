package org.example.Service;

import org.example.DTO.BankAccount;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BankAccountService {
    private List<BankAccount> bankAccountList;

    public BankAccountService() {
        bankAccountList = new ArrayList<>();
    }

//    public List<BankAccount> getBankAccountList(){
//        return bankAccountList;
//    }

    public void addBankAccount(BankAccount account){
        bankAccountList.add(account);
    }

    public void updateBankAccount(BankAccount account){
        int index = account.getAccountNumber()-1;
        if(index == -1){
            System.out.println("Account does not exist.");
        }
        else
            bankAccountList.set(index, account);
    }

    public boolean deleteBankAccount(int accountNumber){
        boolean found = false;
        for(BankAccount x: bankAccountList){
            if(x.getAccountNumber() == accountNumber){
                bankAccountList.remove(x);
                found = true;
                return found;
            }
        }return found;
    }

    public ArrayList<BankAccount> getBankAccountList() {
        return new ArrayList<>(bankAccountList);
    }

    public BankAccount findBankAccount(int accountNumber)
    {
        for(BankAccount x: bankAccountList){
            if(x.getAccountNumber() == accountNumber){
                return x;
            }
        }
        return null;
    }

    public double findBalanceByBankAccount(int accountNumber)
    {
        for(BankAccount x: bankAccountList){
            if(x.getAccountNumber() == accountNumber){
                return x.getBalance();
            }
        }
        return -1;
    }

    public void withdraw(int accountNumber, double amount){
        for(BankAccount x: bankAccountList) {
            if (x.getAccountNumber() == accountNumber) {
                double newBalance = x.getBalance() - amount;
                x.setBalance(newBalance);
            }
        }
    }

    public void deposit(int accountNumber, double amount){
        for(BankAccount x: bankAccountList) {
            if (x.getAccountNumber() == accountNumber) {
                double newBalance = x.getBalance() + amount;
                x.setBalance(newBalance);
            }
        }
    }
}

// BankAccountList = {[BankAccount: user1], [BankAccount: user2], [BankAccount: user3], [BankAccount: user4]}

