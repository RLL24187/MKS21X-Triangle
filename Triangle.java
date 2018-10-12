public class Triangle{
  //Instance variables
  private Point v1;
  private Point v2;
  private Point v3;
  //Constructor to make a triangle given points
  public Triangle(Point A, Point B, Point C){
    v1 = new Point(A.getX(), A.getY());
    v2 = new Point(B.getX(), B.getY());
    v3 = new Point(C.getX(), C.getY());
  }
  //Constructor to make a triangle given doubles
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }
  //Getting the perimeter of the Triangle
  public double getPerimeter(){
    return v1.distanceTo(v2) + v1.distanceTo(v3) + v2.distanceTo(v3);
  }
  //Getting vertex
  public Point getVertex(int index){
    if (index < 0 || index > 2){
      System.out.println("Please enter a number between 0 to 2 inclusive.");
      return null;
    }
    if (index == 0){
      return new Point(this.v1.getX(), this.v1.getY());
    }
    if (index == 1){
      return new Point(this.v2.getX(), this.v2.getY());
    }
    return new Point(this.v3.getX(), this.v3.getY());
  }
  public void setVertex(int idx, Point p){
    if (idx < 0 || idx > 2){
      System.out.println("Please enter a number between 0 to 2 inclusive.");
    }
    if (idx == 0){
      this.v1 = new Point(p.getX(), p.getY());
    }if (idx == 1){
      this.v2 = new Point(p.getX(), p.getY());
    }
    if (idx == 2){
      this.v3 = new Point(p.getX(), p.getY());
    }
  }
  //toString triangle
  public String toString(){
    return "Triangle: A" + this.v1 + ", B" + this.v2 + ", C" + this.v3;
  }
}
