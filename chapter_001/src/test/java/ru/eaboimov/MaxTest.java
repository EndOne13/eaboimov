package ru.eaboimov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
Max 2 more 1.
*/
public class MaxTest {
	/**
	Test add.
	*/
	@Test
	public void whenTwoMoreOneThenTwo() {
	Max m = new Max();
	assertThat(m.max(2, 1), is(2));
}
}

