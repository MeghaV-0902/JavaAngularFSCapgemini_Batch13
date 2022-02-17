package com.java8.concepts;

import java.util.Scanner;

class Account
{
    private double balance;
    private double withdrawAmount;
    public Account() {
        this.balance = 50.0;
        //this.withdrawAmount = withdrawAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double WithdrawMoney(double withdrawAmount)
    {
        this.withdrawAmount=withdrawAmount;
        try {
            if (this.balance < this.withdrawAmount) {
                throw new InsuffiecientAmount("Insufficient Fund Exception");
            }
            else
            {
                this.balance=this.balance-this.withdrawAmount;
            }
        }
        catch(InsuffiecientAmount e)
        {
            e.printStackTrace();
            System.out.println("Unable to withdraw as balance is less than withdraw amount!");
        }
        return this.balance;
    }
}

public class TestException
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter current balance: ");
        double currentBal=s.nextDouble();
        System.out.println("enter withdraw anount: ");
        double withdrawAmount= s.nextDouble();

        Account a1=new Account();
        a1.setBalance(currentBal);
        double balance = a1.WithdrawMoney(withdrawAmount);
        System.out.println("Balance = "+balance);
    }
}
