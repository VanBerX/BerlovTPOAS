package com.example.demo.second;

import com.example.demo.second.classes.Flight;
import com.example.demo.second.classes.FlightBedSheets;
import com.example.demo.second.classes.Route;

public class Main {
    public static void main(String[] args)
    {
        Flight fl1 = new Flight();
        fl1.Init(0, 0);

        FlightBedSheets fl2 = new FlightBedSheets();
        fl2.Init(0, 0, 0);

        String name = "Маршрут";

        Route route = new Route();
        route.Init(name, fl1, fl2, 0, 0);

        System.out.println("Ввод информации о маршруте");
        route.Read();

        System.out.println("Информация о маршруте");
        route.Display();

        System.out.println("Реальный доход маршрута: " + route.getRealIncome());
    }
}