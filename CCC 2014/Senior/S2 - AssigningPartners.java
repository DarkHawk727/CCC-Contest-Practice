import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> partners = new HashMap<>();
        boolean validPartner = true;
        String firstPartner, secondPartner;
        int N = Integer.parseInt(input.readLine());
        String[] firstNames = String.valueOf(input.readLine()).split(" ");
        String[] secondNames = String.valueOf(input.readLine()).split(" ");

        for (int i = 0; i < N; i++) {
            firstPartner = firstNames[i];
            secondPartner = secondNames[i];

            if (firstPartner.equals(secondPartner)) {
                validPartner = false;
            }

            if (partners.containsKey(firstPartner) && !(partners.get(firstPartner).equals(secondPartner))) {
                validPartner = false;
            }
            partners.put(firstPartner, secondPartner);
            partners.put(secondPartner, firstPartner);
        }
        if (validPartner) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }
}
