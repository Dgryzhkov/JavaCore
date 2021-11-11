public class Test {
    public static void main(String[] args) {
        //Upcasting -восходящее преобразование
//Downcasting - нисходящее преобраование не безопасно
        Animal a = new Animal();
        Dog dog = (Dog) a;
        dog.bark();



    }
}
