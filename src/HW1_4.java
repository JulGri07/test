package com.example.java;

import java.util.Scanner;

public class HW1_4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dist;
        double time;
        double h;
        double m;
        double s;
        double speedkmh;
        double speedms;

        System.out.println("Please, enter distance (in meters) and time (as three numbers: hours, minutes, seconds)");
        dist = scanner.nextInt();
        h = scanner.nextInt();
        m = scanner.nextInt();
        s = scanner.nextInt();

        time = (h * 60 * 60) + (m * 60) + s;

        speedkmh = dist / time;
        speedms = speedkmh * 3.6;

        System.out.println("Your speed in meters/second is " + speedms + " \nYour speed in km/h is " + speedkmh );

    }



}
