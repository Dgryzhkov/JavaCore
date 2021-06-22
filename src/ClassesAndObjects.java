public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person();
        person.setNameAndAge("Vasya",50);
    //    person.age = 55;
        Person person2 = new Person();
        String s="Kolya";
        person2.setNameAndAge(s,20);
   //     person2.age = 20;
        person.speak();
        person2.speak();
        person2.sayHello();
        System.out.println();
        int year1 = person.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии: "+year1+" лет");
        System.out.println("Второму человеку до пенсии: "+year2+" лет");
    }
}

class Person {
    String name;
    int age;


    void setNameAndAge(String username, int userAge){
        name=username;
        age=userAge;
    }
    int calculateYearsToRetirement() {
        int years = 65 - age;
        //System.out.println("Колчиество лет до пенсии: "+years);
        return years;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }

    void sayHello() {
        System.out.println("Привет!");
    }
}
