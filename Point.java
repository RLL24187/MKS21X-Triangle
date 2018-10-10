public class Point{
  //Instance variables
  private double x;
  private double y;
  //Constructor for making a point
  public Point(double xcor, double ycor){
    x = xcor;
    y = ycor;
  }
  //Constructor that returns a copy of the point in params
  public Point(Point p){
    x = p.x;
    y = p.y;
  }
  //Method that returns a new copy of 'this'
  public Point copy(){
    return new Point(x,y); //this.x and this.y
  }
  //Get variables
  public double getX(){
    return this.x;
  }
  public double getY(){
    return this.y;
  }
  //toString
  public String toString(){
    return "(" + this.getX() + "," + this.getY() + ")";
  }
  //Distance to a point given a point
  public double distanceTo(Point p){
    double changeX = this.x - p.x;
    double changeY = this.y - p.y;
    return Math.sqrt((changeX * changeX) + (changeY * changeY));
  }
  //Distance between two points given in params
  public static double distance(Point A, Point B){
    double changeX = A.x - B.x;
    double changeY = A.y - B.y;
    return Math.sqrt((changeX * changeX) + (changeY * changeY));
  }
}
