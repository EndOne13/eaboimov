package ru.eaboimov.triangle;

/**
* Class Triangle �������� ������������.
* "author eaboimov
* @since 04.05.2017
*/


public class Triangle {
   
	/**
    *����� a.
	*/
  private Point a;
  /**
  * ����� b.
  */
  private Point b;
  /**
  * ����� c.
  */
  private Point c;
  /**
  * ��������.
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
	 * ����� area.
	 * @return
	 * ���������� ���������.
	 */
	 
  public double area() {
//calculate the triangle area  
    this.perimetr = a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
	return area = Math.sqrt(perimetr * (perimetr - a.distanceTo(b)) * (perimetr - b.distanceTo(c)) * (perimetr - c.distanceTo(a)));
	return 0;
  }
}

