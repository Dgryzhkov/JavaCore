import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;


public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream( new FileInputStream("people.bin"))){ // не нежно закрывать поток
            //FileInputStream fis = new FileInputStream("people.bin");
            //ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] people = (Person[])ois.readObject();
            System.out.println(Arrays.toString(people));

//            int personCount = ois.readInt();
//            Person [] people = new Person[personCount];
//
//            for (int i=0; i<personCount; i++){
//                people[i]=(Person)ois.readObject();
//            }
//         System.out.println(Arrays.toString(people));

//            Person person1 = (Person)ois.readObject();
//            Person person2 = (Person)ois.readObject();
//            Person person3 = (Person)ois.readObject();
//            System.out.println(person1);
//            System.out.println(person2);
//            System.out.println(person3);
           // ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
