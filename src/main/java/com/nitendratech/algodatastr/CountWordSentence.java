package com.nitendratech.algodatastr;

import java.util.HashMap;
/**
 * Created by @author nitendratech on 3/6/22
 */
/**
 * Count the number of words in a given string using HashMap.
 * 
 * A HashMap i used to store the Word and number of time it appears.
 *Use a for loop first
 Use a if condition isnide the for loop where we check if the Map of the Hashmap contains the key. 
 If it contains, we set the counter at that position and add the object to the Hash Map.

 If we find the words, increase the counter by one, else the counter is set to one.
 */
public class CountWordSentence {


    public static void main(String[] args) {
        String inputString = "This is  blog by Nitendra Tech that containts Tech news";
        // Split the input String that is delimited by single Space into multiple words
        String[] inputSplit = inputString.split(" ");

        HashMap<String, Integer> outputMap = new HashMap<String, Integer>();

        for (int i = 0; i< inputSplit.length; i ++){
              if (outputMap.containsKey(inputSplit[i])){
                  int count = outputMap.get(inputSplit[i]);
                  outputMap.put(inputSplit[i], count +1);

              } else{
                outputMap.put(inputSplit[i],1); // This runs for the first time when we get specific String
                  //System.out.println(" First Time: " +outputMap);
              }
        }
        System.out.println("Final Map "+outputMap);



    }

}
