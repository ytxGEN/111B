import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVScanner {
    public static void main(String[] args) {
        String filepath = "Employee_Data.csv";
        File file = new File(filepath);

        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] values = line.split(",");

                for (String value : values) {
                    System.out.print(value + "\t");
                }
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occured: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
