import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /////Java5///////

        Animal ourAnimal = new Animal;
         List animals = new ArrayList();
         animals.add("cat");
         animals.add("dog");
         animals.add("frog");
         animals.add(animals);

        String animal = (String)animals.get(1);
        System.out.println(animal);

        ////// с появлением дженериков/////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("Cat");
        animals2.add("Dog");
        animals2.add("frog");
        //animals2.add(ourAnimal);// не работает
        String animal2 = animals2.get(1);

        ///////Java7///////
        List<String> animals3= new ArrayList<>();
        animals3.add("Cat");
        animals3.add("Dog");
      //  animals3.add(ourAnimal);//не работает


    }
}

class Animal{

}
