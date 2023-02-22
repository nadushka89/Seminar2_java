import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

// Найдите сумму всех элементов LinkedList, 
// сохраняя все элементы в списке. Используйте итератор

public class Task03_04HOME {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = randomList(7);
        int sum = SumLinkElement(integerLinkedList);
        System.out.print("Изначальный список LinkedList: " + integerLinkedList + "\n");
        System.out.printf("Cумма элементов LinkedList = %d\n", sum);
    }

    static LinkedList<Integer> randomList(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            linkedList.add(random.nextInt(50));
        }
        return linkedList;
    }
    public static int SumLinkElement(LinkedList<Integer> linkedList) {
        Iterator<Integer> iteratorList = linkedList.iterator();
        int result = 0;
        while (iteratorList.hasNext()) {
            int item = iteratorList.next();
            result += item;
        }
        return result;
    }

}
