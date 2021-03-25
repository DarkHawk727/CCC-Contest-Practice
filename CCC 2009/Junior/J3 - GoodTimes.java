import java.io.*;
import java.util.*;

public class Main {
    public static int localTime(int ottawa, int c) {
        int lT = ottawa + c;
        if (lT > 2400) {
            lT = lT - 2400;
        } else if (lT < 0) {
            lT = lT + 2400;
        }
        if (lT % 100 >= 60) {
            lT = (lT / 100 * 100 + 100) + (lT % 100 - 60);
        }
        return lT;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int ottawa = Integer.parseInt(input.readLine());
        System.out.println(localTime(ottawa, 0) + " in Ottawa");
        System.out.println(localTime(ottawa, -300) + " in Victoria");
        System.out.println(localTime(ottawa, -200) + " in Edmonton");
        System.out.println(localTime(ottawa, -100) + " in Winnipeg");
        System.out.println(localTime(ottawa, 0) + " in Toronto");
        System.out.println(localTime(ottawa, 100) + " in Halifax");
        System.out.println(localTime(ottawa, 130) + " in St. John's");
    }
}
