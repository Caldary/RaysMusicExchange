package instrumentsTest;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar1;
    Guitar guitar2;

    @Before
    public void before(){
        guitar1 = new Guitar("acoustic", "brown", 6);
        guitar2 = new Guitar("electric", "purple", 12);
    }

    @Test
    public void hasType(){
        assertEquals("electric", guitar2.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("purple", guitar2.getColour());
    }

    @Test
    public void canPlayMusic(){
        assertEquals("Guitar Sounds", guitar2.playMusic());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(12, guitar2.getNumberOfStrings());
    }
}
