package com.MyProg.Car;

public class Car {
    private float x;
    private float fuel_level;
    private float fuel_efficiency;

    public Car(float fuel_level, float fuel_efficiency)
    {
        this.x = 0;
        this.fuel_level = fuel_level;
        this.fuel_efficiency = fuel_efficiency;
    }

    public void Drive(float miles){
        if (fuel_level <= 0)
        {
            return;
        }
        this.x += miles;
        this.fuel_level -= miles*fuel_efficiency;
    }

    public void refuel(float f_l){
        this.fuel_level += f_l;
    }

    public float getX() {
        return x;
    }

    public float getFuel_level() {
        return fuel_level;
    }


}
