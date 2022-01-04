package HW_1.java;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

class HW1_1 {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         double i;
         double m;

         System.out.println("Please, enter inch and press Enter");
         i = scanner.nextInt();

         m = i * 0.0254;

         //System.out.println(i + " inch is " + m + " meters");
         System.out.printf("%.1f inch is %.1f meters\n", i, m ); // нашла еще такую фуннкцию для вывода для более удобного форматирования




     }

}
