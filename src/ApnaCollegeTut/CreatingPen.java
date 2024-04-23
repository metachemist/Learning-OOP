package ApnaCollegeTut;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Checking write method");
    }

}
public class CreatingPen {
    public static void main(String []args){
        Pen pen1 = new Pen();
        pen1.write();
    }
}
