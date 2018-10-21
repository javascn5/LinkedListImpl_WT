public class CustomLinkedList<E> implements CustomList<E> {


    private int size;
    private Node head;

    public CustomLinkedList() {
        head = new Node(null);
    }


    @Override          //to znaczy ze metoda jest przyslonieta
    public E get(int index) {
        return null;
    }

    @Override
    public void add(E e) {
        Node copy = head;
        System.out.println("Wartosc copy: " + copy);
        head = new Node(e);
        System.out.println("Wartosc head: " + head);
        head.next = copy; //przesuwanie elementu
        System.out.println("Wartosc next: " + head.next);
        size++; //zwiekszanie rozmiaru
    }

    @Override
    public int size() {
        return 0;
    }

    class Node {
        private Object data; ///dane
        private Node next;  //wskaznik a te dane

        //konstruktor
        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data= " + data +
                    ", next= " + next +
                    '}';
        }
    }

}
