public class Cat extends Animal {
    private boolean hasPlayedWith;
    private boolean hasHairBall;

    public Cat(String name, int age, boolean vaccinated, double weight, boolean hasPlayedWith, boolean hasHairBall) {
        super(name,age,vaccinated,weight);
        this.hasPlayedWith = hasPlayedWith;
        this.hasHairBall = hasHairBall;
    }

    public void play() {
        System.out.println("Yay, I love to play!");
        hasPlayedWith = true;
    }

    public void meow() {
        System.out.println("Meow");
    }
    public boolean isHasPlayedWith() {
        return hasPlayedWith;
    }

    public boolean isHasHairBall() {
        return hasHairBall;
    }
}
