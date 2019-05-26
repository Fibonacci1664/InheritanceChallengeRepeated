package com.davegreen;

/**
 * Created by daveg on 20/06/2017.
 */
public class Car extends Vehicle
{
    private int doors;
    private int wheels;
    private int gears;
    private int engineSize;


    public Car(String name, String colour, String size, int weight, int speed, int doors, int wheels, int gears, int engineSize)
    {
        super(name, colour, size, weight, speed);
        this.doors = doors;
        this.wheels = wheels;
        this.gears = gears;
        this.engineSize = engineSize;
    }

    public void drive(int speed)
    {
        super.acceleration(speed);
        int newSpeed = speed;
        changeGears(newSpeed);
    }

    @Override
    public int decelerate(int deceleration)
    {
        System.out.println("You are slowing down by " + deceleration);
        super.decelerate(deceleration);
        changeGears(deceleration);
        return 1;
    }

    public int changeGears(int newSpeed)
    {

        if(newSpeed > 0 && newSpeed <= 15)
        {
            System.out.println("You are in 1st gear");
            return newSpeed;
        }
        else if(newSpeed > 15 && newSpeed <= 20)
        {
            System.out.println("You are in 2nd gear");
            return newSpeed;
        }
        else if(newSpeed > 20 && newSpeed <= 30)
        {
            System.out.println("You are in 3rd gear");
            return newSpeed;
        }
        else if(newSpeed > 30 && newSpeed <= 40)
        {
            System.out.println("You are in 4th gear");
            return newSpeed;
        }
        else if(newSpeed > 40)
        {
            System.out.println("You are in 5th gear");
            return newSpeed;
        }
        else
        {
            System.out.println("You are not moving!");
        }

        return 1;
    }



}
