public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Roman";
        person.age = 55;
        System.out.println("Меня зовут "+person.name + " мне "+person.age);

        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
        System.out.println("Меня зовут "+person2.name + " мне "+person2.age);


    }
}

class Person {
    String name;
    int age;
}
