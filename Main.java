package com.MyProg;

import com.MyProg.Ex1Ex2.Employee;
import com.MyProg.Ex1Ex2.IMeasurable;
import com.MyProg.Exercise5.Point;

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Exercise 1
        System.out.println("--Exercise 1--");
        System.out.println("Print integer");
        String name = in.nextLine();
        int num = Integer.parseInt(name);
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num).toUpperCase());

        //Exercise 2
        System.out.println("--Exercise 2--");
        System.out.println("Print integer");
        name = in.nextLine();
        in.close();
        num = Integer.parseInt(name);
        while(num<0){
            num +=359;
        }
        System.out.println("with % ="+num%360);
        System.out.println("with floorMod ="+Math.floorMod(num,360));

        //Exercise 3
        System.out.println("--Exercise 3--");
        Random rnd = new Random(System.currentTimeMillis());
        int num1 = rnd.nextInt(100 - 1); //0..100
        int num2 = rnd.nextInt(100 - 1);
        int num3 = rnd.nextInt(100 - 1);
        System.out.println(num1+" "+num2+" "+num3);
        if(num1>=num2){
            if(num1>=num3){
                System.out.println("max = "+num1);
            }
            else{
                System.out.println("max ="+num3);
            }
        }
        else{
             if(num2>=num3){
                 System.out.println("max ="+num2);
             }
             else{
                 System.out.println("max ="+num3);
             }
        }
        int Max = Math.max(num1,num2);
        Max = Math.max(Max,num3);
        System.out.println("MAX ="+Max);

        //Exercise 4
        System.out.println("--Exercise 4--");
        double dob1 = 0.0;
        System.out.println("MIN_VALUE ="+Math.nextUp(dob1));
        System.out.println("MAX_VALUE ="+Math.nextUp(1.0/dob1));

        //Exercise 6
        System.out.println("--Exercise 6--");
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= 1000; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println("1000! ="+result);

        //Exercise 13
        System.out.println("--Exercise 13--");
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1;i<50;i++) {
            numbers.add(i);
        }
        ArrayList<Integer> lotteryCombination = new ArrayList<>();
        for(int i=0;i<6;i++){
            int ran = rnd.nextInt(numbers.size() - 1);
            lotteryCombination.add(numbers.get(ran));
            numbers.remove(ran);
        }
        Collections.sort(lotteryCombination);
        System.out.println(lotteryCombination);

        //Chapter2 Ex.5
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p.toString());


        //Chapter3 Ex.2
        Employee one = new Employee("Ivan", 10000);
        Employee two = new Employee("Andrey", 20000);

        IMeasurable[] objects = {one, two};

        System.out.println("The average salary: " + average(objects));

        System.out.println("Employee " + ((Employee)largest(objects)).getName()+
                " with the largest salary " + ((Employee)largest(objects)).getSalary());
    }
    public static double average(IMeasurable[] objects){
        double sum = 0;
        for (int i = 0; i < objects.length; i++) {
            sum += objects[i].getMeasure();
        }
        sum /= (double) objects.length;
        return sum;
    }

    public static IMeasurable largest(IMeasurable[] objects) {
        IMeasurable lar = objects[0];
        for (int i = 1; i < objects.length; i++) {
            if (lar.getMeasure() <= objects[i].getMeasure()) {
                lar = objects[i];
            }
        }
        return lar;

    }
}

