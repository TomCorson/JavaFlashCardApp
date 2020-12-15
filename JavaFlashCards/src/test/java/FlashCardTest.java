import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlashCardTest {
    private  FlashCard fc;
    @Before
    public void init(){
        fc = new FlashCard();
    }
    @Test
    public void setFact() {
        fc.setFact("This is a fact");
        String expected = "This is a fact";
        String actual = fc.getFact();
        assertEquals(expected,actual);
    }

    @Test
    public void getFact() {
        fc.setFact("This is a diffrent fact");
        String expected = "This is a diffrent fact";
        String actual = fc.getFact();
        assertEquals(expected,actual);
    }

    @Test
    public void getId() {
        fc.setId(3);
        int expected = 3;
        int actual = fc.getId();
        assertEquals(expected,actual);
    }

    @Test
    public void setId() {
        fc.setId(6);
        int expected = 6;
        int actual = fc.getId();
        assertEquals(expected,actual);
    }
}