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
        drums1 = new Drums("membranophone","red");
        drums2 = new Drums("membranophone", "gold");
    }

    @Test
    public void hasType(){
        assertEquals("membranophone", drums1.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("gold", drums2.getColour());
    }
}
