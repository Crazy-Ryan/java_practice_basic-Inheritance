public class Bird extends Animal {
    private double flyingSpeedInKmPerHour;

    public Bird() {
    }

    public Bird(int age, double weightInKg, double flyingSpeedInKmPerHour) {
        super(age, weightInKg);
        this.flyingSpeedInKmPerHour = flyingSpeedInKmPerHour;
    }

    public double getFlyingSpeed() {
        return flyingSpeedInKmPerHour;
    }

    public void setFlyingSpeed(double flyingSpeedInKmPerHour) {
        this.flyingSpeedInKmPerHour = flyingSpeedInKmPerHour;
    }

    public void fly() {
        System.out.println("~~I am flying~~");
    }
}
