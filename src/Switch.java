import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedi vozrast");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("Ti rodilsya");
                break;
            case 7:
                System.out.println("Ti poshel v shkolu");
                break;
            case 18:
                System.out.println("Ti zakonchil shkolu");
                break;
            default:
                System.out.println("Ni odno uslovie ne podoshlo18");
        }
    }
}
