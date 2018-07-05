package initialization;

public class Wallet {
    Bills.bills b;
    public static void main(String[] args) {
        for (Bills.bills b :
                Bills.bills.values()) {
            System.out.print
                    (b+" Worth: ");
            switch (b){
                case ONE:
                    System.out.println("$1");break;
                case FIVE:
                    System.out.println("$5");break;
                case TEN:
                    System.out.println("$10");break;
                case TWENTY:
                    System.out.println("$20");break;
                case FIFTY:
                    System.out.println("$50");break;
                case HUNDRED:
                    System.out.println("$100");break;
                    default: break;
            }
        }
    }
}
