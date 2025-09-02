import classes.Flight;
import classes.FlightBedSheets;
import classes.Route;

/**
 *Main program class
 */
public class Main {
    /**
     *The main method, here the capabilities of the program classes are tested
     */
    public static void main(String[] args)
    {
        Flight fl1 = new Flight();
        fl1.Init(0, 0);

        FlightBedSheets fl2 = new FlightBedSheets();
        fl2.Init(0, 0, 0);

        String name = "Route";

        Route route = new Route();
        route.Init(name, fl1, fl2, 0, 0);

        System.out.println("Enter information about route");
        route.Read();

        System.out.println("Information about route");
        route.Display();

        System.out.println("Real income: " + route.getRealIncome());
    }
}