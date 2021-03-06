package svc.miw.upm.es;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C31Test {
    @Before
    public void before() {
        new C31();
    }

    @Test
    public void testM1() {
        assertEquals("m1", C31.m1());
    }

    @Test
    public void testM2() {
        assertEquals("m2", C31.m2());
    }
    @Test
    public void testMB() {
        assertEquals("mB", C31.mB());
    }

}
