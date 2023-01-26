import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class LinkedListTests {
    
    LinkedList l1;
    LinkedList result;

    @Before
    public void setUp() {
        l1 = new LinkedList();
        result = new LinkedList();
    }

    @Test
    public void testPrepend() {
        l1.prepend(1);
        assertEquals(l1.first(), 1);

        l1.prepend(2);
        assertEquals(l1.first(), 2);
    }

    @Test
    public void testAppend() {
        l1.append(1);
        l1.append(2);
        l1.append(3);

        result.prepend(3);
        result.prepend(2);
        result.prepend(1);

        assertEquals(l1.toString(), result.toString());
    }
}
