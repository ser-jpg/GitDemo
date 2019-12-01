package BootCampJava.Bill;

public class Suggestion {

    private String random_food;
    private String random_clots;

    public Suggestion(String random_food,String random_clots) {
        this.setRandom_food(random_food);
        this.setRandom_clots(random_clots);
    }

    public String getRandom_food() {
        return random_food;
    }

    public void setRandom_food(String random_food) {
        this.random_food = random_food;
    }

    public String getRandom_clots() {
        return random_clots;
    }

    public void setRandom_clots(String random_clots) {
        this.random_clots = random_clots;
    }
}
