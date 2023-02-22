import java.util.LinkedList;

//  enqueue() - помещает элемент в конец очереди, 
//  dequeue() - возвращает первый элемент из очереди и удаляет его, 
//  first() - возвращает первый элемент из очереди, не удаляя.

public class myLinkedList {
    private LinkedList<Integer> linkedList = new LinkedList<>();

    void enqueue(int item){
        linkedList.addLast(item);
    }
    Integer dequeue(){
        if (linkedList.size()>0){
            return linkedList.pollFirst();
        }
        return null;
    }
    Integer first(){
        if (linkedList.size()>0){
            return linkedList.peekFirst();
        }
        return null;
    }
    String showLink(){
        return linkedList.toString();
    }

}
