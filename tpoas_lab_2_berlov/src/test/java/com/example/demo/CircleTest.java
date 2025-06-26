package com.example.demo;

import com.example.demo.first.Circle;
import com.example.demo.second.classes.FlightBedSheets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest
{
    private Circle cir1;
    private Circle cir2;
    private Circle cir3;

    @BeforeEach
    void setUp()
    {
        cir1 = new Circle();
        cir1.Init(3, -4, 7);
        cir2 = new Circle();
        cir2.Init(-5, 12, 6);
        cir3 = cir1.Add(cir1, cir2);
    }
    @Test
    void CircleDistanceOriginTest()
    {
        Circle cir = new Circle();
        cir.Init(3, -4, 7);
        double test = cir.getDistanceOrigin();
        Assertions.assertEquals(5, test);
    }
    @Test
    void CircleAddTestX()
    {
        double testX = cir3.getX();
        Assertions.assertEquals(-1, testX);
    }
    @Test
    void CircleAddTestY()
    {
        double testY = cir3.getY();
        Assertions.assertEquals(4, testY);
    }
    @Test
    void CircleAddTestRadius()
    {
        double testRadius = cir3.getRadius();
        Assertions.assertEquals(6.5, testRadius);
    }
}
