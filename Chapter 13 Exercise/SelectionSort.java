import java.util.ArrayList;
import java.util.Scanner;

class SelectionSort {
    private static final Scanner scan = new Scanner(System.in);
    private static ArrayList<Integer> arr = new ArrayList<Integer>();
    public static void main(String[] args) {
        
        getInput();
        selectionSort();

        printArray();
    }

    private static void getInput() {
        int n;

        System.out.println("Enter a number(-1 to stop) ");
        n = Integer.parseInt(scan.nextLine());
        while (n != -1) {
            arr.add(n);
            n = Integer.parseInt(scan.nextLine());
        } 
    }

    private static void selectionSort() {
        int n = arr.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(minIndex) > arr.get(j)) {
                    minIndex = j;
                }
            }

            swap(minIndex, i);
        }
    }

    private static void swap(int index_1, int index_2) {
        int temp = arr.get(index_2);
        arr.set(index_2, arr.get(index_1));
        arr.set(index_1, temp);
    }

    private static void printArray() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}