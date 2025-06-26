package com.example.demo;

import com.example.demo.second.classes.Flight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlightTest
{
    @Test
    void flightGetMaxIncome()
    {
        Flight fl = new Flight();
        fl.Init(20, 100);
        double test = fl.getMaxIncome();
        Assertions.assertEquals(2000, test);
    }
}
