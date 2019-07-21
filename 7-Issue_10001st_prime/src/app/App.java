package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        long[] primes = new long[10001];
        int primesFound = 0;
        long currentNum = 2;
        do{
            boolean isPrime = true;
            for(int i = 2; i < currentNum-1; i++){
                if(currentNum%i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primes[primesFound] = currentNum;
                primesFound++;
            }
            currentNum++;
        } while(primesFound < primes.length);
        
        System.out.println(primes[10000]);
        System.out.println(primes[0]);
        System.out.println(primes[1]);
        System.out.println(primes[2]);
        System.out.println(primes[3]);
    }
}