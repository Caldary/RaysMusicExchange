package instrumentsTest;

import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone1;
    Saxophone saxophone2;

    @Before
    public void before(){
        saxophone1 = new Saxophone("alto", "black", 11);
        saxophone2 = new Saxophone("tenor", "pink", 11);
    }

    @Test
    public void hasType(){
        assertEquals("alto", saxophone1.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("black", saxophone1.getColour());
    }

    @Test
    public void canPlayMusic(){
        assertEquals("Sexy Sounds", saxophone1.playMusic());
    }

    @Test
    public void hasNumberOfValves(){
        assertEquals(11, saxophone1.getNumberOfValves());
    }
}
