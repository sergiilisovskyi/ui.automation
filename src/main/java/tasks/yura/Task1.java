package tasks.yura;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        //created random array
        List<Integer> myList = Arrays.asList(4,8,16,38,5,42,4,4,34,78,41,4,456,87);

        // print old list
        System.out.println("Old list is: ");
        System.out.println(myList);

        //print new list
        List<Integer> modified = modifyList(myList);
        System.out.println("New list is: ");
        modified.forEach(value -> System.out.print(value + " "));
    }

    // method which is converting element E1 to E2 in the first part of the array

    private static List<Integer> modifyList (List<Integer> list){
        int E1 = 4; // created random element E1
        int E2 = 9999; // created random element E2
        int halfSize = list.size()/2;
        for (int i = 0; i < halfSize; i++) {
            if(list.get(i).equals(E1)){
                list.set(i, E2);
            }
        }
        return list;
    }
}
