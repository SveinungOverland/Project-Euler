package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        double ans = 0;
        int lim = 1000;

        for(int a = 0; a < lim; a++){
            for(int b = 0; b < lim; b++){
                for(int c = 0; c < lim; c++){
                    if(a+b+c == 1000){
                        if(a < b && b < c && a < c){
                            if( (Math.pow(a, 2) + Math.pow(b, 2) ) == Math.pow(c, 2)){
                                ans = a*b*c;
                                break;
                            }
                        }
                    }
                }
            }
        }
        
        
        System.out.println(ans);
    }
}