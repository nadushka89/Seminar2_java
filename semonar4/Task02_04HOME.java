// Реализуйте очередь с помощью LinkedList со следующими методами:
//  enqueue() - помещает элемент в конец очереди, 
//  dequeue() - возвращает первый элемент из очереди и удаляет его, 
//  first() - возвращает первый элемент из очереди, не удаляя.
public class Task02_04HOME {
    public static void main(String[] args) {
        myLinkedList mList = new myLinkedList();
        mList.enqueue(5);
        mList.enqueue(4);
        mList.enqueue(3);
        mList.enqueue(2);
        mList.enqueue(1);
        System.out.println(mList.showLink());
        System.out.println(mList.dequeue());
        System.out.println(mList.showLink());
        System.out.println(mList.first());
        System.out.println(mList.showLink());
    }
}
