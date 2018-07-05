package reusing;

class SmallBrain{}
final class Dinosaur{
    int i = 7;
    int j  = 47;
    SmallBrain x = new SmallBrain();
    void f(){
        System.out.println("f()");
    }
}
//public class Jurassic extends Dinosaur{} error: cannot inherit from final Dinosaur
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur d = new Dinosaur();
        d.i = 40;
        d.f();
    }
}
