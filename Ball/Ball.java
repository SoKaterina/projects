package com.MyProg.ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x,float y, int radius, int speed, int direction){
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = speed*(float)Math.cos((double)(direction));
        yDelta = (-1)*speed*(float)Math.sin((double)(direction));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal(){
        xDelta = -1*xDelta;
    }

    public void reflectVertical(){
        yDelta = -1*yDelta;
    }

    public String toString(){
        return "Ball[("+x+","+y+"), speed=("+xDelta+","+yDelta+")]";
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return getX() == ball.getX() && getY() == ball.getY() && getRadius() == ball.getRadius() && getXDelta() == ball.getXDelta() && getYDelta()==ball.getYDelta();
    }

    @Override
    public int hashCode(){
        int result = 17;

        result = 31*result + (x != +0.0f ? Float.floatToIntBits(x) : 0);
        result = 31*result + (y != +0.0f ? Float.floatToIntBits(y) : 0);
        result = 31*result + radius;
        result = 31*result + (xDelta != +0.0f ? Float.floatToIntBits(xDelta) : 0);
        result = 31*result + (yDelta != +0.0f ? Float.floatToIntBits(yDelta) : 0);

        return result;
    }
}
