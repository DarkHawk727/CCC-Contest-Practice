import java.io.*;

public class J1_DogTreats
{
  public static void main (String[]args) throws IOException
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
