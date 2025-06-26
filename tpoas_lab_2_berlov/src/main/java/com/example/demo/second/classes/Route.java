package com.example.demo.second.classes;;

import java.util.Scanner;

public class Route
{
    private String name;

    private Flight flight1;
    private FlightBedSheets flight2;

    private double flight_percent1;
    private double flight_percent2;

    public void Init(String str, Flight fl1, FlightBedSheets fl2, double fl_per1, double fl_per2)
    {
        name = str;
        flight1 = fl1;
        flight2 = fl2;
        flight_percent1 = fl_per1;
        flight_percent2 = fl_per2;
    }
    public void Read()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название маршрута");
        name = in.next();

        System.out.println("Ввод первого рейса");
        flight1.Read();

        System.out.println("Введите процент заполненности первого рейса");
        flight_percent1 = in.nextDouble();

        System.out.println("Ввод второго рейса");
        flight2.Read();

        System.out.println( "Введите процент заполненности второго рейса");
        flight_percent2 = in.nextDouble();
    }
    public void Display()
    {
        System.out.println( "Название маршрута: " + name);

        System.out.println("Первый рейс");
        flight1.Display();

        System.out.println("Заполененность 1 рейса: " + flight_percent1 );

        System.out.println("Второй рейс");
        flight2.Display();

        System.out.println("Заполененность 2 рейса: " + flight_percent2);
    }
    public double getRealIncome()
    {
        double res = flight1.getMaxIncome() * flight_percent1;
        res += flight2.getMaxIncome() * flight_percent2;
        return res;
    }
    public Flight getMostIncomeFlight()
    {
        double income1 = flight1.getMaxIncome();
        double income2 = flight2.getMaxIncome();

        if (income1 > income2)
            return flight1;
        return flight2;
    }
}
