import org.junit.Test;

import static org.junit.Assert.*;

public class MakeTextTest {

    @Test
    public void send() {
        String expected = "Message sent";
        String actual = MakeText.send("This is a test");
        assertEquals(expected,actual);
    }
}