package com.example.demo;

import com.example.demo.second.classes.FlightBedSheets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlightBedSheetsTest
{
    private FlightBedSheets fl;

    @BeforeEach
    void setUp()
    {
        fl = new FlightBedSheets();
    }
    @Test
    void FlightMxSheetsGetMaxIncome()
    {
        fl.Init(20, 100, 0.5);
        double test = fl.getMaxIncome();
        Assertions.assertEquals(2025, test);
    }
    @Test
    void FlightMxSheetsGetMaxIncomeWithout()
    {
        fl.Init(20, 100, 0);
        double test = fl.getMaxIncome();
        Assertions.assertEquals(2000, test);
    }
}
