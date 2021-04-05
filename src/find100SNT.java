public class find100SNT {
    public static void main(String[] args) {
        printNPrimes();

    }
    public static boolean isPrime(int n){
        if (n<=1)
            return false;
        else if (n<=3)
            return true;
        else {
            for (int i = 2;i<=Math.sqrt(n);i++){
                if (n%i==0) return false;
            }return true;
        }
    }

    public static void printNPrimes() {
        int i = 2;
        while (i<100){
            if(isPrime(i)){
                System.out.println(i);
            }i++;
        }
    }
}
