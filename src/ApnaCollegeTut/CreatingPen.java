package ApnaCollegeTut;

class Pen{
    String color;
    String type;

    public void getColor() {
        System.out.println(this.color);
    }

    public void getType() {
        System.out.println(this.type);
    }
}
public class CreatingPen {
    public static void main(String []args){
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Fountain";
        pen1.getType();
        pen1.getColor();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Gel";
        pen2.getColor();
        pen2.getType();
    }
}
