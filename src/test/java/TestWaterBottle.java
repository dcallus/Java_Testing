import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    WaterBottle waterBottle;
    private Object assertEquals;

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
        assertEquals(90, waterBottle.takeDrink());
    }

    @Test
    public void canEmptyDrink(){
        assertEquals(0, waterBottle.emptyDrink());
    }

    @Test
    public void canFillDrink(){
        assertEquals(100, waterBottle.fill());
    }
}
