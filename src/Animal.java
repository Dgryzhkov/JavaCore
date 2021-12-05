import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public enum Animal {
    DOG("Собака"), CAT("Кошка"), FROG("Лягушка");

    private String translation;


    Animal(String translation) {
        this.translation = translation;
    }
    public String getTranslation(){
        return translation;
    }

    @Contract(pure = true)
    public @NotNull
    String toString(){
        return "перевод на русский язык " + translation;
    }
}
