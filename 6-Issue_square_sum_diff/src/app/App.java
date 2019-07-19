package app;

public class App {
    public static void main(String[] args) throws Exception {
        double ans = 0;
        int numLim = 100;
        double sumsqr = 0;
        double sqrsum = 0;
        for(int i = 1; i < numLim+1; i++){
            sumsqr += i*i;
            sqrsum += i;
        }
        sqrsum = Math.pow(sqrsum, 2);
        ans = sqrsum - sumsqr;
        
        System.out.println(ans);
    }
}