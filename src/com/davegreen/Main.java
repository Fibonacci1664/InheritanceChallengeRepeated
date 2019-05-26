package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle("Dave's Car", "White", "4 x 4", 2000, 0);
        Car car = new Car("Dave's Car", "White", "4 x 4", 2000, 0, 5, 4, 5, 2000);
        Mercedes mercedes = new Mercedes("Dave's Car", "White", "4 x 4", 2000, 0, 5, 4, 5, 2000, true, true, true);

        car.drive(27);
        car.decelerate(20);

        vehicle.directionFacing(152);

        mercedes.useSatNav(false);
        mercedes.useAirCon(92);

    }
}
