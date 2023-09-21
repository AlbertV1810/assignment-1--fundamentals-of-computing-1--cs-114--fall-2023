// Import libraries here
import java.util.Scanner;
public class Assignment1 {
  public static void main(String[] args) {
    System.out.println("      AAAAA        VVV           VVV");
    System.out.println("     AAA AAA        VVV         VVV");
    System.out.println("    AAA   AAA        VVV       VVV");
    System.out.println("   AAA     AAA        VVV     VVV"); 
    System.out.println("  AAAAAAAAAAAAA        VVV   VVV");
    System.out.println(" AAA         AAA        VVV VVV");
    System.out.println("AAA           AAA        VVVVV");
    
    System.out.println("Enter a degree in Fahrenheit: ");//Prints line that takes in input
    Scanner input = new Scanner(System.in);//Takes in input
    double fahrenheit = input.nextDouble();//Makes the number we entered become fahrenheit
    double celsius = ((5 *(fahrenheit - 32))/ 9);//Takes the fahrenheit degree and converts it into celsius
    System.out.println("Your degree in Celsius is: " + celsius);//Prints out degrees in celsius

    System.out.println("Please enter a 5 character string: ");//Prints line that takes in input
    String fiveString = input.next();//Takes in input in form of a string
    String reversedString = new StringBuilder(fiveString).reverse().toString();//Takes user input from past line and reverses it
    StringBuilder trimString = new StringBuilder(reversedString);//Takes the string that was previously reversed
    trimString.deleteCharAt(reversedString.length()-1);//Removes the last character of the reversed word
    trimString.deleteCharAt(0);//Removes the first character of the reversed word
    System.out.println("Your edited word is: " + trimString);//Prints the new edited word
    
    int min = 32;//Declares the minimum number for the randomizer
    int max = 16384;//Declares the maximum number for the randomizer
    int randomNum = (int)(Math.random() * (max - min));//Generates a random number from 32 through 16384
    System.out.println("Your random number is... " + randomNum);//Prints what the generated random number is

    input.close();
  }
}
  