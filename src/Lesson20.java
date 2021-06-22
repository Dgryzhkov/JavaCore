public class Lesson20 {
    public static void main(String[] args) {
        Humans humans = new Humans();

    }
}

class Humans {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Humans() {
      this.name="Какое то имя";
      this.age=0;
    }

    public Humans(String name) {
        System.out.println("Привет из конструктора с именем");
        this.name = name;
    }
    public Humans(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

}
