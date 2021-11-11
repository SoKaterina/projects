package com.MyProg.Exercise4;

import com.MyProg.Exercise5.Point;

public class Circle extends Shape implements Cloneable {
    private Point center;
    private double radius;

    public Circle(Point center, double radius){
        super(center);
        this.radius = radius;
    }

    public Point getCenter(){
        return center;
    }

    public Circle clone() throws CloneNotSupportedException{
        return (Circle) super.clone();
    }
}
