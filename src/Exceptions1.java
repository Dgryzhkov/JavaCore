import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исклюения");
        }

    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("test1");
        Scanner scanner = new Scanner(file);
    }

}
