package classes;

import java.util.Scanner;

/**
 *Base class implementing normal flight
*/
public class Flight {

    /**
    *A field that contains the price of a ticket
     */
    protected double ticket_price;
    /**
     *Field containing the capacity of the aircraft
     */
    protected int max_seats;


    /**
     *The method initializes all fields of the class.
     * @param ms number of seats on the plane
     * @param tc ticket price
     */
    public void Init(int ms, double tc)
    {
        max_seats = ms;
        ticket_price = tc;
    }
    /**
     *TThe method prints all the fields of the class to the terminal.
     */
    public void Display()
    {
        System.out.println("Ticket price: " + ticket_price);

        System.out.println("Max seats: " + max_seats);
    }
    /**
     *TThe method prints all the fields of the class to the terminal.
     */
    public void Read()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ticket price");
        ticket_price = in.nextDouble();

        System.out.println("Enter max seats");
        max_seats = in.nextInt();
    }
    /**
     *The method calculates the maximum possible income from a flight
     */
    public double getMaxIncome()
    {
        return ticket_price * max_seats;
    }
}
