package com.company;

public class Main {

    public static void main(String[] args) {
        //task 1
        int a = 81;
        int b = 9;
        int c = a / b;
        int d = a % b;

        System.out.println("task 1: "+c+"; "+d);




        //task 2
        int i = 58;
        int f = 58 % 10;
        int g = (i/10)%10;

        System.out.println("task 2: "+(f+g));



        //task 3
        double h = 3.9;
        double k = Math.round(h);

        System.out.println("task 3: "+k);

    }
}
