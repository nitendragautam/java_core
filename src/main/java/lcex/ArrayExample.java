package lcex;

import com.nitendratech.pojo.DVD;

/**
 * Array is a collection of object or items of the same data type
 * Size cannot be changed after allocation since items are stored 
 * contiguously
 * The items are stored in neighboring (contiguous) memory locations
 * Access Items by index starting at 0
 * Ability to Add and remove objects from an Array
 * Arrays can hold up to N items where the value of N is decided by the software
 * engineer writing the code. we also also need to specify the
 *  type or Data Type of item that will be going into the Array.
 */

public class ArrayExample {

    public static void main(String args[]){

        // Create Array to hold 15 DVD
        DVD[] myDVDCollection = new DVD[15];

        /**
         * One of the most primitive Array operations are 
         * writing elements into them, and reading elements
         * from them.
         */

         // Writing Items to an Array

         DVD avengersDVD = new DVD("The Avengers", 2012, "Josh Whedon");

         // Save above value in the 8th place
         // Since the index for Array starts from 0, we are using index of 7 to 
         // to save the above dvd collection in the 7th index
         myDVDCollection[7] = avengersDVD;

        //Putting More DVD in Array
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew santon");
        DVD lionKingDVD    = new DVD("The Lion Kind", 2019, "Jon Favreau");

        myDVDCollection[3] = incrediblesDVD;// Index 3 into Position 4th
        myDVDCollection[9] = findingDoryDVD; // Index 9 into Position 10th
        myDVDCollection[2] = lionKingDVD;  // Index 2 into Postion 3rd

        //Overwriting the data in Array

        DVD starWarDVD = new DVD("Star Wars", 1977, "George Lucas");
        myDVDCollection[3] = starWarDVD; // Replacing the Incredibles DVD with Star Wars DVD.


        // Reading Element from Array

        System.out.println(myDVDCollection[9]); //Prints Finding Dory, directed by Andrew santon, release in Year: 2016
        System.out.println(myDVDCollection[10]);// Prints null as Array not Initialized
        System.out.println(myDVDCollection[2]); // Prints The Lion Kind, directed by Jon Favreau, release in Year: 2019

        /**
         * In Language like C, IF an array at particlar not assigned, it could contain random data.
         * But in java, empty array value is always initialized to default values. In case of String , 
         * default values is null, for int[], default value is zero and for bool[] array, defalu value 
         * is false.
         */

         //Writing Elements into an Array with a loop
         //Generally Loops are used to Put a lot of values into an Array.

         // Lets craete an array with 10 elements
         int[] squareNumbers = new int[10];

         // Iterate through each of Array Indexes from 0 to 9

         for (int i=0; i < 10; i++){
             // Calculate the SQuare number and Insert into an array at Index I

             int squareNumberVal = (i+1) *(i +1);
             squareNumbers[i] = squareNumberVal;

         }

         // Lets read the values of this array using a loop

         for (int  i = 0; i< 10; i++){
             System.out.println(squareNumbers[i]);
         }


         System.out.println("New Method \n");
         // Another Way to read and print out the Array Values using Variant of For loop
         //This Method works if we dont need the index
         for (int square: squareNumbers){
             // Print the current Value of Square
             System.out.println(square);
         }


         /**
          * Array Capacity: It is the size of the arrar or maximum number of items 
          it can hold.
          Index at Array Starts with Zero.
          Capacity of Array is decided when we create an array. 
          Capacity of Array cannot be changed Later on.

          The capacity of an Array in Java can be checked by looking at the value of its 
          length attribute. This is done using the code arr.length, where arr is the name of the Array. 
          Different programming languages have different ways of checking the length of an Array.
          */
         
          //Check Array Capacity

          int squareNumbersLength = squareNumbers.length;

         System.out.println("Square Number Array Have a capacity of " +squareNumbersLength);

         /**
          * Array Length:  It's the number of items currently in the Array.

          */
          //Lets check Array Length
          int [] arrayLengthCheck = new int[8];

          int lengthOfArray = 0; //Current Length is Zero

          //Add Elements to Array

          for (int i =0; i<4; i++){
              arrayLengthCheck[i] = i *i;

              // Length goes by by one when an element is added
              lengthOfArray ++; 
          }

          //Check the array length and capacity 
          System.out.println("Array Capacity is: "+arrayLengthCheck.length);
          System.out.println("Array length is "+lengthOfArray);


          /**
           * When an Array is given as a parameter, without any additional information, 
           * you can safely assume that length == capacity. That is,
           *  the Array is the exact right size to hold all of it's data. 
           * We can, therefore, use .length.
           */
    
         
         


    }


}
