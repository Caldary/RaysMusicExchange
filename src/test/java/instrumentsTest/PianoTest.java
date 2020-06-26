package instrumentsTest;

import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano1;
    Piano piano2;

    @Before
    public void before(){
        piano1 = new Piano("grand", "black");
        piano2 = new Piano("electric", "white");
    }

    @Test
    public void hasType(){
        assertEquals("electric", piano2.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("white", piano2.getColour());
    }
}
