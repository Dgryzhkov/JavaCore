import com.sun.security.jgss.GSSUtil;

public class Lesson20 {
    public static void main(String[] args) {
        Humans h1 = new Humans("Bob", 40);
        Humans h2 = new Humans("Tom", 30);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Humans h3 = new Humans("Rob",50);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();

//        Humans.descritpion = "Nice";
//        h1.getALlFields();
//        h2.getALlFields();
//        Humans.descritpion ="Bad";
//        h1.getALlFields();
//        h2.getALlFields();

//        System.out.println(Math.pow(2,4));
//        System.out.println(Math.PI);
    }
}

class Humans {
    private String name;
    private int age;
    private static int countPeople;


//    public Humans() {
//      this.name="Какое то имя";
//      this.age=0;
//    }
//
//    public Humans(String name) {
//        System.out.println("Привет из конструктора с именем");
//        this.name = name;
//    }
    public Humans(String name, int age) {
       // System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void printNumberOfPeople (){
        System.out.println("Number of People is " + countPeople);
    }

}
