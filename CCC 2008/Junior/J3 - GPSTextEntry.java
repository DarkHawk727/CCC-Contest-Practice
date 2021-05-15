import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int total = 0, lastLine, lastPos, line = 0, pos = 0;
        String message = String.valueOf(input.readLine());
        for (int i = 0; i < message.length(); i++) {
            lastPos = pos;
            lastLine = line;
            if (message.charAt(i) == ' ') {
                line = 4;
                pos = 2;
            } else if (message.charAt(i) == '-') {
                line = 4;
                pos = 3;
            } else if (message.charAt(i) == '.') {
                line = 4;
                pos = 4;
            } else {
                line = (message.charAt(i) - 'A') / 6;
                pos = (message.charAt(i) - 'A') % 6;
            }
            total += Math.abs(line - lastLine) + Math.abs(pos - lastPos);
        }
        total += Math.abs(line - 4) + Math.abs(pos - 5);
        System.out.println(total);
    }
}
