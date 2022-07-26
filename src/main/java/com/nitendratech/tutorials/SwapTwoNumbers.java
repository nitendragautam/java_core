package com.nitendratech.tutorials;

import java.util.Scanner;

/**
 * Created by @author nitendratech on 1/25/22
 */
public class SwapTwoNumbers {

  public static void swapTwoNumbersUsingThirdVariable(){
    int x, y, temp;
    System.out.println("Enter two Numbers X and Y ");
    Scanner in = new Scanner(System.in);

    x = in.nextInt();

    y = in.nextInt();

    System.out.println("Before Swapping: X + Y " +x +y);

    temp= x;
    x = y;
    y=temp;

    System.out.println("After Swapping: x + y " +x +y);
  }

  public static void main(String [] args){
    swapTwoNumbersUsingThirdVariable();
  }

}
