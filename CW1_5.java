/**
 *
 * This is the CIS1112 Coursework 1.5 assignment helper file.
 *
 *
 * File name: CW1_5.java
 * Package: default
 * Created:	January 9th, 2020
 * @Author:	Dr. Robert Lyon (lyonro@edgehill.ac.uk)
 * 
 * Contact:	lyonro@edgehill.ac.uk
 * Web:		https://www.edgehill.ac.uk/computerscience/people/academic-staff/robert-lyon/
 * 
 */

/**
 * This is the coursework helper file. Do not,
 * 
 * i) rename the file.
 * ii) edit the file.
 * 
 * @author Dr. Robert Lyon
 *
 */
public class CW1_5 
{
	/**
	 * Main entry point to the application.
	 * 
	 * @param args unused command line arguments.
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args)
	{
		// Create the text to convert to binary.
		String text = "Hi CIS1112.";
		print("Input text: " + text);
		
		// Perform the conversion.
		String binary = InputProcessor.asciiToBinary(text);
		
		print("Binary translation: " + binary);
		
		// Now try to recover the original string from the binary.
		String recovered = InputProcessor.binaryToAscii(binary);
		
		print("Recovered: " + recovered);
		
		// Now we can check if the solution can identify palindromes.
		String palindrome_test = "abba";
		print("Is " + palindrome_test + " a palindrome? " + InputProcessor.isPalindrome(palindrome_test));
		
		palindrome_test = "rob";
		print("Is " + palindrome_test + " a palindrome? " + InputProcessor.isPalindrome(palindrome_test));
			
	}
	
	/**
	 * I've wrapped the print method, to make my examples clearer.
	 * 
	 * @param text the text to print to standard output.
	 */
	private static void print(String text)
	{
		System.out.println(text);
	}
}
