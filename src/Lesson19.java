public class Lesson19 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(18);
        human.setName("Tom");
        human.getInfo();
        Human human2 = new Human();
        human.setAge(18);
        human.setName("Bob");
        human2.getInfo();
    }
}

class Human {
    private String name;
    private int age;

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