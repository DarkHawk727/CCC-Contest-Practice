import java.util.*;
import java.io.*;
public class Main
{
  public static void main (String[]args)
  {
    BufferedReader input =
      new BufferedReader (new InputStreamReader (System.in));
    int y = Integer.parseInt (input.readLine ());
    int m = Integer.parseInt (input.readLine ());
    int diff = m - y;
    int oldest = m + diff;
      System.out.println (oldest);
  }
}
