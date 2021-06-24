package Problem4;

import java.util.ArrayList;

public class Problem4 <T extends Comparable<T>> implements P4Interface <T>{

    private T left;
    private T right;

    //default constructor
    public Problem4(){
    }

    //getters
    public T getLeft(){
        return left;
    }

    public T getRight(){
        return right;
    }

    // interface implemented methods
    @Override
    public void setLeft(T left) {
        this.left = left;
    }

    @Override
    public void setRight(T right) {
        this.right = right;
    }

    @Override
    public boolean leftGreaterThanRight() {
        if(left.compareTo(right) > 0){
            return true;
        }else {
            return false;
        }
    }

    // Deletes pairs of T objs from an arraylist obj
    @Override
    public void DeletePairsMethod(ArrayList<T> list) {

        // declare an arrayList of the indexes to be deleted
        ArrayList<T> removeIndexes = new ArrayList<>();

        // Check if list is odd in size, make even
        if (list.size() % 2 == 1) {
            list.remove(list.size() - 1);
        }

        // two pointers one even(right) one odd (left)
        for (int i = 0; i < list.size(); i += 2) {
            int left = i, right = i + 1;
            //set the T obj variables to left and right
            setLeft(list.get(left));
            setRight(list.get(right));

            // compare and add to remove indexes arraylist
            if (leftGreaterThanRight()) {
                removeIndexes.add(list.get(i));
                removeIndexes.add(list.get(i + 1));
            }
        }
        // remove the pairs at indexes
        for (T obj : removeIndexes) {
            list.remove(obj);
        }
    }
}
