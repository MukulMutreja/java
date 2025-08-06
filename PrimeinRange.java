public class PrimeinRange {
    public static boolean prime(int n ) {
        if(n==2) {
            return true ;
        }
        for ( int i = 2 ; i<=Math.sqrt(n) ; i++ ) {
            if(n%i==0) {
                return false;
            }
        }
    return true ;
    }
    public static void primeInrange(int n ) {
        for ( int j = 2 ; j<= n ; j++) {
            if(prime(j) == true ) {
                System.out.println(j);
            }
        }
            }
    public static void main(String[] args) {
        primeInrange(10);
    }
}