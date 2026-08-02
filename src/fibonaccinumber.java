public class fibonaccinumber {
        public int f(int n) {
            if(n==0)
                return0;
            if(n==1)
                return1;
            return (f(n-1)+f(n-2));
        }
    }
}
