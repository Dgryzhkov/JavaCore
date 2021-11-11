import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;

public class Exceptions2 {
    public static void main(String[] args) throws ScanerExeption {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if(x!=0){
            throw  new ScanerExeption("Non null");
            }
        }
    }
}
