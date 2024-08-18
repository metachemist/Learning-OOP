package Chapter09;

class CircleClass {
    double radius = 1;
    CircleClass(){}
    CircleClass(double newRadius){ // yahan srf object baante hue radius jo hoga wou ayega;
        radius = newRadius;
    }
    double getArea(){
        return radius = radius*Math.PI;
    }
    double getPerimeter(){
        return radius*Math.PI;
    }
    double setRadius(double newRadius){
        return radius = newRadius;
    }
}
public class Circle{
    public static void main(String[] args){
    CircleClass CircleClass01 = new CircleClass(45.0);
    System.out.println(CircleClass01.getArea());
    System.out.println(CircleClass01.setRadius(25.0));
    System.out.println(CircleClass01.getPerimeter());

    }
}


