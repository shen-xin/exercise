package initializationandcleanup;

class Tester{
    String s;
    Tester(){
        System.out.println("Tester()");
    }
    void f(){
        System.out.println("f()");
    }
}
public class ConstructorTest {
    public static void main(String[] args) {
        Tester t = new Tester();
        System.out.println(t.s);
    }
}
