public class triangleDriver{
  public static void main(String[]args){
    //Test Variables: T1
    Point A1 = new Point(1, 2);
    Point B1 = new Point(1, 5);
    Point C1 = new Point(5, 5);
    //Test variables: T2
    Point A2 = new Point(0, 0);
    Point B2 = new Point(5, 0);
    Point C2 = new Point(5, 12);
    //Test variables: TA
    double xa1 = 4;
    double ya1 = 10;
    double xa2 = 13;
    double ya2 = 10;
    double xa3 = 13;
    double ya3 = 50;
    //Test variables: TB
    double xb1 = 7;
    double yb1 = -1;
    double xb2 = 8;
    double yb2 = 5;
    double xb3 = -10;
    double yb3 = 18;
    //Testing Point class getters
    System.out.println(A1.getX()); //Should get 1.0
    System.out.println(C2.getY()); //Should get 12.0
    System.out.println(B1.getX()); //Should get 1.0
    //Testing Point class distanceTo
    System.out.println(A1.distanceTo(C1)); //Should get 5.0
    System.out.println(B2.distanceTo(C2)); //Should get 12.0
    //Testing Point class distance
    System.out.println(Point.distance(A1, A2)); //Should get sqrt(5) or about 2.236
    System.out.println(Point.distance(B1, B2)); //Should get sqrt(41) or about 6.403
    //Making triangles using Triangle Point constructor
    Triangle T1 = new Triangle(A1, B1, C1);
    Triangle T2 = new Triangle(A2, B2, C2);
    //Making triangles using Triangle doubles constructor
    Triangle TA = new Triangle(xa1, ya1, xa2, ya2, xa3, ya3);
    Triangle TB = new Triangle(xb1, yb1, xb2, yb2, xb3, yb3);
    //Testing getPerimeter()
    System.out.println(T1.getPerimeter()); //Should get 12.0
    System.out.println(T2.getPerimeter()); //Should get 30.0
    System.out.println(TA.getPerimeter()); //Should get 90.0
    System.out.println(TB.getPerimeter()); //Should get about 53.781
    //Testing getVertex()
    //System.out.println(T1.getVertex(3)); //Should get (5, 5)
    //System.out.println(TB.getVertex(2)); //Should get (8, 5)
  }
}
