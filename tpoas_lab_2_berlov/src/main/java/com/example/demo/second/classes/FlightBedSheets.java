package com.example.demo.second.classes;;

import java.util.Scanner;

public class FlightBedSheets extends Flight
{
    private double bed_sheets_percent;

    public void Init(int s, double tc, double bsp)
    {
       super.Init(s, tc);
       bed_sheets_percent = bsp;
    }
    public void Display()
    {
        super.Display();
        System.out.println("Количество людей, которые будут использовать постельное белье: " + bed_sheets_percent);
    }
    public void Read()
    {
        Scanner in = new Scanner(System.in);
        super.Read();
        System.out.println("Введите количество людей, которые будут использовать постельное белье");
        bed_sheets_percent = in.nextDouble();
    }
    public double getMaxIncome()
    {
        return max_seats * ticket_price + 50 * bed_sheets_percent;
    }
}
