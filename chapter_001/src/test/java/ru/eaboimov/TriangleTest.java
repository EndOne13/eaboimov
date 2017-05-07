package ru.eaboimov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
* Test 04.05.2017.
*/

public class TriangleTest {
	
/**
* Вычисления треугольника.
*/
@Test
public void whenPerimetr() {
	Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 1), new Point(2, 2));
	double result = triangle.area();
	final double area = 0;
	
	assertThat(result, is(area));
  }
}

