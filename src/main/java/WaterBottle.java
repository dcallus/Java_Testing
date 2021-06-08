public class WaterBottle {

    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }

    public void takeDrink() {
        this.volume -= 10;
    }

    public void emptyDrink() {
        this.volume = 0;
    }

    public int fill() {
        return this.volume = 100;
    }
}
