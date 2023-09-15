package org.example.Service;

import org.example.DTO.BankAccount;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BankAccountService {
    private List<BankAccount> bankAccountList;

    /**
     * This a constructor for the BankAccountService class. This initializes an abject of ArrayList<>() type when invoked.
     */
    public BankAccountService() {
        bankAccountList = new ArrayList<>();
    }

    /**
     * This method takes an object of type "BankAccount" as input and adds it to an ArrayList of type BankAccount.
     * @param account
     */

    public void addBankAccount(BankAccount account){
        bankAccountList.add(account);
    }

    /**
     * This method takes an object of type "BankAccount" as input, retrieves the "accountNumber" field from the input object and finds the corresponding object.
     * If it exists in the ArrayList of BankAccount objects, it replaces the existing object.
     * @param account
     */

    public void updateBankAccount(BankAccount account){
        int index = account.getAccountNumber()-1;
        if(index == -1){
            System.out.println("Account does not exist.");
        }
        else
            bankAccountList.set(index, account);
    }

    /**
     * @param accountNumber
     * This method searches for an Existing BankAccount object inside the ArrayList with the accountNumber as input, and DELETES the object.
     * @return true if object found and deleted, false otherwise.
     */

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

    /**
     * Returns all the entries of the ArrayList.
     * @return
     */

    public ArrayList<BankAccount> getBankAccountList() {
        return new ArrayList<>(bankAccountList);
    }

    /**
     * This method finds the BankAccount object in the ArrayList corresponding to the accountNumber provided and if it exists, it gets returned.
     * @param accountNumber
     * @return BankAccount
     */

    public BankAccount findBankAccount(int accountNumber)
    {
        for(BankAccount x: bankAccountList){
            if(x.getAccountNumber() == accountNumber){
                return x;
            }
        }
        return null;
    }

    /**
     * This method finds the BankAccount object in the ArrayList corresponding to the accountNumber provided and if it
     * exists, it returns the "balance" field of the object.
     * @param accountNumber
     * @return Double
     */

    public double findBalanceByBankAccount(int accountNumber)
    {
        for(BankAccount x: bankAccountList){
            if(x.getAccountNumber() == accountNumber){
                return x.getBalance();
            }
        }
        return -1;
    }

    /**
     * This method finds the BankAccount object in the ArrayList corresponding to the accountNumber provided and if it
     * exists, it subtracts the amount provided from the "balance" field of the object.
     * @param accountNumber
     * @param amount
     */

    public void withdraw(int accountNumber, double amount){
        for(BankAccount x: bankAccountList) {
            if (x.getAccountNumber() == accountNumber) {
                double newBalance = x.getBalance() - amount;
                x.setBalance(newBalance);
            }
        }
    }

    /**
     * This method finds the BankAccount object in the ArrayList corresponding to the accountNumber provided and if it
     * exists, it adds the amount provided from the "balance" field of the object.
     * @param accountNumber
     * @param amount
     */
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

