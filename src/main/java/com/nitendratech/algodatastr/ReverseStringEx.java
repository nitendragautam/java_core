package com.nitendratech.algodatastr;

/**
 * 
 * There are two ways of Reversing String
* Using String Builder 
* 
*  --> Use reverse() method and then call toString() method
*
* Another Manually
* 
* String str="Hello";
 *
 */

public class ReverseStringEx{



public static void main(String args[]){

String str = "Nitendratech";

//System.out.println(reverseWithStringBuilder(str));
System.out.println(reverWithStringBuilder(str));

//System.out.println(reverseStringForLoop(str));


}

private static String reverseStringForLoop(String input){
	String reverseString ="";

	for (int i=input.length() -1; i>=0;i--){
		reverseString = reverseString+input.charAt(i);
		System.out.println(reverseString);

	}

	return reverseString;

}

private static String reverseWithStringBuilder(String str){


return new StringBuilder(str)
		.reverse()
		.toString();

}




private static String reverWithStringBuilder(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not allowed");
		//String builder for Storing the results
		StringBuilder sb = new StringBuilder();
		char [] chars = in.toCharArray();

		for (int i = chars.length -1; i>=0; i-- ) 
					sb.append(chars[i]);



	return sb.toString();
}

}