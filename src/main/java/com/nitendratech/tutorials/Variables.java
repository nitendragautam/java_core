package com.nitendratech.tutorials;

import java.util.Date;
import java.awt.Point;;

/**
 * There are two types of variables types in Java Primitive Type and Reference type
 */

 /**
  * Primitive data types do not have any underlying method. 
    It is used to store simple values.
  */
public class Variables {
  public static String globalVariable ="Hello World"; //Globally Defined Variable

  public static void methodScopeForVariable(){
    String myName="Nitendra Gautam"; //Variable defined Within the method
    System.out.println(myName);
    System.out.println(globalVariable);
  }
  public static void main(String[] args){
    /**
     * Primitive Variables
     */
    int var1, var2, var3; // Declaring three variables var1,var2 and var3
    int variable1 = 22; // Declaring and Initializing one Variable
    int var4 = 3, var5, var6 = 5; // Declare var5 but initialize var4 and var6
    byte z = 22;
    byte age = 30;

    //Below are ways to assign the large integer values
    int youTubeViewsCount = 234456976;
    // We can use the _ instead of comma while assigning integers value if its too long.
    int youTubeViewsCount1 = 234_456_976; 

    // If a number is very large, we can use the long Data Types and L letter to determine the Data type
    long youtubeViewCount3 = 4123123568978L;
    long youtubeViewCount4 = 4_123_123_568_978L;

    double shoppingBill = 120.29; // Double is used to Store the Decimal Value

    // If the decimal Value is too Large, we can use Float data type. 
    // But for this Floating data type we need to use letter F 

    float listPrice = 10.9934F;
    // Char Data Type
    char characterValue = 'x'; // Variable characterValue has value of X
    String myWebsite ="nitendratech.com";

    int myAge = 30;
    // Here we are using Camel case naming convention for assigning Variables
    int herAge = 27;

    herAge = myAge; //Assigining one variable to another

    // Boolean Variable has value of True/False
    boolean isAccountActive = true; // This variable is going to tell whether the account is Active or Not

    methodScopeForVariable();
    System.out.println(globalVariable);

    //W
    /**
     * When we assigne variables using primitive variable , its value is not changed.
     * Here when we assign x2 as x1, the value of x1 is being assigned to x1
     * Now if we changed the value of x1, then x2 is not changed as their memories are allocated in different places.
     * x2 memory pointer does not know about the x1 memory pointer.
     */

    int x1 = 2;
    int x2 =x1;

    x1 =3;
    System.out.println(x2);
    //

    /**
     * ==============================================================================================
     * Reference Variables
     * ==============================================================================================
     * 
     * Reference variables have an underlying methods that are defined as we need to create an object to call the
     * reference variable . It is used to store complex Values.
     * 
     *
     */
    // When Reference Variable is created JRE allocates some memory 
    //Here currentDate object is Instance of Date Class
    Date currentDateTime = new Date();

    System.out.println(currentDateTime);

    /**
     *  In terms of memory management , lets say we have two refernce objects.We have assigned second objects as first Object.
     * When we change the value of first reference variable, second object value also changes.
     * 
     *  when value of reference variable is also change, 
     * 
     * Here when we declare and assign point1 variable, a part of the memory is assigned to it. 
     * When we declare the point2, seperate part of the memory is assigned to store the address of point1 value. 
     * point2 will hold the refernce of the point1 in memory instead of storing the actual value . They store the refernce of objects somewhere in the memory.
     * In this way when we change the value of point1, value of point2 also changes as point2 has the refernce of the point1 Variable.
     * They are called refernce type as they dont store the actual value but the reference to the memory where value is stored
     */

     Point point1 = new Point(1,1);
     Point point2= point1;

     point1.x=5;
     System.out.println(point1);
     System.out.println(point2);



    /**
     * ==============================================================================================
     * Escape  Sequence
     * ==============================================================================================
     * In order to use a single or double Quote within a String,
     * we can use escape sequences like \
     *
     * Backslash +double quote  --------> To use " in a String 
     * Backslash +backslash ---> To use \ in String 
     * backslash + n ---> Adds new Line 
     * Backslash + \t ----> Adds a Tab in the String where its used 
     */


     String escapeSeqStringDoubleQuote= "Hello \"This is Nitendra Tech\" ";

     System.out.println("Escape Sequence Example: " +escapeSeqStringDoubleQuote);

     // Here we are using backlash in String . we need to use two black slashes for that 
     String escSeqForBackSlash = "C:\\Windows\\Programs\\helloworld.exe";
     System.out.println("escSeqForBackSlash " +escSeqForBackSlash);

     String escSequenceNewLine = "C:\nWindows\nPrograms\nhelloworld.exe";
     System.out.println("escSequenceNewLine " +escSequenceNewLine);

     String escSequenceTab = "C:\tWindows\tPrograms\thelloworld.exe";
     System.out.println("escSequenceTab " +escSequenceTab);




     

  }
}