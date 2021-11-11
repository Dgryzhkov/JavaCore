import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
       // String separator = File.separator;
        //String path = separator + "home" + separator + "home" + separator + "Documents" + separator + "Java" + separator + "Test.txt";
        File file = new File("test2");

        Scanner scanner = new Scanner(file);
        String Line = scanner.nextLine();
        String[] numberString = Line.split(" ");
        int[] numbers = new int[3];
        int counter =0;
         for(String number: numberString) {
             numbers[counter++] = Integer.parseInt(number);
         }
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
