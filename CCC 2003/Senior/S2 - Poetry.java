import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> answers = new ArrayList<>();
        String firstLine, secondLine, thirdLine, fourthLine;
        int N = Integer.parseInt(input.readLine());
        String[] syllables = new String[4];
        for (int i = 0; i < N; i++) {
            firstLine = String.valueOf(input.readLine());
            syllables[0] = returnSyllable(firstLine);

            secondLine = String.valueOf(input.readLine());
            syllables[1] = returnSyllable(secondLine);

            thirdLine = String.valueOf(input.readLine());
            syllables[2] = returnSyllable(thirdLine);

            fourthLine = String.valueOf(input.readLine());
            syllables[3] = returnSyllable(fourthLine);

            if (Arrays.stream(syllables).distinct().count() == 1) {
                answers.add("perfect");
            } else if ((syllables[0].equals(syllables[1])) && (syllables[2].equals(syllables[3]))) {
                answers.add("even");
            } else if ((syllables[0].equals(syllables[2])) && (syllables[1].equals(syllables[3]))) {
                answers.add("cross");
            } else if ((syllables[0].equals(syllables[3])) && (syllables[1].equals(syllables[2]))) {
                answers.add("shell");
            } else {
                answers.add("free");
            }
        }
        for (String i : answers) {
            System.out.println(i);
        }
    }

    public static String returnSyllable(String s) {
        s = s.toLowerCase();
        Set vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add(' ');
        char temp;
        StringBuilder syllable = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            temp = s.charAt(i);
            if (vowels.contains(temp)) {
                if (temp != ' ')
                    syllable.append(temp);
                break;
            }
            syllable.append(temp);
        }
        syllable.reverse();
        return syllable.toString();
    }
}
