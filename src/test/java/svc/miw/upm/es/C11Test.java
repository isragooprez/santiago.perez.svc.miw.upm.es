package svc.miw.upm.es;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C11Test {

    @Before
    public void before() {
        new C11();
    }

    @Test
    public void testM1() {
        assertEquals("m1", C11.m1());
    }

    @Test
    public void testM2() {
        assertEquals("m2", C11.m2());
    }

}
