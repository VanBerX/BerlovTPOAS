package com.example.demo;

import com.example.demo.second.classes.Flight;
import com.example.demo.second.classes.FlightBedSheets;
import com.example.demo.second.classes.Route;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RouteTest
{
    private Route route;

    @BeforeEach
    void setUp()
    {
        route = new Route();
        Flight fl1 = new Flight();
        fl1.Init(100, 20);
        FlightBedSheets fl2 = new FlightBedSheets();
        fl2.Init(500, 2, 1);
        route.Init("Test", fl1, fl2, 1, 0.5);
    }
    @Test
    void RouteRealIncome()
    {
        double test = route.getRealIncome();
        Assertions.assertEquals(2525, test);
    }
    @Test
    void RouteMostIncomeFl1()
    {
        Flight tmp = route.getMostIncomeFlight();
        double test = tmp.getMaxIncome();
        Assertions.assertEquals(2000, test);
    }
    @Test
    void RouteMostIncomeFl2()
    {
        Flight tmp = route.getMostIncomeFlight();
        double test = tmp.getMaxIncome();
        Assertions.assertEquals(2000, test);
    }

}
