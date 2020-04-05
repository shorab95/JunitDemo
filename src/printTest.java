import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class printTest {
    @Test
    public void testprint()
    {

        printMsg p = new printMsg();
        String s= p.printMessage();
        assertEquals("Hello World",s);
    }
}
