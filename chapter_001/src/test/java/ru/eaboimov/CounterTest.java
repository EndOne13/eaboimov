package ru.eaboimov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
Сумма четных цифр.
*/
public class CounterTest {
	/**
	Test add.
	*/
	@Test
	public void whenSumEvenNumbersFromOneToTenThenThirty() {
		Counter coun = new Counter();
		assertThat(coun.add(1, 10), is(30));
	}
}

