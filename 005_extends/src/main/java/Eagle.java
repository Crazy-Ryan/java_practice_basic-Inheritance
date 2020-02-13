public class Eagle extends Bird {
    private String prey;

    public Eagle() {
    }

    public Eagle(int age, double weightInKg, double flyingSpeedInKmPerHour, String prey) {
        super(age, weightInKg, flyingSpeedInKmPerHour);
        this.prey = prey;
    }

    public String getPrey() {
        return prey;
    }

    public void setPrey(String prey) {
        this.prey = prey;
    }

    public void hunt (){
        System.out.println("Hunting " + this.prey);
    }

}
