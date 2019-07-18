package app;

public class App {
    public static void main(String[] args) throws Exception {
        int ans = 0;
        double num = 600851475143D;
        Double limSearchD = Math.ceil(Math.sqrt(num));
        int limSearch = limSearchD.intValue();

        for(int i = limSearch; i > 0; i--){
            if(num%i == 0){ //Checks if it's a factorial of the number
                //Check if the factorial is a prime number
                boolean primeBool = true;
                for(int u = 2; u < i; u++){
                    if(i%u == 0){
                        primeBool = false;
                    }
                }
                if(primeBool){ //If the factorial is also a prime number, answer found.
                    ans = i;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}