package Problem1;

import java.util.HashMap;

public class Problem1<T> implements P1Interface<T> {

    private HashMap<T, Integer> numberOccurrences;

    // Initialise the hashmap in the constructor
    public Problem1(){
        numberOccurrences = new HashMap<>();
    }

    // Takes an Array of Objects T and outputs a hashmap of the number of occurrences
    @Override
    public HashMap<T, Integer> NumberOfOccurrences(T[] arrayObjs){
        // One iteration of the hashmap
        for(int i =0; i < arrayObjs.length; i++){
            // If the object is not in the in the hashmap add it and set the value to 1.
            if (!numberOccurrences.containsKey(arrayObjs[i])){
                numberOccurrences.put(arrayObjs[i], 1);
            }
            // If the object is in the hashmap, increment the value by 1.
            else{
                numberOccurrences.put(arrayObjs[i], numberOccurrences.get(arrayObjs[i]) + 1);
            }
        }
        return numberOccurrences;
    }
}
