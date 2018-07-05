package initialization;




public class Burrito {
    spiciness degree;
    public Burrito(spiciness degree){
        this.degree = degree;
    }
    public void describe(){
        System.out.print("This burrito is ");
        switch (degree){
            case NOT:
                System.out.println("not spicy all.");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot.");
                break;
            case HOT:
            case FLAMING:
                default:
                    System.out.println("maybe too hot.");
        }
    }

    public static void main(String[] args) {
        Burrito
                plain = new Burrito(spiciness.NOT),
                greenChile = new Burrito(spiciness.MEDIUM),
                jalapeno = new Burrito(spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
