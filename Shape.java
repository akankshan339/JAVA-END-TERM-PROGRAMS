//Method Overloading Overload Area method for diff shapes to find there area
//Method overloading in Java is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding.
import java.util.*;
public class Shape {

    public double area(double a, double b, double c)
    {
        double s = (a+b+c) /2;
       return Math.sqrt(s * (s-a) *(s-b)* (s-c));          //sqrt takes double val

    }
    public float area(float len , float width)
    {
        return len * width;
    }
    public double area(double rad)
    {
        return 3.14 * rad *rad ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape ob = new Shape();
        double s1, s2, s3, rad;
        float len, width;
        System.out.print("Enter the sides of scalene triangle :");
        s1 = sc.nextDouble();
        s2 = sc.nextDouble();
        s3 = sc.nextDouble();
        System.out.print("Enter the length and width of Recatangel");
        len = sc.nextFloat();
        width = sc.nextFloat();
        System.out.print("Enter the radius of circle :");
        rad = sc.nextDouble();
        double areaTriangle = ob.area(s1, s2, s3);
        System.out.println("Area of Triangle :" + areaTriangle);
        float areaRect = ob.area(len, width);
        System.out.println("Area of Reactangle :" +areaRect);
        double areaCirc = ob.area(rad);
        System.out.println("Area of Circle :" +areaCirc);
        sc.close();
    }
}
