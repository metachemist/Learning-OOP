package Chapter09;
import java.util.*;

public class PracticeDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("The elapsed time since Jan 1, 1970 is " +date.getTime() + " millisecond" );
        System.out.println(date.toString());
    }
}