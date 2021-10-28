package com.MyProg.Point;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){}

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] XY = {this.x, this.y};
        return XY;
    }

    public void setXY(int x, int y){
        setX(x);
        setY(y);
    }

    public String toString(){
        return "("+x+", "+y+")";
    }

    public double distance(int x, int y){
        double XY = Math.sqrt(Math.pow(Math.abs(x-this.x),2)+Math.pow(Math.abs(y-this.y),2));
        return XY;
    }

    public double distance(MyPoint myP){
        double XY = Math.sqrt(Math.pow(Math.abs(myP.getX()-this.x),2)+Math.pow(Math.abs(myP.getX()-this.y),2));
        return XY;
    }

    public double distance(){
        double XY = Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
        return XY;
    }
}
