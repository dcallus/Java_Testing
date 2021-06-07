public class WaterBottle {
    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }
    public int getVolume() {
        return this.volume;
    }

    public int takeDrink() {
        return this.volume - 10;
    }

    public int emptyDrink() {
        return this.volume = 0;
    }

    public int fill() {
        return this.volume = 100;
    }
}
