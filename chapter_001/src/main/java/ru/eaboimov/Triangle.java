package ru.eaboimov;

/**
* Периметр треугольника.
* @author eaboimov
* @since 04.05.2017
*/
public class Triangle {
	/**
	 * field a.
	 */
	private double a;
	/**
	 * field b.
	 */
	private double b;
	/**
	 * field c.
	 */
	private double c;
	/**
	 * field perimetr.
	 */
	private double perimetr;
	 /**
	 * method Triangle.
	 * @param a first param
	 * @param b second param
	 * @param c third param
	 */
	public Triangle(int a, int b, int c) {
	this.a = a;
	this.b = b;
	this.c = c;
	}
	/**
	 * method area.
	 * @return triangle.
	 */
	public double area() {
	//calculate the triangle area
	this.perimetr = this.a + this.b + this.c;
	if (this.a + this.b > this.c) {
		return Math.sqrt(perimetr * (perimetr - this.a) * (perimetr - this.b) * (perimetr - this.c));
	} else	{
		return 0;
	}
	}
}