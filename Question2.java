import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    double height, weight,bmi;

    System.out.print("Your height in meters(m): ");
    height = in.nextDouble();

    System.out.print("Your weight in KG: ");
    weight = in.nextDouble();

    bmi = weight/(height*height);

    System.out.print("Your BMI is " + String.format("%.2f",bmi));
  }
}
