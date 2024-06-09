package Chapter09;
import java.util.Random;

public class PracticeRandom {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("From random1: ");
        for(int i=0; i<10; i++)
            System.out.println(random.nextInt(1000) + " ");
        
        Random random2 = new Random();
        System.out.println("From random2: ");
        for(int i=0; i<10; i++)
            System.out.println(random2.nextInt(1000) + " ");


    }
}
