public class Eagle extends Bird {
    private String prey;

    public Eagle() {
    }

    public Eagle(int age, double weightInKg, double flyingSpeed, String prey) {
        super(age, weightInKg, flyingSpeed);
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
