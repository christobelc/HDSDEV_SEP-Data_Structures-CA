package Problem4;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCases {
    public static void main(String[] args) {

        Problem4<Double> tester = new Problem4<Double>();
        //-------Test Case 1 (Double)- Hard Coded -----------------------
        System.out.println("--------Test Case 1 (Double) - Hard coded Values----------\n");

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(2.3);
        numbers.add(6.3);
        numbers.add(5.3);
        numbers.add(8.3);
        numbers.add(9.3);
        numbers.add(3.3);
        numbers.add(7.3);
        numbers.add(4.3);
        numbers.add(1.3);
        numbers.add(2.3);

        System.out.println("ArrayList: " + numbers);
        tester.DeletePairsMethod(numbers);
        System.out.println("ArrayList after deleted pairs: " + numbers +"\n");

        //-------Test Case 2 (Integer)- UserInput ------------------------

        System.out.println("--------Test Case 2 (Integer) - User Input----------\n");
        Problem4<Integer> tester1 = new Problem4<Integer>();

        // User Input the number os elements in the ArrayList - Input Validation
        int noOfElements=0;
        boolean valid1 = false;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Please input number of integers you would like the Arraylist to hold: ");
            //only accept an int value
            if (scanner.hasNextInt()) {
                noOfElements = scanner.nextInt();
                valid1 = true;
            } else {
                scanner.next();
                System.out.println("not correct input!");
            }
        }while(!valid1);

        // User Input of Array Values - Input Validation
        ArrayList<Integer> userNumbers = new ArrayList<>();
        for(int i = 0; i < noOfElements; i++){
            boolean valid2 = false;
            do{
                System.out.print("Please input value number " + (i+1) + ": ");
                //only accept an int value
                if (scanner.hasNextInt()) {
                    userNumbers.add(scanner.nextInt());
                    valid2 = true;
                } else {
                    scanner.next();
                    System.out.println("not correct input!");
                }
            }while(!valid2);
        }
        System.out.println("All elements successfully entered! \n");

        System.out.println("ArrayList: " + userNumbers);
        tester1.DeletePairsMethod(userNumbers);
        System.out.println("ArrayList after deleted pairs: " + userNumbers +"\n");
    }
}
