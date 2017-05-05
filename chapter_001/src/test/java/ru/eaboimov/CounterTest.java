package ru.eaboimov.counter;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
	@Test
	public void whenSumEvenNumbersFromOneToTenThenThirty(){
		Counter coun = new Counter();
		assertThat(coun.add(1, 10), is(30));
	}
}

