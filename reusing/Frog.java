package reusing;

public class Frog extends Amphibian{
    @Override
    protected void swim(){
        System.out.println("Frog swim");
    }
    @Override
    protected void eat(){
        System.out.println("Frog eat");
    }
    @Override
    protected void speak(){
        System.out.println("Frog speak");
    }
    static void grow(Amphibian a){
        System.out.println("Frog grow");
        a.eat();
    }

    public static void main(String[] args) {
        Frog f = new Frog();
        f.eat();
        f.speak();
        f.swim();
        f.grow(f);
        Amphibian.grow(f);
    }
}
