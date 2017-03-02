package org.launchcode.java.demos.org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by tejones on 2/27/17.
 */
public class Area {

    public static void main(String[] args) {

        System.out.println("Enter a radius: ");
        Scanner in = new Scanner(System.in);
        double pi = 3.14, area;
        int r = in.nextInt();

        area = pi * r * r;

        System.out.println("Area of circle: " + area);

        }
    }
