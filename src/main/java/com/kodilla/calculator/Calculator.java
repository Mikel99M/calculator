package com.kodilla.calculator;

class Kalkulator {

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Kalkulator calculator = new Kalkulator();
        int a = 10;
        int b = 30;
        System.out.println(a+" + "+b+" = " + +calculator.add(a,b));
        System.out.println(a+ " - "+b+ " = " + -calculator.substract(a,b));
    }
}
