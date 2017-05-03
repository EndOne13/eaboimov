package ru.eaboimov.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
	@Test
	public void TwoMoreOneThenTwo() {
	Max m = new Max();
	assertThat(m.max(2, 1), is(2));
}
}

