package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        //int b = calc.minus.apply(1,1); в результате b=0, в строке 10 делить на 0 нельзя
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        if ( c == 0) {
            System.out.println("Делить на 0 нельзя");
        } else {
            calc.println.accept(c);
        }
    }
}
