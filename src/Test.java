interface AbleToEat {
    public void eat();
}

public class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Nyam Nyam");
            }


        };
        ableToEat.eat();
    }
}
