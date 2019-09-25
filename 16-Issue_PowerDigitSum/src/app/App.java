package app;

import java.math.BigInteger;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        int result = 0;

        Date startDate = new Date();
	    Date endDate;
	    double time;
	    int rounds = 0;
	    do {
	    	result = powerDigitSum(2, 1000);
	    	endDate = new Date();
	    	rounds++;
	    }while(endDate.getTime()-startDate.getTime() < 1000);
		time = (double)(endDate.getTime()-startDate.getTime())/rounds;
        System.out.println("\nMilliseconds per round: " + time);
        System.out.println(result);
        

    }

    public static int powerDigitSum(int basicNum, int pow){
        int retVal = 0;
        BigInteger basicNumBI = new BigInteger(Integer.toString(basicNum));
        BigInteger num = basicNumBI.pow(pow);

        String[] s = num.toString().split("");

        for(int i = 0; i < s.length; i++){
            int a = Integer.parseInt(s[i]);
            retVal += a;
        }
        return retVal;
    }
}