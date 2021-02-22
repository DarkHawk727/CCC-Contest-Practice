import java.util.*;
import java.io.*;
public class Main
{

  public static void main (String[]args) throws IOException
  {
    BufferedReader input =
      new BufferedReader (new InputStreamReader (System.in));
    int P = Integer.parseInt (input.readLine ());
    int N = Integer.parseInt (input.readLine ());
    int R = Integer.parseInt (input.readLine ());
    int sum = N;
    int current = N;
    int days = 0;
    while (sum <= P)
      {
	sum += current * R;
	current *= R;
	days++;
      }
    System.out.println (days);
  }
}
