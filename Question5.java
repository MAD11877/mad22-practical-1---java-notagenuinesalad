import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    int num = in.nextInt();
    ArrayList<Integer> inp = new ArrayList<Integer>();

    for(int i = 0; i<num; i++){
      int val = in.nextInt();
      inp.add(val);
    }

    HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();

    for(int i : inp){
      if(dict.containsKey(i)){
        dict.put(i, dict.get(i)+1);
      }
      else{
        dict.put(i,1);
      }
    }

    int biggest = 0;
    for(int i : dict.keySet()){
      if(dict.get(i)>biggest){
        biggest = i;
      }
    }
    System.out.println(biggest);
  }
}
