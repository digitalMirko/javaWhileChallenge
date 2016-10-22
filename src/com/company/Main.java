package com.company;
/**
 * Challenge part 1
 * Create a method called isEvenNumber that takes a parameter of type int
 * Its purpose is to determine if the argument passed to the method is an even number or not.
 * Return true if an even number, otherwise return false.
 */

/**
 * Challenge part 2
 * Modify the while code above
 * Make it so it records the total number of even numbers it has found
 * and break once 5 are found
 * and at the end, display the total number of even numbers found
 */
public class Main {

    public static void main(String[] args) {

        int count = 0;
        int number = 5;
        int finishNumber = 20;

        while (number <= finishNumber && count <= 4) {

            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            count += 1;
            number++;
        }
        System.out.println("Total number of even found: " + count);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}

/*
Output: Challenge part 2:
Even number 6
Even number 8
Even number 10
Even number 12
Even number 14
Total number of even found: 5
 */
