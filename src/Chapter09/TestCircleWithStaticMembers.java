package Chapter09;

class CircleWithStaticMembers{
    double radius; 
    final static double PI = Math.PI;
    /* The number of objects created */
    static int numberOfObjects = 0;

    /* Construct a circle with radius 1 */
    CircleWithStaticMembers(){
        radius = 1;
        numberOfObjects++;
    }
    
    CircleWithStaticMembers(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    double getArea(){
        return radius * radius * PI;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }
}


public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating object......");
        System.out.println("The number of objects created " + CircleWithStaticMembers.getNumberOfObjects());

        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        System.out.println("radius of c1 " + c1.radius + " and number of circle objects are " + CircleWithStaticMembers.getNumberOfObjects());

        c1.radius = 9;
        
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(12);
        System.out.println("radius of c2 " + c2.radius + " and number of circle objects are " + CircleWithStaticMembers.getNumberOfObjects());

    }
    
}

