package com.company_interview_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @author prateek.bangre on 26/08/21.
 * @Project DataStructure_Algorithms
 */
public class Nike_Question2_OverlappingRectangles {

    static String isRectanglesOverlapping(Point l1, Point r1, Point l2, Point r2) {

        String result = "True";

        if (l1.x == r1.x || l1.y == r1.y || l2.x == r2.x || l2.y == r2.y){
            result = "False";
        }

        if (l1.x >= r2.x || l2.x >= r1.x) {
            result = "False";
        }

        // If one rectangle is above other
        if (r1.y >= l2.y || r2.y >= l1.y) {
            result = "False";
        }

        return result;
    }


    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line = in.readLine();

        String[] points = line.split(",");

        Point l1 = new Point(Integer.valueOf(points[0]), Integer.valueOf(points[1]));
        Point r1 = new Point(Integer.valueOf(points[2]), Integer.valueOf(points[3]));
        Point l2 = new Point(Integer.valueOf(points[4]), Integer.valueOf(points[5]));
        Point r2 = new Point(Integer.valueOf(points[6]), Integer.valueOf(points[7]));

        System.out.println(isRectanglesOverlapping(l1, r1, l2, r2));
    }

    static class Point {
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
