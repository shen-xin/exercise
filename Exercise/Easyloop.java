package Exercise;

public class Easyloop {
    public static void main(String[] args) {
        final double STARTRTE = 10;
        final  int NRATES = 6;
        final int NYATES = 10;
        double[] interestRate = new double[NRATES];
        for (int i = 0; i < interestRate.length; i++) {
            interestRate[i] = (STARTRTE + i) / 100; //set interest rates to 10 . . 15%
        }
        double [][] balances = new double[NYATES][NRATES];
        for (int i = 0; i < balances[0].length; i++) {
            balances[0][i] = 10000; //set initial number
        }
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                double oldBalance = balances[i - 1][j]; //  double oldbalance = 100000;
                double interest = oldBalance * interestRate[j];
                balances[i][j] = oldBalance + interest;
            }
        }
        for (int i = 0; i < interestRate.length; i++) {
            System.out.printf("%9.0f%%", 100*interestRate[i]);
        }
        System.out.println();
        for (double [] row:balances
                ) {
            for (double a: row
                    ) {
                System.out.printf("%10.2f",a);
            }
            System.out.println();
        }
    }
}
