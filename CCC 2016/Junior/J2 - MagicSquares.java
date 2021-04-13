import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[][] square = new int[4][4];
        int row1, row2, row3, row4;
        int col1, col2, col3, col4;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(String.valueOf(input.readLine()), " ");
        StringTokenizer st2 = new StringTokenizer(String.valueOf(input.readLine()), " ");
        StringTokenizer st3 = new StringTokenizer(String.valueOf(input.readLine()), " ");
        StringTokenizer st4 = new StringTokenizer(String.valueOf(input.readLine()), " ");

        for (int i = 0; i < 4; i++) {
            square[i][0] = Integer.parseInt(st1.nextToken());
            square[i][1] = Integer.parseInt(st2.nextToken());
            square[i][2] = Integer.parseInt(st3.nextToken());
            square[i][3] = Integer.parseInt(st4.nextToken());
        }
        row1 = square[0][0] + square[1][0] + square[2][0] + square[3][0];
        row2 = square[0][1] + square[1][1] + square[2][1] + square[3][1];
        row3 = square[0][2] + square[1][2] + square[2][2] + square[3][2];
        row4 = square[0][3] + square[1][3] + square[2][3] + square[3][3];

        if (row1 == row2 && row1 == row3 && row1 == row4) {
            System.out.println("magic");
        } else {
            System.out.println("not magic");
        }
    }
}
