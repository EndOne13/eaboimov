package ru.eaboimov.point;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Point pointA = new Point (1, 1) ;
        Point pointB = new Point (2, 1) ;
        double result = pointA.distanceTo(pointB);
        double expected = 10D;
        assertThat(result, is(expected));
    }
	 @Test
    public void whenTestIs() {
        Point pointA = new Point (1, 1) ;
        boolean result = pointA.is(2, 3);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}

