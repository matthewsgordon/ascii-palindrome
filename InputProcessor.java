
public class InputProcessor
{ 

   public static String asciiToBinary(String text)
   {
      // Convert String to array of characters
      char[] characters = text.toCharArray();
      // Initialise a new StringBuilder
      StringBuilder s = new StringBuilder();
      // Iterate for each character in the character array
      for (char c: characters) {
         // Convert the character (as Integer) to a binary string
         String binary = Integer.toBinaryString(c);
         // Add any leading zeros to ensure string is always 8 bits long
         // Adapted from https://tinyurl.com/knwubfrd
         String binarywithZeros = String.format("%8s", binary).replace(' ', '0');
         // Append the string builder with the current character binary string
         s.append(binarywithZeros);
      }
      // StringBuilder as a string
      return s.toString();
   }

   public static String binaryToAscii(String text)
   {
      // Initialise a neq string builder
      StringBuilder s = new StringBuilder();
      // sets the index to pass through binary 8 bits at a time 
      int bindex = 0;
      // Loops through the text 8 characters at a time 
      for (int i = 0; i < text.length() / 8; i++) {
         // Converts cuurent 8 bit binary to string
         String binary = text.substring(bindex, bindex + 8);
         // Converts the binary string into an integer and then a character 
         char c = (char)Integer.parseInt(binary,2);
         // Index the start position by 8
         bindex = bindex + 8;
         // Adds character to the string builder 
         s.append(c);
      }
      // Returns the string builder as a string
      return s.toString();     
   }

   public static boolean isPalindrome(String text)   
   {
      // Inisialises new string builder from the text input
      StringBuilder s = new StringBuilder(text);
      // Uses .reverse fucntion to reverse the string 
      String reverseText = s.reverse().toString();
      // Return true or false depending on if text is equal to reverse text
      return text.equals(reverseText);
   }
}