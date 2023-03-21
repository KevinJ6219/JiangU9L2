public class Dog extends Animal {
    private boolean hasBeenWalked;
    private boolean dogTrained;

    public Dog(String name, int age, boolean vaccinated, double weight, boolean hasBeenWalked, boolean dogTrained) {
        super(name, age, vaccinated, weight);
        this.hasBeenWalked = hasBeenWalked;
        this.dogTrained = dogTrained;
    }

    public void walk() {
        System.out.println("I just finished walking");
        hasBeenWalked = true;
    }

    public void woof() {
        System.out.println("Woof");
    }

    public boolean isHasBeenWalked() {
        return hasBeenWalked;
    }

    public boolean isDogTrained() {
        return dogTrained;
    }
}
