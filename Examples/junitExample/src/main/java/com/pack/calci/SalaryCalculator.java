package com.pack.calci;

public class SalaryCalculator {

    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary<0)
        {
            throw  new IllegalArgumentException("Salary should be below 0");

        }
        this.baseSalary = baseSalary;
    }

    public double getGrossIncome()
    {
        return this.baseSalary + getSocialInsurance() + getAdditionalBonus();
    }

    public double getSocialInsurance() {
        return this.baseSalary * 25 / 100;
    }

    public double getAdditionalBonus() {
        return this.baseSalary / 10;
    }



}
