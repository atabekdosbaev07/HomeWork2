package com.company;

public class Triangle {

    double a;
    double b;
    double c;

     void area(){
         System.out.println("1 бети: "+a);
         System.out.println("2 бети: "+b);
         System.out.println("3 бети: "+c);

         double p = (a+b+c)/2d;
         double n =  Math.sqrt(p * (p - a) * (p - b) * (p - c));

         System.out.println("Уч бурчтуктун аянты = "+n);


    }


}
