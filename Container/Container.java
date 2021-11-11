package com.MyProg.Container;

import com.MyProg.Ball.Ball;
import com.MyProg.Complex.MyComplex;

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

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Container c = (Container) o;
        return getX() == c.getX() && getY() == c.getY() && getX()-getWidth() == c.getX()-c.getWidth() && getY()-getHeight() == c.getY()-c.getHeight();
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31*result + x1;
        result = 31*result + y1;
        result = 31*result + x2;
        result = 31*result + y2;

        return result;
    }
}
