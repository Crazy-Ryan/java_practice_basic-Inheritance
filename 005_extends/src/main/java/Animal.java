public class Animal {
    private int age;
    private double weightInKg;

    public Animal() {
    }

    public Animal(int age, double weightInKg) {
        this.age = age;
        this.weightInKg = weightInKg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void sleep() {
        System.out.println("zzzZZZ");
    }
}
