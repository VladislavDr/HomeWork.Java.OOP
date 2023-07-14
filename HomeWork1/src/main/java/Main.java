import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Pet> pets = List.of(
                new Cat("Ezekiel", 5, "Orange", "Longhair", "Orange"),
                new Dog("Gabriel", 7, "Golden", "Longhair", "Brown"),
                new GuineaPig("Raphael", 1, "Black and white", "Longhair", "Grey"),
                new Hamster("Uriel", 2, "Brown-black", "Longhair", "Black")
        );

        pets.forEach(System.out::println);
        System.out.println("\nВаши домашние питомцы существуют");

        Thread.sleep(5000);

        System.out.println("\nКажется, ваши домашние питомцы проголодались");
        pets.forEach(pet -> System.out.println(pet.getName() + " screams " + pet.voice()));

        Thread.sleep(5000);

        System.out.println("\nЯ медленно насыпаю корм...");
        pets.forEach(pet -> System.out.println(pet.getName() + " " + pet.movement("bowl")));

        Thread.sleep(5000);

        System.out.println("\nНаконец-то волосатые дошли до своих мисок");
        pets.forEach(pet -> {
            switch (pet.getName()) {
                case "Ezekiel", "Gabriel" -> System.out.println(pet.getName() + " " + pet.eating("dried food"));
                case "Raphael" -> System.out.println(pet.getName() + " " + pet.eating("vegetables"));
                case "Uriel" -> System.out.println(pet.getName() + " " + pet.eating("nuts"));
            }
        });

        Thread.sleep(5000);

        System.out.println("\nЗаботливый хозяин накормил своих животин");
        pets.forEach(pet -> System.out.println(pet.getName() + " " + pet.enjoy()));
    }
}

