package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        int ans = 1;
        boolean accepted = false;
        do{
            boolean passedTest = true;
            for(int i = 1; i < 20; i++){
                if(ans%i != 0){
                    passedTest = false;
                    break;
                }
            }
            if(passedTest){
                accepted = true;
            }
            else{
                ans++;
            }
        } while(!accepted);
        
        System.out.println(ans);
    }
}