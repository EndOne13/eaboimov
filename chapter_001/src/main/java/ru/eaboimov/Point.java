package ru.eaboimov;
 
public class Point {
   private int x;
   private int y;
 
   public Point(int x, int y) {
     this.x = x;
     this.y = y;
  }
  
  public int getX(){
     return this.x;
  }
 
  public int getY(){
     return this.y;
  }
  public double distanceTo(Point point){
	   return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
  }
  public boolean is(int a, int b) {
	  return  y == a * x + b;
  }        
}
