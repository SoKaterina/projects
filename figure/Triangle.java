package com.MyProg.figure;

import com.MyProg.Point.MyPoint;

public class Triangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint(x1,y1);
        v2 = new MyPoint(x2,y2);
        v3 = new MyPoint(x3,y3);
    }

    public Triangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString(){
        return "My Triangle[v1="+v1.toString()+",v2="+v2.toString()+",v3="+v3.toString()+"]";
    }

    public double getPerimeter(){
        double perimeter = v1.distance(v2)+v1.distance(v3)+ v2.distance(v3);
        return perimeter;
    }

    public String getType(){
        String type;
        //don`t exist here Equilateral
        if((v1.distance(v2)==v2.distance(v3))&&(v1.distance(v2) == v1.distance(v3))){
            type = "Equilateral";
        }
        else if((v1.distance(v2) == v2.distance(v3)) || (v1.distance(v2) == v1.distance(v3)) || (v2.distance(v3) == v1.distance(v3))){
            type = "Isosceles";
        }
        else{
            type = "Scalene";
        }
        return type;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Triangle c = (Triangle) o;
        return v1.equals(c.v1) && v2.equals(c.v2) && v3.equals(c.v3);
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31*result + v1.hashCode();
        result = 31*result + v2.hashCode();
        result = 31*result + v3.hashCode();

        return result;
    }
}
