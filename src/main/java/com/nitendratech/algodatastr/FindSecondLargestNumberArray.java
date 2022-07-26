package com.nitendratech.algodatastr;

/**
 * Find the second largest number in an integer array. We can assume a minimum array length of two.
 */
public class FindSecondLargestNumberArray {

    public  void findSecondLargestValue(Integer[] array, int arraySize){
        
        int i, first,second;

        if (arraySize< 2){
            System.out.println("Invalid input as there should be at least 2 elements in Array");
            return;
        }

        first = second = Integer.MIN_VALUE;

        for (i = 0; i< arraySize; i++){

            // If current Element is greater than first then update both the forst and second

           
            if (array[i] > first){

                System.out.println("Array Value "+array[i]);
                System.out.println("first Value Before "+first);
                System.out.println("Second Value Before "+second);

                second= first;
                first=array[i];

                System.out.println("first Value After "+first);
                System.out.println("Second Value After "+second);
            } 

           


            // If array[i] is between first and second, then we updated the second variable
            else if (array[i] > second && array[i] !=first){
                System.out.println("first Value Before "+first);
                System.out.println("Second Value Before "+second);

                second = array[i];

                System.out.println("first Value After "+first);
                System.out.println("Second Value After "+second);


            }

            if (second == Integer.MIN_VALUE) 
                System.out.println(" There is no second Largest Element \n");
            else 
                System.out.println("Second Largest Element is " +second);


        }

       


    }

    public static void main(String[] args){

        Integer[] numArray = new Integer[]{12, 35, 1, 10, 34, 1};

        
        FindSecondLargestNumberArray findSecondLargestNumberArray = new FindSecondLargestNumberArray();
        int arrayLength = numArray.length;
      findSecondLargestNumberArray.findSecondLargestValue(numArray, arrayLength);

    }
    
}
