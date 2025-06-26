package com.example.demo.first;

import com.example.demo.first.Circle;

public class Clinder extends Circle
{
    private double z;

    public Clinder()
    {
        super();
        z = 0;
    }
    public Clinder(double xx, double yy, double r, double zz)
    {
        super(xx, yy, r);
        z = zz;
    }
    public double getDistanceOrigin()
    {
        return Math.sqrt(x * x + y * y + (z * z / 4));
    }
    public void Init(double xx, double yy, double r, double zz)
    {
        super.Init(xx, yy, r);
        z = zz;
    }
    public void Display()
    {
        super.Display();
        System.out.println("высота: " + z);

    }
    public double getZ()
    {
        return z;
    }
    public void putZ(double zz)
    {
        z = zz;
    }
}
