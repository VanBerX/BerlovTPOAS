package com.example.demo.first;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Circle cir1 = new Circle(0, 0, 0);
        System.out.println("Введите данные о круге 1:");
        cir1.Read();
        System.out.println("Круг 1:");
        cir1.Display();
        System.out.println("Расстояние до начала координат: " + cir1.getDistanceOrigin());

        Circle cir2 = new Circle(0, 0, 0);
        cir2.Init(3, 2, 2);
        System.out.println("Круг 2:");
        cir2.Display();
        System.out.println("Расстояние до начала координат: " + cir2.getDistanceOrigin());

        Clinder clir1 = new Clinder(0, 0, 0, 0);
        System.out.println("Введите данные о цилиндре 1:");
        clir1.Read();
        System.out.println("Введите высоту");
        clir1.putZ(in.nextDouble());
        System.out.println("Цилиндр 1:");
        clir1.Display();
        System.out.println("Расстояние до начала координат: " + clir1.getDistanceOrigin());

        Clinder clir2 = new Clinder(0, 0, 0, 0);
        clir2.Init(3, 2, 2, 0.5);
        System.out.println("Цилиндр 2:");
        clir2.Display();
        System.out.println("Расстояние до начала координат: " + clir2.getDistanceOrigin());
    }
}