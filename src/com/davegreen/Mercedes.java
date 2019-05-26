package com.davegreen;

/**
 * Created by daveg on 20/06/2017.
 */
public class Mercedes extends Car
{
    private boolean satNav;
    private boolean leatherSeats;
    private boolean airCon;

    public Mercedes(String name, String colour, String size, int weight, int speed, int doors, int wheels, int gears, int engineSize, boolean satNav, boolean leatherSeats, boolean airCon)
    {
        super(name, colour, size, weight, speed, doors, wheels, gears, engineSize);
        this.satNav = satNav;
        this.leatherSeats = leatherSeats;
        this.airCon = airCon;
    }

    public void useSatNav(boolean lost)
    {
        if (lost == true)
        {
            System.out.println("You don't need the SatNav you know where your going");
        }
        else

            System.out.println("You are now following the SatNav!");
    }

    public void useAirCon(int temp)
    {
        if (temp >= 80)
        {
            System.out.println("The temperature outside is " + temp + " so you have switched the air conditioning on!");
        }
        else
        {
            System.out.println("The air conditioning is off!");
        }
    }
}
