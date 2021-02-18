import java.io.*;
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    BufferedReader input =
      new BufferedReader (new InputStreamReader (System.in));
    int S = Integer.parseInt (input.readLine ());
    int L = Integer.parseInt (input.readLine ());
    int M = Integer.parseInt (input.readLine ());
    int score = S + 2 * M + 3 * L;
    if (score >= 10)
      {
	System.out.println ("happy");
      }
    else
      {
	System.out.println ("sad");
      }

  }
}
