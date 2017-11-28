package svc.miw.upm.es;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C12Test {
    @Before
    public void Before() {
        new C12();
    }

    @Test
    public void testMA() {
        assertEquals("mA", C12.mA());
    }

}
