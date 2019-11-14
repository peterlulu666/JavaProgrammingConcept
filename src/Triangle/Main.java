package Triangle;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        // Your program should prompt the user to
        // enter the three real values.
        double TOLERANCE = 0.0001;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter side a");
        double sideA = scanner.nextDouble();
        System.out.println("enter side b");
        double sideB = scanner.nextDouble();
//        System.out.println("enter side c");
//        double sideC = scanner.nextDouble();
        // Now for the tricky part. We are going to go back and
        // edit what we did at the very beginning. Initially,
        // the user was entering the length of the three sides.
        // Instead, we want to ask the user to enter the first two sides of a triangle.
        // We then need our program to generate a third random real side length that results in a valid triangle.
        // Given the hints above, what can the minimum and maximum possible values be?
        // The rest of the program will then proceed as before using the randomly generated value.
        var random = new Random();
        int max = (int) ((sideA) + sideB);
        int min = (int) (Math.abs(sideA - sideB));
        double sideC;
        // Random number in max and min range
        // nextInt is normally exclusive of the top value
        // and inclusive of the bottom value, so min + 1 would make it exclusive of the bottom value
        sideC = ThreadLocalRandom.current().nextInt(min + 1, max);
        System.out.println("Side c is " + sideC);
//            // Random number in max and min range exclusively
//        while (true) {
//            // inclusive of top and bottom value
//            // random.nextInt(max - min) generate random number from 0 to max - min exclusively
//            // random.nextInt((max - min) + 1) generate random number from 0 to max - min inclusively
//            // random.nextInt((max - min) + 1) + min generate random number from min to max inclusively
//            sideC = random.nextInt((max - min) + 1) + min;
//            // exclusive of top and bottom value
//            if (sideC != sideA + sideB && sideC != Math.abs(sideA - sideB)) {
//                break;
//
//            }
//
//        }

        // Swap number
        // Sort number
        // sideA is the smallest side and sideC is the largest side
        if (sideA > sideB) {
            double temp = sideA;
            sideA = sideB;
            sideB = temp;

        }
        if (sideA > sideC) {
            double temp = sideA;
            sideA = sideC;
            sideC = temp;

        }
        if (sideB > sideC) {
            double temp = sideB;
            sideB = sideC;
            sideC = temp;

        }
        // Once done, write code to determine whether the
        // three real value measurements make a triangle.
        // If yes, your program should tell the user whether
        // the triangle is a right, acute, or obtuse triangle.
        // A triangle is possible IFF each side is smaller than the sum of the others.
        boolean isTriangle = true;
        if (sideA <= 0 || sideB <= 0 || sideC <= 0 || sideA + sideB <= sideC) {
            System.out.println("They can not make a triangle. ");
            isTriangle = false;

        }
        // the triangle is a right triangle if (and only if) a^2 + b^2 == c^2
        // Due to the imprecise nature of double variables,
        // you cannot directly compare two double variables with the == operator.
        // Instead, you should do the comparison using a TOLERANCE constant.
        else if (Math.abs(Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) <= TOLERANCE) {
            System.out.println("It is a right triangle. ");

        }
        // If the triangle is not right, you should then check whether if it is acute (i.e., a^2 + b^2 > c^2).
        else if (Math.pow(sideA, 2) + Math.pow(sideB, 2) > Math.pow(sideC, 2)) {
            System.out.println("It is an acute triangle. ");

        }
        // Otherwise, if the triangle is not right or acute,
        // then you can say the triangle is obtuse (i.e., a^2 + b^2 < c^2).
        else if (Math.pow(sideA, 2) + Math.pow(sideB, 2) < Math.pow(sideC, 2)) {
            System.out.println("It is an obtuse triangle. ");

        }
        // If the result of Part I determines we do have a valid triangle,
        // then we will continue to print out some stats about our triangle.
        // We first will want to print out the three sides in increasing order.
        // Then, we will print out both the perimeter and area of the triangle.
        double perimeter = sideA + sideB + sideC;
        double semiPerimeter = perimeter / 2;
        double area = Math.pow(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC), 0.5);
        if (isTriangle) {
            System.out.println("The perimeter is " + perimeter + " and the area is " + area);
        }


    }
}
