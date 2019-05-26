package com.davegreen;

/**
 * Created by daveg on 20/06/2017.
 */
public class Vehicle
{
    private String name;
    private String colour;
    private String size;
    private int weight;
    private int speed;


    public Vehicle(String name, String colour, String size, int weight, int speed)
    {
        this.name = name;
        this.colour = colour;
        this.size = size;
        this.weight = weight;
        this.speed = speed;
    }

    public int acceleration (int newSpeed)
    {
        this.speed += newSpeed;
        System.out.println("Your current speed is now " + this.speed);
        return this.speed;
    }

    public int decelerate(int deceleration)
    {
        this.speed -= deceleration;
        System.out.println("Your current speed is now " + this.speed);
        return this.speed;
    }

    public void directionFacing(int orientation)
    {
        if(orientation > 0 && orientation <= 89)
        {
            System.out.println("You are travelling at " + orientation + " degrees in a north easterly direction");
        }
        else if(orientation >= 90 && orientation <= 179)
        {
            System.out.println("You are travelling at " + orientation + " degrees in a south easterly direction");
        }
        else if(orientation >= 180 && orientation <= 269)
        {
            System.out.println("You are travelling at " + orientation + " degrees in a south westerly direction");
        }
        else if(orientation >= 270 && orientation <=360)
        {
            System.out.println("You are travelling at " + orientation + " degrees in a north westerly direction");
        }
        else
        {
            System.out.println("You are lost and do not know which direction you face");
        }
    }
}
