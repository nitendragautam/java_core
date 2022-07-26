package com.nitendratech.algodatastr;

/**
 * swap two numbers without using a third variable
 * 
 * We can’t return multiple variables in Java.
 *  Since Java is Pass-by-Value and these are primitive data types,
 *  their values won’t change. 
 * 
 * It’s a three steps process. 

 */
public class SwapNumber {

    private static void swapNumbers(int a, int b){
        b = b + a; // now b is sum of both the numbers
        a = b - a; // b - a = (b + a) - a = b (a is swapped)
        b = b - a; // (b + a) - b = a (b is swapped)

    }

    public static void main(String[] args){

        int a = 20;
        int b = 30;

        swapNumbers(a,b);
        System.out.printf("a is %d, b is %d", a, b);


    }
    
}
