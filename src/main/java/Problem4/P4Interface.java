package Problem4;

import java.util.ArrayList;

public interface P4Interface <T> {
    //methods to be implemented
    boolean leftGreaterThanRight();
    void setLeft(T left);
    void setRight(T right);
    void DeletePairsMethod(ArrayList<T> list);
}
