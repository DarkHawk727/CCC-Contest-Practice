import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> responses = new ArrayList<String>();
        ArrayList<String> answers = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(input.readLine());
        String choice = "";
        String answer = "";
        int score = 0;
        for (int i = 0; i < N; i++) {
            choice = String.valueOf(input.readLine());
            responses.add(choice);
        }
        for (int i = 0; i < N; i++) {
            answer = String.valueOf(input.readLine());
            answers.add(answer);
        }
        for (int i = 0; i < N; i++) {
            if (responses.get(i).equals(answers.get(i))) {
                score++;
            }
        }
        System.out.println(score);
    }
}
