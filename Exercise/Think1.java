package Exercise;

//class Aa{
//    private static long id = 0;
//    Aa(){
//        System.out.println("Aa() " + this);
//    }
//    public String toString(){
//        return "Aa " + id;
//    }
//}
//class Bb{
//    private static long counter  = 1;
//    private final long id = counter++;
//    Bb(){
//        System.out.println("Bb() " + this);
//    }
//    public String h(){
//        return "Hello " + id;
//    }
//}
public class Think1 {
    int i = 0;
    Think1 increment(){
        i++;
        return this;
    }
    Think1(){
        System.out.println(this);
    }
    void print(){
        System.out.println("i = " + i);
    }
    public String toString(){
        return "Think1() ";
    }
    public static void main(String[] args) {
//        Aa a = new Aa();
//        Bb b = new Bb();
        Think1 t = new Think1();
        t.increment().increment().increment().print();
    }
}
