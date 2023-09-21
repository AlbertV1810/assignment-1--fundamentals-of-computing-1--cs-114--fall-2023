// Import libraries here
import java.util.Scanner;
public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here
    System.out.println("      AAAAA        VVV           VVV");
    System.out.println("     AAA AAA        VVV         VVV");
    System.out.println("    AAA   AAA        VVV       VVV");
    System.out.println("   AAA     AAA        VVV     VVV"); 
    System.out.println("  AAAAAAAAAAAAA        VVV   VVV");
    System.out.println(" AAA         AAA        VVV VVV");
    System.out.println("AAA           AAA        VVVVV");
    Scanner degree = new Scanner(System.in);
    System.out.print("Enter a degree in Fahrenheit: ");
    double fahrenheit = degree.nextDouble(); 
    double celsius = ((5 *(fahrenheit - 32))/ 9);
    System.out.println("Your degree in Celsius is: " + celsius);
    System.out.println("Enter a 5 character string: ");
  }
}
  