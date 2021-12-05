public class Test {

    public static void main(String[] args) {
//        counter(3);
//
//    }
//
//    private static void counter(int n) {
//        if (n==0)
//            return;
//
//        System.out.println(n);
//
//        counter(n - 1);
//
//
//    }

        System.out.println(fac(4));

    }
    private static int fac ( int n){
        if (n == 1)
            return 1;
        return n * fac(n-1);
    }
}