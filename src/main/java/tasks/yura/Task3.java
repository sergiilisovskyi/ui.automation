package tasks.yura;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(4,8,16,3,5,42,4,5,34,78,41,4,38,87,3); // created random array for example

        // found min
        int min = myList.get(0);
        for (int i = 1; i < myList.size() ; i++) {
            if(min> myList.get(i)){
                min = myList.get(i);
            }
        }
        //found average
        int sum = 0;
        for (int i : myList) {
            sum += i;
        }
        int average = sum / myList.size();

        //only last min was changed
        for (int i = myList.size()-1; i >=0 ; i--) {
            if(myList.get(i).equals(min)){
                myList.set(i, average);
                break;
            }
        }
        System.out.println(myList);
    }
}
