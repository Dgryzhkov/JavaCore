public class Test {

    public static void main(String[] args) {
        Season season= Season.SUMMER;
        Animal animal = Animal.CAT;
        System.out.println(season.name());
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());


        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());
//        Animal animal = Animal.CAT;
//        System.out.println(animal);
//
//        switch (animal) {
//            case CAT:
//                System.out.println("CAT");
//                break;
//            case DOG:
//                System.out.println("DOD");
//                break;
//        }

        // Object->Enum->Season
//
//
//        Season season = Season.SUMMER;
//        System.out.println(season.getTemperature());
//        System.out.println(season instanceof Enum);
//        System.out.println(season);
//
//        switch (season) {
//            case SUMMER:
//                System.out.println("Hot");
//                break;
//            case AUTUMN:
//                System.out.println("green");
//                break;
        }
    }
