package initializationandcleanup;

class Dog{
    void bark(){
        System.out.println("quiet");
    }
    void bark(int i){
        System.out.println("barking");
    }
    void bark(float f){
        System.out.println("howling");
    }
    void bark(double d){
        System.out.println("dodo");
    }
    void bark(byte b){
        System.out.println("ang");
    }
    void bark(short s){
        System.out.println("wuu");
    }
    void bark(String s){
        System.out.println("emmmmmm");
    }
}
public class ConstructorTest5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.bark();
    }
}
