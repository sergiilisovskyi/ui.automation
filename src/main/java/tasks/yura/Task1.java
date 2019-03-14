package tasks.yura;

import java.util.ArrayList;

public class Task1 {

    static int E1 = 4; // created random element E1
    static int E2 = 9999; // created random element E2
    static int[] array = {4,8,16,38,5,42,4,4,34,78,41,4,456,87}; // created random array for example

    public static void main(String[] args) {

        //конвертнув арей в арей ліст
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            myList.add(array[i]);
        }

        // вивів старий ліст
        System.out.println("Old list is: ");
        for (int i : myList) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //вивів новий ліст
        ArrayList<Integer> modified = modifyList(myList);
        System.out.println("New list is: ");
        for (int i : modified) {
            System.out.print(i + " ");
        }
    }


    // метод який заміняє елемент Е1 на елемент Е2 в першій половині ліста

    public static ArrayList<Integer> modifyList (ArrayList<Integer> list){
        ArrayList<Integer> modifiedList = list;
        int halfSize = list.size()/2;
        for (int i = 0; i < halfSize; i++) {
            if(modifiedList.get(i).equals(E1)){
                modifiedList.set(i, E2);
            }
        }
        return modifiedList;
    }

}
