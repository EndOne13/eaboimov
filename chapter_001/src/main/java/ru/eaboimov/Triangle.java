package ru.eaboimov;

/**
* Class Triangle периметр треугольника.
* "author eaboimov
* @since 04.05.2017
*/


public class Triangle {
  private Point a;
  private Point b;
  private Point c;
  private double perimetr;
 
  public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
   public double distanceTo(Point distanceTo) {
	  this.distanceTo = distanceTo;
  }


  public double area() {
//calculate the triangle area  
    this.perimetr = a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
	if (a.distancetoTo(b) + b.distanceTo(c) < c.distanceTo(a)) {
	return result -1; 
  }
  else { 
  result Math.sqrt(perimetr * (perimetr - a.distanceTo(b)) * (perimetr - b.distanceTo(c)) * (perimetr - c.distanceTo(a)));
   }
   return result;
  }
}
