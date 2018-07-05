package Succinct;

public class Max {
    public static double max(double... value){
        double largest = Double.NEGATIVE_INFINITY;
        for (double v: value)
            if(v > largest)
                largest = v;
            return largest;
    }
}
