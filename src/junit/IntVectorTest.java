package junit;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotSame;

public class IntVectorTest {

    @Test
    public void testGetCopy () {
        IntVector v = new IntVector(4,8,15,16,23,42);
        IntVector v2 = v.getCopy();

        assertNotSame(v.list,v2.list);
    }

    @Test
    public void testGetCopy2() {
        IntVector v = new IntVector(4,8,15,16,23);
        IntVector v2 = v.getCopy();
        v.add(42);

        assertNotSame(v.list,v2.list);
    }

}
