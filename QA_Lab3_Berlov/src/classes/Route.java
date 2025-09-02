package classes;

import java.util.Scanner;


/**
 *Class implementing the route
 */
public class Route
{
    /**
     *A field that stores the name of the route
     */
    private String name;

    /**
     *A field that contains the basic flight
     */
    private Flight flight1;
    /**
     *Field that holds a flight with bed linen
     */
    private FlightBedSheets flight2;

    /**
     *A field that stores the percentage of the first flight filled
     */
    private double flight_percent1;
    /**
     *A field that stores the percentage of the second flight filled
     */
    private double flight_percent2;

    /**
     *The method initializes all fields of the class.
     * @param str route name
     * @param fl1 base flight
     * @param fl2 flight with bed linen
     * @param fl_per1 first flight occupancy rate
     * @param fl_per2 second flight occupancy rate
     */
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

        System.out.println("Enter route name");
        name = in.next();

        System.out.println("Enter first flight");
        flight1.Read();

        System.out.println("Enter the percentage of occupancy of the first flight");
        flight_percent1 = in.nextDouble();

        System.out.println("Enter second flight");
        flight2.Read();

        System.out.println( "Enter the percentage of occupancy of the second flight");
        flight_percent2 = in.nextDouble();
    }
    public void Display()
    {
        System.out.println( "Route name: " + name);

        System.out.println("First flight");
        flight1.Display();

        System.out.println("Percentage of occupancy of the first flight: " + flight_percent1 );

        System.out.println("Second flight");
        flight2.Display();

        System.out.println("Percentage of occupancy of the second flight: " + flight_percent2);
    }
    /**
     * The method calculates the actual income of the first and second flights and then returns their sum.
     * A general photo for calculation is presented below.
     * <pre>
        Income = (s1 * p1) * r1 + (s2 * p2 + 50 * s2 * b) * r2
        Where:
        s1, s2: number of seats on the flight
        p1, p2: ticket price on the flight
        r1, r2: flight occupancy percentage
        b: percentage of passengers with bed linen
     *</pre>
     */
    public double getRealIncome()
    {
        double res = flight1.getMaxIncome() * flight_percent1;
        res += flight2.getMaxIncome() * flight_percent2;
        return res;
    }
    /**
     * The method returns the flight with maximum profitability.
     */
    public Flight getMostIncomeFlight()
    {
        double income1 = flight1.getMaxIncome();
        double income2 = flight2.getMaxIncome();

        if (income1 > income2)
            return flight1;
        return flight2;
    }
}
