package PastPaperSolution.Question02;

class partB {
    public static void main(String[] args){
        A a = new A("UBIT01");
        a.print();
    }
}
class A{
    String S = "UBIT"; //UBIT is wrong string should be written as "UBIT"
    A(String newS){
        S = newS;
    }
    A(){}
    public void print(){
        System.out.println(S);
    }
}

/*for this code there could be two possibilities
1. Add a non parametrize constructor in A class e.g A(){}
or
2. Input some string in line5 while making new object e.g A a = new A("UBIT01");
 */
