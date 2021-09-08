import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
    String X = String.valueOf(input.readLine());
    int count = 0;
    for(int i = 0; i < X.length(); i++){
        if(X.charAt(i) == 'I' || X.charAt(i) == 'O' || X.charAt(i) == 'S' || X.charAt(i) == 'H' ||X .charAt(i) == 'Z' || X.charAt(i) == 'X' || X.charAt(i) == 'N'){
            count++;
        }
    }
    if(count == X.length()){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
    }
}
