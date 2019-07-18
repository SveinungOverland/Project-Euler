package app;

public class App {
    public static void main(String[] args) throws Exception {
        int lim = 1000; int ans = 0;
        for(int i = 0; i < lim; i++){
            if(i%3 == 0){ ans += i; }
            else if(i%5 == 0){ ans += i; }
        }
        System.out.println(ans);
    }
}