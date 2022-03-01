package com.pack.calci;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SalaryCalculatorTest {


    private SalaryCalculator salaryCalculator;

    @BeforeEach
    void init()
    {
        salaryCalculator=new SalaryCalculator();
    }
    @Test
    void testBaseSalary()
    {
        double baseSalary=4000;
        salaryCalculator.setBaseSalary(baseSalary);
        double expectedSocialInsurance = baseSalary * 0.25;

        assertEquals(expectedSocialInsurance,salaryCalculator.getSocialInsurance());
        double expectedAdditionalBonus = baseSalary * 0.1;
        assertEquals(expectedAdditionalBonus , salaryCalculator.getAdditionalBonus());

        double exprectedGrossIncome = baseSalary + expectedSocialInsurance + expectedAdditionalBonus ;
        assertEquals( exprectedGrossIncome,salaryCalculator.getGrossIncome());
    }

    @DisplayName(" Testing for invalid salary calculator..")

    @Test
    public void invalidSalaryCalculatorTest()
    {
        double basesalary = -10;
        assertThrows(IllegalArgumentException.class, () -> {
            salaryCalculator.setBaseSalary(basesalary);
        });
    }
    @AfterEach
    public void teardown() throws Exception {
        salaryCalculator = null;
    }

}