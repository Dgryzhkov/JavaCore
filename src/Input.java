import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        String string=scanner.nextLine();
        System.out.println(" вы ввели " + string);
    }
}
