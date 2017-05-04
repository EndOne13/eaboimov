package ru.eaboimov.triangle;

/**
* Class Triangle периметр треугольника.
* "author eaboimov
* @since 04.05.2017
*/


public class Triangle {
   
	/**
    *Точка a.
	*/
  private Point a;
  /**
  * Точка b.
  */
  private Point b;
  /**
  * Точка c.
  */
  private Point c;
  /**
  * Периметр.
  */
  private double perimetr;
 
  /**
	 * method Triangle.
	 * @param a.
	 * @param b.
	 * @param c.
	 */
  public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  
 /**
	 * Метод area.
	 * @return
	 * вычисления периметра.
	 */
	 
  public double area() {
//calculate the triangle area  
    this.perimetr = a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
	return area = Math.sqrt(perimetr * (perimetr - a.distanceTo(b)) * (perimetr - b.distanceTo(c)) * (perimetr - c.distanceTo(a)));
	return 0;
  }
}

