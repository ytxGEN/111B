public interface LinkedListADT<E> {
    /**
     * Inserts an element at the specified position in the list
     * @param data The data to insert.
     * @param index The position at which to insert the data.
     */
    public void insert(E data, int index);

    /**
     * Appends the specified element to the end of the list.
     * @param data The data to append.
     */
    public void append(E data);

    /**
     * Removes the element at the specified position in this list.
     * @param index The index of the element to be removed.
     * @return true if the removal was successful, false otherwise.
     */
    public boolean remove(int index);

    /**
     * Searches for the specified element in this list.
     * @param data The data to search for.
     * @return true if the data is found, false otherwise.
     */
    public boolean contains(E data);

    /**
     * Retrieves the element at the specified position in this list.
     * @param index The index of the element to retrieve.
     * @return The data at the specified index.
     */
    public E get(int index);

    /**
     * Prints all elements in the list from first to last.
     */
    public void printList();
}
