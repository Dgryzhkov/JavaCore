public class Lesson19 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(18);
        human.setName("Tom");
        human.getInfo();
        Human human2 = new Human();
        human2.setAge(18);
        human2.setName("Bob");
        human2.getInfo();
    }
}

class Human {
    private String name;
    private int age;

    public Human(String bob, int i) {
    }

    public Human() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println(name + "," + age);
    }
}