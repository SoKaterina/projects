package com.MyProg.Container;

import com.MyProg.Ball.Ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height){
        x1 = x;
        y1 = y;
        x2 = x1 + width;
        y2 = y1 + height;
    }

    public int getX(){
        return x1;
    }

    public int getY(){
        return y1;
    }

    public int getWidth(){
        return (x2-x1);
    }

    public int getHeight(){
        return (y2-y1);
    }

    public boolean collides(Ball ball){
        if((x2-2*x1-ball.getX()>=ball.getRadius())&&
                (this.getWidth()-(x2-2*x1-ball.getX())>= ball.getRadius())&&(y2-2*y1-ball.getY()>=ball.getRadius())&&(this.getHeight()-(y2-2*y1-ball.getY())>=ball.getRadius())){
            return true;
        }
        else return false;
    }

    public String toString(){
        return "Container[("+x1+","+y1+"),("+x2+","+y2+")]";
    }
}
