package com.MyProg.figure;

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
}
