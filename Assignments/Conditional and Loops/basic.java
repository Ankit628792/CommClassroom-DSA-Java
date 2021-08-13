
import java.util.Scanner;

public class Basic{

    static void areaOfCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float num = sc.nextFloat();
        System.out.println("The area of circle is: "+ 3.14*num*num);
    }

    static void areaOfTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base and height of triangle: ");
        float b = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("The area of triangle is: "+ 0.5*b*h);
    }

    static void areaOfRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length and breadth of rectangle: ");
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("The area of rectangle is: "+ l*b);
    }

    static void areaOfIsosceles(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base and height of triangle: ");
        float b = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("The area of triangle is: "+ 0.5*b*h);
    }

    static void areaOfParallelogram(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base and height of parallelogram: ");
        float b = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("The area of parallelogram is: "+ b*h);
    }

    static void areaOfRohmbus(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diagonals of rohmbus: ");
        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        System.out.println("The area of rohmbus is: "+ 0.5*d1*d2);
    }

    static void areaOfEquilateral(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of equilateral triangle: ");
        float side = sc.nextFloat();
        System.out.println("The area of equilateral triangle is: "+ (1.73/4)*(side*side));
    }

    static void perimeterOfCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float r = sc.nextFloat();
        System.out.println("The perimeter of circle is: "+ (2*3.14*r));
    }

    static void perimeterOfEuilateralTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of equilateral triangle: ");
        float side = sc.nextFloat();
        System.out.println("The perimeter of equilateral triangle is: "+ (3*side));
    }

    static void perimeterOfParallelogram(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the adjescent sides of parallelogram: ");
        float s1 = sc.nextFloat();
        float s2 = sc.nextFloat();
        System.out.println("The perimeter of parallelogram is: "+ (2*s1 + 2*s2));
    }

    static void perimeterOfRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the adjescent sides of Rectangle: ");
        float s1 = sc.nextFloat();
        float s2 = sc.nextFloat();
        System.out.println("The perimeter of Rectangle is: "+ (2*s1 + 2*s2));
    }

    static void perimeterOfSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of Square: ");
        float s = sc.nextFloat();
        System.out.println("The perimeter of Square is: "+ (4*s));
    }

    static void perimeterOfRohmbus(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the adjescent sides of Rohmbus: ");
        float s1 = sc.nextFloat();
        float s2 = sc.nextFloat();
        System.out.println("The perimeter of Rohmbus is: "+ (2*s1 + 2*s2));
    }

    static void volumeOfCone(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height and radius of cone: ");
        float h = sc.nextFloat();
        float r = sc.nextFloat();
        System.out.println("The volume of cone is: "+ ((1/3)*3.14*r*r*h));
    }
    
    static void volumeOfPrism(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height and area of base of prism: ");
        float h = sc.nextFloat();
        float a = sc.nextFloat();
        System.out.println("The volume of prism is: "+ ((1/3)*h*a));
    }

    static void volumeOfCylinder(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height and radius of Cylinder: ");
        float h = sc.nextFloat();
        float r = sc.nextFloat();
        System.out.println("The volume of Cylinder is: "+ (2*3.14*r*r*h));
    }

    static void volumeOfSphere(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Sphere: ");
        float r = sc.nextFloat();
        System.out.println("The volume of Sphere is: "+ ((4/3)*3.14*r*r*r));
    }

    static void curvedSurfaceAreaOfCube(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of Cube: ");
        float side = sc.nextFloat();
        System.out.println("The curved surface area of Cube is: "+ (6*side*side));
    }

    static void totalSurfaceAreaOfCylinder(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height and radius of Cylinder: ");
        float h = sc.nextFloat();
        float r = sc.nextFloat();
        System.out.println("The curved surface area of Cylinder is: "+ (2*3.14*r*(h+r)));
    }

    static void fibonacci(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers you want to print in fibonacci: ");
        int num = sc.nextInt();
        System.out.println("The fibonacci series is:");
        int n1=0,n2=1,n3,i=2;
        System.out.print(n1+ " "+n2);
        while(i<=num){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            i++;
        }
    }

    // Subtract the Product and Sum of Digits of an Integer
    static void productAndSumDifference(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int r, product=1,sum=0;
        while(n != 0){
            r= n%10;
            product *= r;
            sum+=r;
            n/=10;
        }
        System.out.println("The difference between product and sum is:" + (product - sum));
    }
    
    public static void main(String args[]){
        // Enter the name of program you want to run
    }
}