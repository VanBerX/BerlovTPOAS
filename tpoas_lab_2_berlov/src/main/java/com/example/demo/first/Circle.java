package com.example.demo.first;

import java.util.Scanner;

public class Circle
{
    protected double x;
    protected double y;
    protected double radius;

    public Circle()
    {
        x = 0;
        y = 0;
        radius = 0;
    }
    public Circle(double xx, double yy, double r)
    {
        x = xx;
        y = yy;
        radius = r;
    }
    public void Init(double xx, double yy, double r)
    {
        x = xx;
        y = yy;
        radius = r;
    }
    public void Read()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Dведите x:");
        x = in.nextInt();

        System.out.println("Dведите y:");
        y = in.nextInt();

        System.out.println("Dведите радиус:");
        radius = in.nextInt();
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public double getRadius()
    {
        return radius;
    }
    public void Display()
    {
        System.out.println("x: " + x);

        System.out.println("y: " + y);

        System.out.println("радиус: " + radius);
    }
    public double getDistanceOrigin()
    {
        return Math.sqrt(x*x + y*y);
    }
    public Circle Add(Circle c1, Circle c2)
    {
        double new_x = (c1.x + c2.x) / 2;
        double new_y = (c1.y + c2.y) / 2;
        double new_radius = (c1.radius + c2.radius) / 2;
        Circle c3 = new Circle(new_x, new_y, new_radius);
        return c3;
    }
}
