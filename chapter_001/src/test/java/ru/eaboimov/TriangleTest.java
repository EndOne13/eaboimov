package ru.eaboimov;

import org.junit.Test;

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
public void whenAreaSetThreePointsThenTriangleArea() {
	This.a a = new This.a(0, 0);
    This.b b = new This.b(0, 2);
    This.c c = new This.c(2, 0);
Triangle tr = new Triangle(a, b, c);
double result = tr.area();
double expected = 2D;
assertThat(result, closeTo(expected, 0.1));
}
}