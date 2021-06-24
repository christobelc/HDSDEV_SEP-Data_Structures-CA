package Problem3;

import java.util.Scanner;

public class TestCases {

    public static void main(String[] args)
    {

        Problem3 tester = new Problem3();

        //--------Test Case 1 - HardCoded Values ----------
        System.out.print("---------------Test Case 1 - Hard Coded ----------------------\n\n");

        int[] A = { 2, 7, 4, 0, 9, 5, 1, 3 };
        int sum = 20;

        System.out.print("Array: ");
        for (int num: A) {
            System.out.print( num +", ");
        }
        System.out.println();

        if (tester.hasQuadruplet(A, sum, 0, 0)) {
            System.out.print("Quadruplet Exists\n\n");
        }
        else {
            System.out.print("Quadruplet Doesn't Exist\n\n");
        }


        //--------- Test Case 2 - User Input ----------------------------
        System.out.print("---------------Test Case 2 - User Input ----------------------\n\n");

        // User Input the number os elements in the Array - Input Validation
        int noOfElements=0;
        boolean valid1 = false;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Please input number of elements you would like the array to hold: ");
            // only accept an int value
            if (scanner.hasNextInt()) {
                noOfElements = scanner.nextInt();
                valid1 = true;
            } else {
                scanner.next();
                System.out.println("not correct input!");
            }
        }while(!valid1);

        // User Input of the nodes for BST - Input Validation
        int [] elementsArray = new int [noOfElements];
        for(int i = 0; i < elementsArray.length; i++){
            boolean valid2 = false;
            do{
                System.out.print("Please input value number " + (i+1) + ": ");
                // only accept an int value
                if (scanner.hasNextInt()) {
                    elementsArray[i] = scanner.nextInt();
                    valid2 = true;
                } else {
                    scanner.next();
                    System.out.println("not correct input!");
                }
            }while(!valid2);
        }
        System.out.println("All elements successfully entered! \n");

        // User Input the target - Input Validation
        int target=0;
        boolean valid3 = false;

        do{
            System.out.print("Please enter the target for value: ");
            // only accept an int value
            if (scanner.hasNextInt()) {
                target = scanner.nextInt();
                valid3 = true;
            } else {
                scanner.next();
                System.out.println("not correct input!");
            }
        }while(!valid3);


        // call the method and print result
        if (tester.hasQuadruplet(elementsArray, target, 0, 0)) {
            System.out.print("Quadruplet Exists");
        }
        else {
            System.out.print("Quadruplet Doesn't Exist");
        }
    }
}
