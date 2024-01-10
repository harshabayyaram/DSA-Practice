public class Factorial {

    public static int factorial(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }

    public static int binomailCoeffecient(int n, int r){
        int r_fact = factorial(r);
        int n_fact = factorial(n);
        int nr_fact = factorial(n-r);
        int binCoeff = n_fact / (r_fact*nr_fact);
        return binCoeff;
    }   

    public static void main(String[] args) {
        System.out.println(binomailCoeffecient(5,2));
    }

    
}
