public class gcdtwonumber {
    public static int gcd(int dividend , int divisor) {
        while (divisor%dividend !=0) {
            int rem=divisor%dividend;
            divisor=dividend;
            dividend=rem;


        }
        return dividend;
    }
}
