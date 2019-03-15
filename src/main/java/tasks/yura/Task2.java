package tasks.yura;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List myList = Arrays.asList(4,8,16,38,5,42,4,5,34,78,41,4,38,87,3); // created random array for example

        //reversed the list
        Collections.reverse(myList);
        // printed it
        System.out.println(myList);

        //using LinkedHashSet all the duplicates were removed and the sequence is saved
        myList = new ArrayList<>(new LinkedHashSet<>(myList));
        System.out.println(myList);

    }
}
