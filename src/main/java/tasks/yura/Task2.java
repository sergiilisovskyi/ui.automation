package tasks.yura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {4,8,16,38,5,42,4,5,34,78,41,4,38,87,3}; // created random array for example

        //конвертнув арей в арей ліст
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            myList.add(array[i]);
        }

        //перевернув ліст
        Collections.reverse(myList);

        // прінтанув його
        for (int i : myList) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //тут через лінкед хаш сет забрав всі дублікати і вивів в консоль зі збереженням послідовності
        myList = new ArrayList<Integer>(new LinkedHashSet<Integer>(myList));
        for (int i : myList) {
            System.out.print(i + " ");
        }

    }
}
