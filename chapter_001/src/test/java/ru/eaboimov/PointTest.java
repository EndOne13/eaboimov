package ru.eaboimov;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class PointTest{
    @Test
    public void whenTestIs(){
       Point a = new Point(1,1);
	   Point b = new Point(5,1);
	   double result = a.distanceTo(b);
        assertThat(result, closeTo(4.0, 0.5));
    }
}

