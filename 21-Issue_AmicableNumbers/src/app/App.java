package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        int sumAmicables;

        //Time test
        Date start = new Date();
		Date end;
		int rounds = 0;
		double time;
		do{
            sumAmicables = 0;

            for(int i = 0; i < 10000; i++){
                if(checkAmicability(i)){
                    sumAmicables += i;
                }
            }

            end = new Date();
            rounds++;
		} while(end.getTime()-start.getTime() < 1000);
		time = (double)(end.getTime()-start.getTime())/rounds;
        System.out.println("Milliseconds per round: " + time);
        System.out.println("Result: " + sumAmicables);

        
    }

    public static int sumProperDivisors(int num){
        int retVal = 0;

        if(num%2==0){
            for(int i = 1; i < num/2 +1; i++){
                if(num%i==0){
                    retVal += i;
                }
            }
        }
        else{
            for(int i = 1; i < Math.sqrt(num); i++){
                if(num%i==0){
                    retVal += i;
                }
            }
        }
        return retVal;
    }

    public static boolean checkAmicability(int a){
        boolean isAmicable = false;
        int b = sumProperDivisors(a);
        int db = sumProperDivisors(b);
        if(a == db && a != b){
            isAmicable = true;
        }
        return isAmicable;
        
    }
}