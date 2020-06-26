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
        saxophone1 = new Saxophone("alto", "black");
        saxophone2 = new Saxophone("tenor", "pink");
    }

    @Test
    public void hasType(){
        assertEquals("alto", saxophone1.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("black", saxophone1.getColour());
    }
}
