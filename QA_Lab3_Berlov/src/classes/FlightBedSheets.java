package classes;

import java.util.Scanner;


/**
 *Class inherited from Flight. It allows you to specify what percentage of passengers will take additional bedding
 */
public class FlightBedSheets extends Flight
{
    /**
     *A field that stores the percentage of passengers who will use the bedding
     */
    private double bed_sheets_percent;

    /**
     *The method initializes all fields of the class.
     * @param s number of seats on the plane
     * @param tc ticket price
     * @param bsp percentage of passengers with bed linen
     */
    public void Init(int s, double tc, double bsp)
    {
       super.Init(s, tc);
       bed_sheets_percent = bsp;
    }
    /**
     *TThe method prints all the fields of the class to the terminal.
     */
    public void Display()
    {
        super.Display();
        System.out.println("Number of people who will use the bedding: " + bed_sheets_percent);
    }
    /**
     *TThe method prints all the fields of the class to the terminal.
     */
    public void Read()
    {
        Scanner in = new Scanner(System.in);
        super.Read();
        System.out.println("Enter the number of people who will use the bedding");
        bed_sheets_percent = in.nextDouble();
    }
    /**
     *The method calculates the maximum possible income from a flight taking into account passengers who took bed linen
     * Here is a visual representation of the difference in calculations.
     * <p>
     * <img src="{@docRoot}/images/image.png" alt="difference in counting" width="400">
     */
    public double getMaxIncome()
    {
        return max_seats * ticket_price + 50 * max_seats * bed_sheets_percent;
    }
}
