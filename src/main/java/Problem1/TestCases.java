package Problem1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TestCases {
    public static void main(String[] args) {

        // -------------Test Case 1 (Integers) - Hardcoded  ---------------------------
        Integer [] numbers = {11, 22, 14, 15, 11, 31, 22, 22,22,22, 11, 54345, 54345};

        //run the test
        Problem1<Integer> test = new Problem1<Integer>();
        HashMap<Integer, Integer> numberOccurrences = test.NumberOfOccurrences(numbers);

        //copy the key and values
        List<Integer> values = new ArrayList<Integer>(numberOccurrences.values());
        List<Integer> keys = new ArrayList<Integer>(numberOccurrences.keySet());

        System.out.println("-------- Test with Type Integers --------\n");

        //print to the console
        for (int i = 0; i < keys.size(); i++){
            System.out.println(keys.get(i) + " occurs " + values.get(i) + " times.");
        }
        System.out.println();

        // -------------Test Case 2 (Double) - Hardcoded ---------------------------

        Double [] dNumbers = {11.1, 22.1, 14.1, 15.1, 11.1, 31.1, 22.1, 22.1, 22.1, 22.1, 11.1, 54345.1, 54345.1};

        //run the test
        Problem1<Double> test1 = new Problem1<Double>();
        HashMap<Double, Integer> numberOccurrences1 = test1.NumberOfOccurrences(dNumbers);

        //copy the key and values
        List<Integer> values1 = new ArrayList<Integer>(numberOccurrences1.values());
        List<Double> keys1 = new ArrayList<Double>(numberOccurrences1.keySet());

        System.out.println("-------- Test with Type Double --------\n");

        //print to the console
        for (int i = 0; i < keys1.size(); i++){
            System.out.println(keys1.get(i) + " occurs " + values1.get(i) + " times.");
        }
        System.out.println();

        // -------------Test Case 3 (String) - User Input Validation  ---------------------------
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int noOfItems = 0;

        System.out.println("-------- Number of occurrences of a word in an array --------\n");
        //User input for number of words to be entered
        do{
            System.out.print("Please input number of words you want to enter into the array: ");
            //only accept an int value
            if (scanner.hasNextInt()) {
                noOfItems = scanner.nextInt();
                valid = true;
            } else {
                scanner.next();
                System.out.println("not correct input!");
            }
        }while(!valid);


        // Loop for the amount of words to be entered
        String [] words = new String[noOfItems];
        for(int i = 0; i < noOfItems; i++){
            System.out.print("Please enter word " + (i+1) +": ");
            words[i] = scanner.next();
        }
        System.out.println();
        System.out.println("-------- Results from test with type String --------\n");

        //Run the test
        Problem1<String> test2 = new Problem1<String>();
        HashMap<String, Integer> numberOccurrences2 = test2.NumberOfOccurrences(words);

        //copy the key and values
        List<Integer> values2 = new ArrayList<Integer>(numberOccurrences2.values());
        List<String> keys2 = new ArrayList<String>(numberOccurrences2.keySet());

        //print to the console
        for (int i = 0; i < keys2.size(); i++){
            System.out.println(keys2.get(i) + " occurs " + values2.get(i) + " times.");
        }
        System.out.println();
    }
}
