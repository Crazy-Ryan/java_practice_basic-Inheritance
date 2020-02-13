public class Bird extends Animal {
    private double flyingSpeed;

    public Bird() {
    }

    public Bird(int age, int weight, double flyingSpeed) {
        super(age, weight);
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
