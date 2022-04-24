import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
    int i,j,rows;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    rows = in.nextInt();
    for(i=1;i<=rows;i++)
         {
             for(j=1;j<=i;j++)
             {
                 System.out.print("* ");
             }
             System.out.println("");
         } 
     }
}
