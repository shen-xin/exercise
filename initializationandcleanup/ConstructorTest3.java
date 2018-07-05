package initializationandcleanup;

class Default{
    Default(){
        System.out.println("Default()");
    }
    Default(String s){
        System.out.println(s);
    }
}
public class ConstructorTest3 {
    public static void main(String[] args) {
        Default t = new Default();
        Default s = new Default("good Bye");
    }
}
