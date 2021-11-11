package com.MyProg.Exercise4;

import com.MyProg.Exercise5.Point;

public class Line extends Shape implements Cloneable {
    private Point from;
    private Point to;

    public Line(Point from, Point to){
        super(from);
        this.to = to;
    }

    public Point getCenter(){

        return new Point((to.getX()-from.getX())/2,(to.getY()-from.getY())/2);
    }

    public Line clone() throws CloneNotSupportedException{
        return (Line) super.clone();
    }
}
