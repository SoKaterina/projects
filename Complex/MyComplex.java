package com.MyProg.Complex;

import com.MyProg.BookClass.Book;

import java.util.Arrays;
import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){}

    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        setReal(real);
        setImag(imag);
    }

    public String toString(){
        return "("+real+"+"+imag+"i)";
    }

    public boolean isReal(){
        if(real != 0.0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isImaginary(){
        if(imag != 0.0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(double real, double imag){
        if((this.real == real)&&(this.imag == imag)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(MyComplex myC){
        return equals(myC.getReal(), myC.getImag());
    }

    public double magnitude(){
        double mod = Math.sqrt(Math.pow(real,2)+Math.pow(imag,2));
        return mod;
    }

    public double argument(){
        if((real == 0.0)&&(imag == 0.0)){
            System.out.println("Аргумент не определен");
            return 0;
        }
        else{
            double arg = Math.atan(imag/real);
            return arg;
        }
    }

    public MyComplex add(MyComplex right){
        real = real+right.getReal();
        imag = imag+right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right){
        MyComplex add = new MyComplex(real+right.getReal(),imag+right.getImag() );
        return add;
    }

    public MyComplex subtract(MyComplex right){
        real = real-right.getReal();
        imag = imag-right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        MyComplex sub = new MyComplex(real-right.getReal(),imag-right.getImag());
        return sub;
    }

    public MyComplex multiply(MyComplex right){
        real = real*right.getReal() - imag*right.getImag();
        imag = real*right.getImag() + right.getReal()*imag;
        return this;
    }

    //(right/this)
    public MyComplex divide(MyComplex right){
        real = (real*right.getReal() + imag*right.getImag())/(Math.pow(real,2)+Math.pow(imag,2));
        imag = (real*right.getImag() - right.getReal()*imag)/(Math.pow(real,2)+Math.pow(imag,2));
        return this;
    }

    public MyComplex conjugate(){
        return new MyComplex(real, -imag);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        MyComplex c = (MyComplex) o;
        return getReal() == c.getReal() && getImag() == c.getImag();
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31*result + Long.valueOf(Double.doubleToLongBits(real)).hashCode();
        result = 31*result + Long.valueOf(Double.doubleToLongBits(imag)).hashCode();

        return result;
    }
}
