package initialization;

public class Bills {
    public enum bills{
        ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
    }

    public static void main(String[] args) {
        for (bills b:
             bills.values()) {
            System.out.println(b + " ,ordinal " + b.ordinal());
        }
    }
}
