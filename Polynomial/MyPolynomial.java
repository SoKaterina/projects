package com.MyProg.Polynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }

    public double[] getCoeffs(){
        return coeffs;
    }

    public void setCoeffs(double[] coef){
        this.coeffs= coef;
    }

    public int getDegree(){
        return (coeffs.length - 1);
    }

    public String toString(){
        String pol = "";
        for(int i=coeffs.length-1;i>=0;i--){
            if(i == 0){
                pol +=coeffs[i];
            }
            else {
                pol +=coeffs[i]+"n^"+i+"+";
            }
        }
        return pol;
    }

    public double evaluate(double x){
        double ev = 0;
        for(int i=coeffs.length-1;i>=0;i--){
        ev = ev  + coeffs[i] * Math.pow(x,i);
        }
        return ev;
    }

    public MyPolynomial add(MyPolynomial right){
        int max = Math.max(this.getDegree(), right.getDegree());
        int min = Math.min(this.getDegree(), right.getDegree());
        double[] mas = new double[max+1];
        for (int i=0; i<=min; i++) {
            mas[i] = coeffs[i] + right.getCoeffs()[i];
        }
        if(this.getDegree()>right.getDegree()){
           for(int i = min+1;i<=max;i++){
               mas[i]=this.getCoeffs()[i];
           }
        }
        if(this.getDegree()<right.getDegree()){
            for(int i = min+1;i<=max;i++){
                mas[i]=right.getCoeffs()[i];
            }
        }
        return new MyPolynomial(mas);
    }

    public MyPolynomial multiply(MyPolynomial right){
        double[] mas = new double[this.getDegree()+right.getDegree()+1];
       for(int i=0;i< mas.length;i++)
       {
           mas[i] = 0;
       }
        for(int i = 0; i<this.getDegree()+1;i++){
            for (int j=0;j<right.getDegree()+1;j++)
            {
                mas[i+j] += this.getCoeffs()[i]*right.getCoeffs()[j];
            }
        }
        return new MyPolynomial(mas);
    }
}
