package ru.eaboimov;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest{
	/**
	@Test
	@factorial 5!=120
	*/
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
		Factorial fac = new Factorial();
		assertThat (fac.calc(5), is(120));
    }
    /**
	@Test
	@factorial 0!=1s
	*/
    @Test
    public void whenCalculateFactorialForZeroThenOne() {       
		Factorial fac = new Factorial();
		assertThat (fac.calc(0), is(1));
    }
}