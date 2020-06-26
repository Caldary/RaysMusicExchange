package instrumentsTest;


import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums1;
    Drums drums2;

    @Before
    public void before(){
        drums1 = new Drums("membranophone","red", 3);
        drums2 = new Drums("membranophone", "gold", 2);
    }

    @Test
    public void hasType(){
        assertEquals("membranophone", drums1.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("gold", drums2.getColour());
    }

    @Test
    public void canPlayMusic(){
        assertEquals("Drum Sounds", drums1.playMusic());
    }

    @Test
    public void hasNumberOfPedals(){
        assertEquals(3, drums1.getNumberOfPedals());
    }

}
