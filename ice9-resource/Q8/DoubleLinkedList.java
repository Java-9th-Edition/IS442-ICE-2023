public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }
        size++;
    }

    public void add(int position, int element) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(element);
        if (position == 0) {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        } else if (position == size) {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.getNext().setPrevious(newNode);
            current.setNext(newNode);
            newNode.setPrevious(current);
        }
        size++;
    }

    public int remove(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException();
        }
        int element;
        if (position == 0) {
            element = head.getValue();
            head = head.getNext();
            head.setPrevious(null);
        } else if (position == size - 1) {
            element = tail.getValue();
            tail = tail.getPrevious();
            tail.setNext(null);
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.getNext();
            }
            element = current.getNext().getValue();
            current.setNext(current.getNext().getNext());
            current.getNext().setPrevious(current);
        }
        size--;
        return element;
    }

    public int remove() {
        return remove(size - 1);
    }

    public int size() {
        return size;
    }
}
