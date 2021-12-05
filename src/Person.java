import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -6256926365352159538L;
    private transient  int id; // не сериализуем
    private   String name;



    @Override
    public String toString() {
        return id + ":" + name;
    }

    public Person(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
