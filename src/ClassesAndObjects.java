public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Petr");
        person.setAge(-15);
        System.out.println("Выводим значение в main методе " + person.getName());
        System.out.println("Выводим значение в main методе " + person.getAge());
        person.speak();
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0) {
            System.out.println("Возраст должен быть полжительный");
        } else {
            this.age = age;
        }
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
