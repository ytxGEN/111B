public class LinkedList<E> implements LinkedListADT<E> {
    private Node<E> head;

    /**
     * Inserts an element at the specified position in the list
     * @param data The data to insert.
     *
     */
    @Override
    public void insert(E data, int index) {
        Node<E> newNode = new Node<>(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<E> current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
        else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + currentIndex);
        }
    }

    /**
     * Appends the specified element to the end of the list.
     * @param data The data to append.
     */
    @Override
    public void append(E data) {
        Node<E> newNode = new Node<E>(data);

        if (head == null) {
            head = newNode;
        }

        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        
    }

    /**
     * Removes the element at the specified position in this list.
     * @param index The index of the element to be removed.
     * @return true if the removal was successful, false otherwise.
     */
    @Override
    public boolean remove(int index) {
        if (head == null) {
            return false;
        }

        if (index == 0) {
            head = head.next;
            return true;
        }

        Node<E> current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current.next != null) {
            current.next = current.next.next;
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Searches for the specified element in this list.
     * @param data The data to search for.
     * @return true if the data is found, false otherwise.
     */
    @Override
    public boolean contains(E data) {
        Node<E> current = head;

        while (current != null) {
            if (data.equals(current.data)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public E get(int index) {
        Node<E> current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (current != null) {
            return current.data;
        }
        else {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }

    /**
     * Prints all elements in the list from first to last.
     */
    @Override
    public void printList() {
        Node<E> current = head;

        while (current != null) {
            System.out.print(current.data + " ->");
            current = current.next;
        }
        System.out.println("NULL");
    }
}
