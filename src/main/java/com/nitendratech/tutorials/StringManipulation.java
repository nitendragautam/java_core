package com.nitendratech.tutorials;

/**
 * Strings are Immutable
 * String class belongs to the java.lang packages which is already imported by default.
 * So we dont need to import by Default 
 */
public class StringManipulation {

    public static void main(String[] args){
        String firstName = "Nitendra"; // Even thought it looks like 
        String lastName = "Gautam";


        /* ==================String Methods ===============  */
        //Manual method to Concatenate
        String manConcatName = firstName +" "+lastName;
        System.out.println(manConcatName);
    
        //  Check if the String ends with a character or group of character
        System.out.println("Does the manConcatName ends with 'am' "+manConcatName.endsWith("am"));

        //  Check if the String starts with a character or group of character
        System.out.println("Does the manConcatName starts with 'Ni' "+manConcatName.startsWith("Ni"));

        //Check the Length of a given String
        System.out.println("String Length of  manConcatName " +manConcatName.length());

        //Check the Index of first time a character appears in String
        System.out.println("manConcatName.indexOf('a') "+manConcatName.indexOf('a'));

        //Replace Some Characters from String, but does not modify the original String. But It returns a new String 
        // Any methods that modifies a String returns a new String Object as String are Immutable in Java
        System.out.println("Replace Character "+manConcatName.replace("Gautam","Tech"));

        //Using the concat method
        String conName = (firstName.concat(" ")).concat(lastName);

        System.out.println("conName using Concat Method "+conName);

        // To Lower Case
        System.out.println("To Lower Case " +manConcatName.toLowerCase());

        // As we can see orginal String is not affected
        System.out.println("Original String " +manConcatName);

        System.out.println("To Upper  Case " +manConcatName.toUpperCase());

        // Trimming Empty Spaces using trim method
        String toTrimString = " Hello How are You !!   ";
        System.out.println(" After Trim Method " + toTrimString.trim());

        /* ===========Concatenate using the append of StringBuilder method ==========*/
        //Concatenate using the append of StringBuilder method
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World!");
        sb.append(" How ");
        sb.append("Are ");
        sb.append("You? ");

        System.out.println("Concatening using String Builder Method "+sb.toString());

        sb.insert(4,"index");
        sb.delete(1,3); //Removing everything from index 1 to 3

        System.out.println(sb.toString());

        /*=============== String Equality  ================/ */

        /**
         *
         * 
         * Checking String equality between String literal and String Object
         */

        String stringLiteral ="Hello";
        String stringObj = new String("Hello");
        String otherLiteral = "Hello";
        String otherObj = new String("Hello");

        // Below two refers the same String in memory
        //stringLiteral --> "Hello"
         // otherLiteral----^

        //Bellow two refers different object in memory
        //stringObject --> "Hello"   This refers to seperate reference as it is instance of ```java.lang.String``` class
        //otherObj --> "Hello"

        System.out.println("stringLiteral == stringObj) "+stringLiteral == stringObj); //Variable stringLiteral is referencing different "Hello" in memory
        System.out.println("stringLiteral == otherLiteral "+stringLiteral == otherLiteral); // They reference the same String
        System.out.println("stringLiteral.equals(stringObj "+stringLiteral.equals(stringObj)); //It compares the true value of the String rather than cpomparing the references
        System.out.println("stringLiteral.equals(otherLiteral "+stringLiteral.equals(otherLiteral));

        System.out.println();
        System.out.println(stringObj.equals(otherObj)); // These two compare different references in memory
        System.out.println(stringObj.equals(otherObj));//Since we are comparing the value rather than the String,it will return true



        /*=================String Escape  Sequences ================ */



    }
}
