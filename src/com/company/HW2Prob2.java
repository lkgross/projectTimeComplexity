package com.company;

public class HW2Prob2 {
    public static void main(String args[]) {
        int m;

        try {
            m = Integer.parseInt(args[0]);

        } catch (Exception e) {
            System.out.println("Please provide an integer value for n as a command line argument.");
            return;
        }

        long n = (long) m;
        long startTime = System.currentTimeMillis();

        long count;

        // INSERT YOUR CODE HERE.
        // Here is a sample initialization of count:
        count = 0;

        long endTime = System.currentTimeMillis();
        System.out.printf("%,d operations were performed (in %d milliseconds)",
                count, endTime - startTime);
    }
}