package com.MyProg.figure;


import java.util.Objects;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(){
    }

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea(){
        double area = length*width;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2*length+2*width;
        return perimeter;
    }

    public String toString(){
        return "Rectangle { length = " + length + ", width = " + width + "}";
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Rectangle c = (Rectangle) o;
        return getLength() == c.getLength() && getWidth() == c.getWidth();
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31*result + (length != +0.0f ? Float.floatToIntBits(length) : 0);
        result = 31*result + (width != +0.0f ? Float.floatToIntBits(width) : 0);

        return result;
    }
}
