package HW_2.java;

import java.util.Scanner;

public class HW1_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m;
        int d;
        int y;

        System.out.println("Please, enter minutes and press Enter");
        m = scanner.nextInt();

        y = m / (365 * 24 * 60);
        d = (m - (y * 365 * 24 * 60)) / (24 * 60);

        System.out.println(m + " minutes is approximately " + y + " years and " + d + " days" );
        //System.out.printf("%d minutes is approximately %d years and %d days\n", m, y, d); // также можн использовать printf




    }
}
