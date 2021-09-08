import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        int V = Integer.parseInt (input.readLine ());
        String votes = String.valueOf(input.readLine());
        int voteA = 0;
        int voteB = 0;
        for(int i = 0; i < V; i++){
            if(votes.charAt(i) == 'A'){
                voteA++;
            }
            else{
                voteB++;
            }
        }
        if(voteA > voteB){
            System.out.println("A");
        }
        else if(voteA < voteB){
            System.out.println("B");
        }
        else if(voteA == voteB){
            System.out.println("Tie");
        }

    }
}
