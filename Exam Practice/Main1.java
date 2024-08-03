public class Main1 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();

        myList.append(4);
        myList.append(1);
        myList.append(2);
        myList.append(9);

        myList.insert(7, 2);

        myList.remove(4);

        myList.printList();
    }
}
