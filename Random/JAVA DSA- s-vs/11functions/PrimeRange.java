public class PrimeRange {
    public static void main(String[] args) {
        PrimeRange(100);
        
    }
    public static void PrimeRange(int n){
        for(int i = 0 ;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i <=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
