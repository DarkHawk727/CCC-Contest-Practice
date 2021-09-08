import java.io.*;

//Why do smart way, when dum way work?
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String temp = String.valueOf(input.readLine());
        int startDay = Character.getNumericValue(temp.charAt(0));
        int totalDays = Integer.parseInt(temp.substring(temp.indexOf(" ") + 1));

        System.out.println("Sun Mon Tue Wed Thr Fri Sat");

        if (startDay == 1) {
            System.out.println("  1   2   3   4   5   6   7");
            System.out.println("  8   9  10  11  12  13  14");
            System.out.println(" 15  16  17  18  19  20  21");
            System.out.println(" 22  23  24  25  26  27  28");

            if (totalDays == 29) {
                System.out.println(" 29");
            } else if (totalDays == 30) {
                System.out.println(" 29  30");
            } else if (totalDays == 31) {
                System.out.println(" 29  30  31");
            }
        } else if (startDay == 2) {
            System.out.println("      1   2   3   4   5   6");
            System.out.println("  7   8   9  10  11  12  13");
            System.out.println(" 14  15  16  17  18  19  20");
            System.out.println(" 21  22  23  24  25  26  27");
            System.out.print(" 28");
            if (totalDays == 29) {
                System.out.print("  29");
            } else if (totalDays == 30) {
                System.out.print("  29  30");
            } else if (totalDays == 31) {
                System.out.print("  29  30  31");
            }
            System.out.println();
        } else if (startDay == 3) {
            System.out.println("          1   2   3   4   5");
            System.out.println("  6   7   8   9  10  11  12");
            System.out.println(" 13  14  15  16  17  18  19");
            System.out.println(" 20  21  22  23  24  25  26");
            System.out.print(" 27  28");
            if (totalDays == 29) {
                System.out.print("  29");
            } else if (totalDays == 30) {
                System.out.print("  29  30");
            } else if (totalDays == 31) {
                System.out.print("  29  30  31");
            }
            System.out.println();
        } else if (startDay == 4) {
            System.out.println("              1   2   3   4");
            System.out.println("  5   6   7   8   9  10  11");
            System.out.println(" 12  13  14  15  16  17  18");
            System.out.println(" 19  20  21  22  23  24  25");
            System.out.print(" 26  27  28");
            if (totalDays == 29) {
                System.out.print("  29");
            } else if (totalDays == 30) {
                System.out.print("  29  30");
            } else if (totalDays == 31) {
                System.out.print("  29  30  31");
            }
            System.out.println();
        } else if (startDay == 5) {
            System.out.println("                  1   2   3");
            System.out.println("  4   5   6   7   8   9  10");
            System.out.println(" 11  12  13  14  15  16  17");
            System.out.println(" 18  19  20  21  22  23  24");
            System.out.print(" 25  26  27  28");
            if (totalDays == 29) {
                System.out.print("  29");
            } else if (totalDays == 30) {
                System.out.print("  29  30");
            } else if (totalDays == 31) {
                System.out.print("  29  30  31");
            }
            System.out.println();
        } else if (startDay == 6) {
            System.out.println("                      1   2");
            System.out.println("  3   4   5   6   7   8   9");
            System.out.println(" 10  11  12  13  14  15  16");
            System.out.println(" 17  18  19  20  21  22  23");
            System.out.print(" 24  25  26  27  28");
            if (totalDays == 29) {
                System.out.print("  29");

            } else if (totalDays == 30) {
                System.out.print("  29  30");
            } else if (totalDays == 31) {
                System.out.print("  29  30");
                System.out.println();
                System.out.print(" 31");
            }
            System.out.println();
        } else if (startDay == 7) {
            System.out.println("                          1");
            System.out.println("  2   3   4   5   6   7   8");
            System.out.println("  9  10  11  12  13  14  15");
            System.out.println(" 16  17  18  19  20  21  22");
            System.out.print(" 23  24  25  26  27  28");

            if (totalDays == 29) {
                System.out.print("  29");
            } else if (totalDays == 30) {
                System.out.print("  29");
                System.out.println();
                System.out.print(" 30");
            } else if (totalDays == 31) {
                System.out.print("  29");
                System.out.println();
                System.out.print(" 30  31");
            }
            System.out.println();
        }
    }
}
