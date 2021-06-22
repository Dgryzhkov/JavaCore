public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Roman";
        person.age = 55;
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
person.speak();
person2.sayHello();
    }
}

class Person {
    String name;
    int age;
    void speak(){
        System.out.println("Меня зовут " +name+", мне "+age+" лет");
    }

    void sayHello(){
        System.out.println("Привет!");
    }
}
