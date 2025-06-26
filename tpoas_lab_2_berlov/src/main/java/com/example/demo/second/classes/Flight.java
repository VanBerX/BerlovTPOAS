package com.example.demo.second.classes;

import java.util.Scanner;

public class Flight {

    protected double ticket_price;
    protected int max_seats;

    public void Init(int ms, double tc)
    {
        max_seats = ms;
        ticket_price = tc;
    }
    public void Display()
    {
        System.out.println("Цена за билет: " + ticket_price);

        System.out.println("Максимальное количество мест: " + max_seats);
    }
    public void Read()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите цену за билет");
        ticket_price = in.nextDouble();

        System.out.println("Введите максимальное количество мест");
        max_seats = in.nextInt();
    }
    public double getMaxIncome()
    {
        return ticket_price * max_seats;
    }
}
