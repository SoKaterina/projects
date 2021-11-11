package com.MyProg.Exercise5;

public class Point {
    private double x = 0;
    private double y = 0;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point translate(double x, double y){
        return new Point(this.x+x,this.y+y);
    }

    public Point scale(double a){
        return new Point(this.x*a,this.y*a);
    }

    public String toString(){
        return "("+x+", "+y+")";
    }
}
