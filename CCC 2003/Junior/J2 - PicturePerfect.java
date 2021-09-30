import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> messages = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int length,perimeter, width, area = 1;
        boolean valid = true;
        while(valid) {
            area = Integer.parseInt(input.readLine());
            if(area == 0){
                break;
            }
            length = (int) Math.sqrt(area);
            width = Math.floorDiv(area, length);
            perimeter = 2*length + 2*width;
            //System.out.println("Minimum perimeter is " + 2 * length + 2 * width + " with dimensions " + length + " x " + width);
            messages.add("Minimum perimeter is " + perimeter + " with dimensions " + length + " x " + width);
            length = 0;
            width = 0;
        }
        for (String i : messages) {
            System.out.println(i);
        }
    }
}
