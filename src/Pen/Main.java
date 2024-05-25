package Pen;

public class Main {
    public static void main(String []args){
      Pen pen1 = new Pen();
      pen1.color = "blue";
      pen1.type = "gel";

      //pen1.write();

      Pen pen2 = new Pen();
      pen2.color = "black";
      pen2.type = "ballpoint";

      pen1.printColor();
      pen2.printColor();
    }
}
