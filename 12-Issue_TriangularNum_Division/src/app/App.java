package app;

public class App {
    public static void main(String[] args) throws Exception {
        int ans = 0;
        int currentTrisNumPos = 1;
        int currentTrisNum = 1;
        int targetNumDiv = 500;
        boolean numberFound = false;

        do{
            //System.out.println(currentTrisNum);
            int numDiv = 0;
            for(int i = 1; i < currentTrisNum; i++){
                if(currentTrisNum%i == 0){
                    numDiv++;
                }
            }

            if(numDiv == targetNumDiv){
                ans = currentTrisNum;
                numberFound = true;
            }
            else{
                currentTrisNumPos++;
                currentTrisNum = 0;
                for(int i = currentTrisNumPos; i > 0; i--){
                    currentTrisNum += i;
                }
                
            }   
        } while(!numberFound);
        
        System.out.println(ans);
    }
}