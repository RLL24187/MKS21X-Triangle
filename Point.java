public class Point{
  //Instance variables
  private double x;
  private double y;
  //Constructor for making a point
  public Point(double xcor, double ycor){
    x = xcor;
    y = ycor;
  }
  //Get variables
  public double getX(){
    return this.x;
  }
  public double getY(){
    return this.y;
  }
  //Distance to a point given a point
  public double distanceTo(Point p){
    double changeX = this.x - p.x;
    double changeY = this.y - p.y;
    return Math.sqrt((changeX * changeX) + (changeY * changeY));
  }
  //Distance between two points given in params
  public double distance(Point A, Point B){
    double changeX = A.x - B.x;
    double changeY = A.y - B.y;
    return Math.sqrt((changeX * changeX) + (changeY * changeY));
  }
}
