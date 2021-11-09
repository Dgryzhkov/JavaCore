public class lesson23 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
        System.out.printf("This is a string %10d \n",5);
        System.out.printf("This is a string %.2f",5.12745687);
    }
}
