package ru.eaboimov.condition;
 
public class Point {
   private int x;
   private int y;
 
   public  Point(int x, int y) {
     this.x = x;
     this.y = y;
  }
  
  public int getX() {
     return this.x;
  }
 
  public int getY() {
     return this.y;
  }
  public double distanceTo(Point that) {
	  return -1D;
  }
     
  
  public boolean is(int a, int b){
     return y == a * x + b;
	 
  }
}
