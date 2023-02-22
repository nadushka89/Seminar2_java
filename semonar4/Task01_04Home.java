import java.util.Collections;
import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.
//  Постараться не обращаться к листу по индексам.

public class Task01_04Home {
    public static void main(String[] args) {
        int[] myArray = createArray(10);
        LinkedList<Integer> myLinkedListik = addLinkedListLast(myArray);
        showLinkedList(myLinkedListik);
        LinkedList<Integer> linkList = new LinkedList<Integer>();
        linkList.add(25);
        linkList.add(58);
        linkList.add(85);
        linkList.add(1);
        linkList.add(55);
        linkList.add(96);
        System.out.println(linkList);
        Collections.reverse(linkList);
        System.out.println(linkList);
    }

    public static LinkedList<Integer> addLinkedListLast(int[] array) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            myLinkedList.addFirst(i);
        }
        return myLinkedList;
    }

    public static void showLinkedList(LinkedList<Integer> linkedList) {
        System.out.println(linkedList);
        while (linkedList.size() > 0) {
            linkedList.poll();

        }
    }

    static int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;

    }

}
