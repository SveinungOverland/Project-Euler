package app;

import java.math.BigInteger;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        int digits = 1000;
        int result;
        
        //Time test
        Date start = new Date();
		Date end;
		int rounds = 0;
		double time;
		do{
            result = indexOfFibWithXDigits(digits);
            end = new Date();
            rounds++;
		} while(end.getTime()-start.getTime() < 1000);
		time = (double)(end.getTime()-start.getTime())/rounds;
        System.out.println("Milliseconds per round: " + time);
        System.out.println("Result: " + result);

    }

    public static int indexOfFibWithXDigits(int x){
        BigInteger lastBI = new BigInteger("1");
        BigInteger last2BI = new BigInteger("1");
        BigInteger num;

        int index = 2; //Equals 2 because the first 2 Fibonacci numbers are already given.
        do{
            num = lastBI.add(last2BI);
            last2BI = lastBI;
            lastBI = num;
            index++;
        }while(num.toString().split("").length < x);
        return index;
    }
}