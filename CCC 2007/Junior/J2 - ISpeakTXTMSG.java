import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> translations = new HashMap<String, String>();
        translations.put("CU", "see you");
        translations.put(":-)", "I'm happy");
        translations.put(":-(", "I'm unhappy");
        translations.put(";-)", "wink");
        translations.put(":-P", "stick out my tongue");
        translations.put("(~.~)", "sleepy");
        translations.put("TA", "totally awesome");
        translations.put("CCC", "Canadian Computing Competition");
        translations.put("CUZ", "because");
        translations.put("TY", "thank-you");
        translations.put("YW", "you're welcome");
        translations.put("TTYL", "talk to you later");

        ArrayList<String> translated = new ArrayList<String>();
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        String X = "";
        while(!X.equals("TTYL")){
            X = String.valueOf(input.readLine());
            if(translations.containsKey(X)){
                translated.add(translations.get(X));
            }
            else{
                translated.add(X);
            }
        }
        for(String i : translated){
            System.out.println(i);
        }
    }
}
