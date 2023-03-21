public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Jeff", 10, false, 30);
        animal.adopt();
        animal.feed();
        animal.sleep();
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println(animal.isVaccinated());
        System.out.println(animal.getWeight());

        System.out.println();

        Cat cat1 = new Cat("Timmy", 5, true, 20, false, true);
        cat1.adopt();
        cat1.feed();
        cat1.sleep();
        cat1.play();
        cat1.meow();
        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());
        System.out.println(cat1.isVaccinated());
        System.out.println(cat1.getWeight());
        System.out.println(cat1.isHasHairBall());
        System.out.println(cat1.isHasPlayedWith());

        System.out.println();

        Dog dog1 = new Dog("Devin", 12, false, 10, false, true);
        dog1.adopt();
        dog1.feed();
        dog1.sleep();
        dog1.woof();
        dog1.walk();
        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());
        System.out.println(dog1.isVaccinated());
        System.out.println(dog1.getWeight());
        System.out.println(dog1.isHasBeenWalked());
        System.out.println(dog1.isDogTrained());
    }
}
