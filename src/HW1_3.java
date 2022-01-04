package HW1_3.java;

import java.util.Scanner;

public class HW1_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double w;
        double h;
        double bmi;

        System.out.println("Please, enter weight in pounds & height in inches and press Enter");
        w = scanner.nextInt();
        h = scanner.nextInt();

        bmi = (w / (h*h)) * 703;

        System.out.println("Body Mass Index is " + bmi);
        //System.out.printf("Body Mass Index is %f", bmi);


    }
}
