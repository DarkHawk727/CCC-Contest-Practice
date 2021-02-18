import java.util.*;
import java.io.*;
public class Main
{
    public static void main (String[]args) throws IOException
    {
        BufferedReader input =
                new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (input.readLine ());
        int b = Integer.parseInt (input.readLine ());
        int c = Integer.parseInt (input.readLine ());
        if (a + b + c == 180)
        {
            if (a == 60 && b == 60)
            {
                System.out.println ("Equilateral");
            }
            else if (a == b || b == c || c == a)
            {
                System.out.println ("Isosceles");
            }
            else if (a != b && b != c && c != a)
            {
                System.out.println ("Scalene");
            }
        }
        else
        {
            System.out.println ("Error");
        }
    }
}
