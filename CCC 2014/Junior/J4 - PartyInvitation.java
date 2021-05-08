import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> invites = new ArrayList<>();
        ArrayList<Integer> newinvites = new ArrayList<>();
        int K = Integer.parseInt(input.readLine());
        int r;
        for (int i = 0; i < K; i++) {
            invites.add(i + 1);
        }

        int m = Integer.parseInt(input.readLine());
        for (int i = 0; i < m; i++) {
            newinvites.clear();
            r = Integer.parseInt(input.readLine());
            for (int n = 0; n < invites.size(); n++) {
                if ((n + 1) % r != 0) {
                    int z = invites.get(n);
                    newinvites.add(z);
                }
            }
            invites.clear();
            for (int b : newinvites) {
                invites.add(b);
            }
        }
        for (int i : invites) {
            System.out.println(i);
        }
    }
}
