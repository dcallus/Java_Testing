import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasStartingVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canTakeDrink(){
        waterBottle.takeDrink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void canEmptyDrink(){
        waterBottle.emptyDrink();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test

    public void canFillDrink(){
        waterBottle.emptyDrink();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
