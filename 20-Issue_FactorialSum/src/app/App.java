package app;

import java.math.BigInteger;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        int num = 100; //Test value

        int result;

        //Time test
        Date start = new Date();
		Date end;
		int rounds = 0;
		double time;
		do{
            result = BIDigitSum( factorial(num) );

            end = new Date();
            rounds++;
		} while(end.getTime()-start.getTime() < 1000);
		time = (double)(end.getTime()-start.getTime())/rounds;
        System.out.println("Milliseconds per round: " + time);
        System.out.println("Result: " + result);
        

    }

    /**
     * Takes a number n and factorializes it.
     * @param n number to be factorialized
     * @return factorial of n as a BigInteger object
     */
    public static BigInteger factorial(int n){
        if(n == 1){
            return new BigInteger(Integer.toString(n));
        }
        else{
            return new BigInteger(Integer.toString(n)).multiply(factorial(n-1));
        }
    }

    /**
     * Takes a BigInteger object and calculates the sum of it's digits.
     * @param bi a BigInteger object
     * @return the sum of the input's digits as an int.
     */
    public static int BIDigitSum(BigInteger bi){
        int retVal = 0;
        String[] s = bi.toString().split("");
        for(int i = 0; i < s.length; i++){
            retVal += Integer.parseInt(s[i]);
        }
        return retVal;
    }
}