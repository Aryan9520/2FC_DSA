public class Lcmoftwonumber {
    public static int gcd(int dividend , int divisor) {
        while (divisor%dividend !=0) {
            int rem = divisor%dividend;
            divisor=dividend;
            dividend = rem;


        }
        return dividend;
    }
    public static int lcm(int dividend , int divisor) {

        int gcd=dividend;
        int lcm= (dividend*divisor)/gcd;
        return  lcm;



    }
}
