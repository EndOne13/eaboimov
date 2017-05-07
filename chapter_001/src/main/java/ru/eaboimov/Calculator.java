package ru.eaboimov.calculator;
/**
Калькулятор.
*/
public class Calculator {
	/**
	Поле result.
	*/
	private double result;
	/**
	@param add
	@param first argument
	@param second argument
	*/
	public void add(double first, double second) {
	   this.result = first + second;
	}
	/**
	@param substruct
	@param first argument
	@param second argument
	*/
	public void substruct(double first, double second) {
		this.result = first - second;
	}
	/**
	@param div
	@param first argument
	@param second argument
	*/
	public void div(double first, double second) {
		this.result = first / second;
	}
	/**
	@param multiple
	@param first argument
	@param second argument
	*/
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	/**
	@return result
	*/
	public double getResult() {
	   return this.result;
	}
}
