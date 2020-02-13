public class Bird extends Animal {
    private double flyingSpeed;

    public Bird() {
    }

    public Bird(int age, double weightInKg, double flyingSpeed) {
        super(age, weightInKg);
        this.flyingSpeed = flyingSpeed;
    }

    public double getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(double flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    public void fly() {
        System.out.println("~~I am flying~~");
    }
}
