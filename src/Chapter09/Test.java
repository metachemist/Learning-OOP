package Chapter09;



class Student {
    String name;
    int age;
    boolean isScienceMajor;
    char gender;
}

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println("name? " + st1.name);
        System.out.println("age? "+ st1.age);
        System.out.println("isSciencemajor? " + st1.isScienceMajor);
        System.out.println("gender? "+ st1.gender);
        

    }
}
