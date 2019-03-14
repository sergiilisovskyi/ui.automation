package tasks.yura;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        int[] array = {4,8,16,3,5,42,4,5,34,78,41,4,38,87,3}; // created random array for example
        //конвертнув арей в арей ліст
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            myList.add(array[i]);
        }

        // знайшов мінімальне значення
        int min = myList.get(0);
        for (int i = 1; i < myList.size() ; i++) {
            if(min> myList.get(i)){
                min = myList.get(i);
            }
        }

        //знайшов середнє арифметичне всього масиву
        int sum = 0;
        for (int i : myList) {
            sum += i;
        }
        int average = sum / myList.size();

        //замінив тільки останнє мінімальне значення
        for (int i = myList.size()-1; i >=0 ; i--) {
            if(myList.get(i).equals(min)){
                myList.set(i, average);
                break;
            }
        }
        System.out.println(myList);


    }
}
