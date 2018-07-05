package reusing;

public class Amphibian {
    protected void swim(){
        System.out.println("Amphibian swim");
    }
    protected void speak(){
        System.out.println("Amphibian speak");
    }
    protected void eat(){
        System.out.println("Amphibian eat");
    }
    static void grow(Amphibian a){
        System.out.println("Amphibian grow");
        a.eat();
    }
}
