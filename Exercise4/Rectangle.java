package com.MyProg.Exercise4;

import com.MyProg.Exercise5.Point;

public class Rectangle extends Shape  implements Cloneable{
    private Point topLeft;
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height){
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    public Point getCenter(){

        return new Point(topLeft.getX()+width/2,topLeft.getY()+height/2);
    }

    public Rectangle clone() throws CloneNotSupportedException{
        return (Rectangle) super.clone();
    }
}
