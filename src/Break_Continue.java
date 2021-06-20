public class Break_Continue {
    public static void main(String[] args) {
       int i=0;
        while(true){
            if (i ==15){
                break;
            }
            System.out.println(i);
            i++;
       }
        System.out.println("мы вышли из цикла");

        for (int y=0;y<=15;y++){
            if (y%2==0){
                continue;
            }
            System.out.println("это нечетное число "+y);
        }
    }
}
