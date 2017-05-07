/**
* Package for calculate task.
* @author Evgenyi Aboimov (mailto:tuz1k@mail.ru)
* @since 22.04.2017
*/
package ru.eaboimov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Test.
*Class CalculateTest
*/
public class CalculateTest {
	/**
	*Test add.
	*/
	@Test
	public void whenSetStopInEchoThenReturnThreeStops() {
		Calculate calc = new Calculate();
		String result = calc.echo("stop");
		assertThat(result, is("stop stop stop"));
	}
	/**
	*Test add.
	*/
		@Test
	public void whenSetNullInEchoThenReturnTwoSpaces() {
		Calculate calc = new Calculate();
		String result = calc.echo("null");
		assertThat(result, is("null null null"));
	}
}
