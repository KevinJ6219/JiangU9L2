public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private double weight;

    public Animal(String name, int age, boolean vaccinated, double weight) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.weight = weight;
    }

    public void adopt() {
        System.out.println("I am now adopted");
    }

    public void feed() {
        System.out.println("I have now been fed");
    }

    public void sleep() {
        System.out.println("I am sleepy...");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }
}
