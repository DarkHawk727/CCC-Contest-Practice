import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    int month = in.nextInt ();
    int day = in.nextInt ();
    if (day > 18 && month > 2)
      {
	System.out.println ("After");
      }
    else if (day == 18 && month == 2)
      {
	System.out.println ("Special");
      }
    else
      {
	System.out.println ("Before");
      }
  }
}

