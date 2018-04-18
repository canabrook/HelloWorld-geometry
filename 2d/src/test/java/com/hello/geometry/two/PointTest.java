package com.hello.geometry.two;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void canConstruct() {
        Point p = new Point(5.0, 6.1);
        assertEquals(5.0, p.getX(), 0.0001);
    }
}
