package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        int lim = 2000000;
        double sumPrimes = 2;

        for(int i = 3; i < lim; i+=2){
            boolean isPrime = true;
            for(int u = 3; u < i; u+=2){
                if(i%u == 0){
                    isPrime = false;
                    break;
                }
            }
            
            
            if(isPrime){
                sumPrimes += i;
            }
        }
        System.out.println(sumPrimes);
    }
}