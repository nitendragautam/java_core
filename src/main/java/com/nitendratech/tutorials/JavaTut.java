package com.nitendratech.tutorials;

import java.util.Arrays;

public class JavaTut {

    public static void main(String[] args){
        /**
         * Arrays are use to store list of items which can be number or Strings. 
         * So it can have list of messages or People
         *  // As array are rereference variable we need to use new keyword while declaring arrays
         * For boolean array, unassigned variabes are defaulted as false
         * For Integer Array default values are assigned as Zero for any index which is not defined
         * For String Array default values for index not defined are assigned as empty
         */

        // Below is a number array which can store 10 items.
         int [] numArray = new int[10]; //Initializing the Array
         // We use index/postion to store values in Array
         numArray [0] =3; // we are storing 3 in oth index 
         numArray [1] = 2;

         System.out.println(Arrays.toString(numArray));


         // Using new method to define Arrays when we know the members before hand
         int [] newNumArray = {2, 3, 4, 5, 1,4};
         System.out.println(" Array Length " + newNumArray.length);
         System.out.println(Arrays.toString(newNumArray));


    }


}