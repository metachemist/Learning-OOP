package Chapter09;
import java.util.Random;

public class PracticeRandom {
    public static void main(String[] args) {
        Random random = new Random(3);
        System.out.println("From random1: ");
        for(int i=0; i<10; i++)
            System.out.print(random.nextInt(1000) + " ");
        
        Random random2 = new Random(3);
        System.out.println(" \nFrom random2: ");
        for(int i=0; i<10; i++)
            System.out.print(random2.nextInt(1000) + " ");

    }
}
