import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> american = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String canadian = "";
        while (!canadian.equals("quit!")) {
            canadian = String.valueOf(input.readLine());
            if (canadian.length() > 3) {
                if (canadian.charAt(canadian.length() - 3) == 'a') {
                    american.add(canadian);
                } else if (canadian.charAt(canadian.length() - 3) == 'e') {
                    american.add(canadian);
                } else if (canadian.charAt(canadian.length() - 3) == 'i') {
                    american.add(canadian);
                } else if (canadian.charAt(canadian.length() - 3) == 'o') {
                    american.add(canadian);
                } else if (canadian.charAt(canadian.length() - 3) == 'u') {
                    american.add(canadian);
                } else if (canadian.charAt(canadian.length() - 3) == 'y') {
                    american.add(canadian);
                } else {
                    american.add(canadian.replace("or", "our"));
                }
            } else {
                american.add(canadian);
            }
        }
        for(int i = 0; i < american.size()-1; i++){
            System.out.println(american.get(i));
        }
    }
}
