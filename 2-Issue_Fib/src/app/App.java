package app;

public class App {
    public static void main(String[] args) throws Exception {
        int lim = 4000000; int currenVal = 1; int lastVal = 0; int ans = 0;
        do{
            int tempLastVal = lastVal;
            lastVal = currenVal;
            currenVal = currenVal + tempLastVal;
            if(currenVal%2 == 0){ ans += currenVal; }
        } while(currenVal < lim);
        System.out.println(ans);

    }
}