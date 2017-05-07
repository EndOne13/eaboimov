package ru.eaboimov;

/**
 *Class Point.
 *@author aboimov
 *@since 07.05.2017
*/
public class Point {
	/**
	field x.
	*/
   private int x;
   /**
   field y.
   */
   private int y;
   /**
   Method Point.
   @param x x
   @param y y
   */
   public Point(int x, int y) {
     this.x = x;
     this.y = y;
  }
  /**
  Method int.
  @return this.x
  */
   public int getX() {
     return this.x;
  }
  /**
  Method int.
  @return this.y
  */
  public int getY() {
     return this.y;
  }
  /**
  Method distanceTo.
  @param point point
  @return Math.sqrt
  */
  public double distanceTo(Point point) {
	   return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
  }
  /**
  Method boolean.
  @param a a
  @param b b
  @return y
  */
  public boolean is(int a, int b) {
	return y == a * x + b;
}
}
