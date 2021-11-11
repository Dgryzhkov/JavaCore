import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excception3 {
    public static void main(String[] args) {
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("lala");
        }
//        String name = null;
//        name.length();
//        int[]arr = new int[3];
//        System.out.println(arr[3]);
    }
}
