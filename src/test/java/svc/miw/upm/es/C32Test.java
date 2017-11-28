package svc.miw.upm.es;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C32Test {
    @Before
    public void before() {
        new C32();
    }

    @Test
    public void testMA() {
        assertEquals("mA", C32.mA());
    }
}
