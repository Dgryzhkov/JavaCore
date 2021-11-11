import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listofDogs = new ArrayList<>();
        listofDogs.add(new Dog());
        listofDogs.add(new Dog());
        test(listOfAnimals);
        test(listofDogs);
    }

    private static void test(List<? extends Animal>list){
        for (Animal animal: list) {
           animal.eat();
        }
    }
}
