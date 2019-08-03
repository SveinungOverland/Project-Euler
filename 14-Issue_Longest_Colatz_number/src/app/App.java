package app;

public class App {
    public static void main(String[] args) throws Exception {
        int startNum;
        int limNum = 100000;
        int terms = 0;
        int longestNum = 1;
        int longestTerm = 0;

        int[][] foundColNum = new int[limNum][2]; // [startNum, terms]
        for(int i = 0; i < foundColNum.length; i++){
            foundColNum[i][0] = -1; foundColNum[i][1] = -1;
        }


        for(int i = 1; i < limNum; i++){
            int num = i;
            startNum = i;
            terms = 0;
            System.out.println(i);
            while(num != 1){
                if(num < startNum && num > 0 && foundColNum[num][1] != -1){
                    terms = terms + foundColNum[num][1];
                    num = 1;
                    break;
                }
                else{
                    if(num%2 == 0){
                        num = num/2;
                    }
                    /*else if(num == 0){
                        num += 1;
                    }*/
                    else{
                        num = num*3 +1;
                    }
                }

                terms++;
            }
            if(num == 1){
                if(terms > longestTerm){
                    longestTerm = terms;
                    longestNum = startNum;
                    System.out.println("Longest term: " + longestTerm + ", start number: " + longestNum);
                }
                foundColNum[i][0] = startNum;
                foundColNum[i][1] = terms;
            }
        }
        
        System.out.println("Longest term: " + longestTerm + ", start number: " + longestNum);
    }
}