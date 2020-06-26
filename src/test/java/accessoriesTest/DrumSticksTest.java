package accessoriesTest;

import accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks1;
    DrumSticks drumSticks2;

    @Before
    public void before(){
        drumSticks1 = new DrumSticks("wood", "new", 10);
        drumSticks2 = new DrumSticks("metal", "exelent", 25);
    }

    @Test
    public void hasType(){
        assertEquals("wood", drumSticks1.getType());
    }

    @Test
    public void hasDescription(){
        assertEquals("new", drumSticks1.getDescription());
    }

    @Test
    public void hasPriceAcquired(){
        assertEquals(25, drumSticks2.getAcquired());
    }
}
