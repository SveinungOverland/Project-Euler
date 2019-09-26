package app;

public class App {
    public static void main(String[] args) throws Exception {

        String[] s = {"1","2","3"};
        System.out.println( stringArrayToString(findNextPermutation(s, s.length)) );
        //System.out.println(findNthPermutation(s, 2));
    }

    public static String findNthPermutation(String[] nums, int lim){
        String[] lastNums = findNextPermutation(nums, nums.length);
        for(int i = 1; i < lim; i++){
            lastNums = findNextPermutation(lastNums, nums.length);
        }
        return stringArrayToString(lastNums);
    }

    public static String[] findNextPermutation(String[] lastPerm, int length){
        int num = Integer.parseInt(stringArrayToString(lastPerm));
        String[] numS = new String[length]; 
        do{
            num++;
            System.out.println(num);
            numS = Integer.toString(num).split("");
            
        }while(!checkPerm(numS, length));
        return numS;
    }

    public static boolean checkPerm(String[] s, int length){
        System.out.println("Length: " + length);
        boolean isPerm = true;
        int[] numberOfDigits = new int[length];
        for(int i = 0; i < numberOfDigits.length; i++){ numberOfDigits[i] = 0;}

        for(int i = 0; i < length; i++){
            System.out.println(s[i]);
            if(Integer.parseInt(s[i]) > length && Integer.parseInt(s[i]) < 0){
                isPerm = false;
                break;
            }
            else{
                //System.out.println(s[i]);
                numberOfDigits[Integer.parseInt(s[i])]++;
            }
        }
        for(int i = 0; i < numberOfDigits.length; i++){ 
            if(numberOfDigits[i] > 1){
                isPerm = false;
                break;
            }    
        }
        return isPerm;
    } 


    public static String stringArrayToString(String[] s){
        String sum = "";
        for(int i = 0; i < s.length; i ++){
            sum += s[i];
        }
        return sum;
    }


    /*
    public static String findNthPermutation(String[] nums, int lim){
        String[] lastNums = new String[nums.length];

        for(int i = 0; i < lim+1; i++){
            
            int lastNumInt = Integer.parseInt(stringArrayToString(lastNums));
            String[] curNums = new String[nums.length];
            for(int u = 1; u < nums.length; u++){
                if(lastNums[u+1] == lastNums[getLargestNumIndex(nums, u)]){
                    curNums = replaceIndexes(u, i2, array)
                }
            }
        }
    }

    public static String stringArrayToString(String[] s){
        String sum = "";
        for(int i = 0; i < s.length; i ++){
            sum += s[i];
        }
        return sum;
    }

    public static String[] replaceIndexes(int i1, int i2, String[] array){
        String temp1 = array[i1];
        array[i1] = array[i2];
        array[i2] = temp1;
        return array;
    }

    public static int getIndexOfNum(String num, String[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static int getLargestNumIndex(String[] nums, int startIndex){
        String largestNum = "0";
        int indexLargest = 0;
        for(int i = startIndex; i < nums.length; i++){
            if(Integer.parseInt(nums[i]) > Integer.parseInt(largestNum)){
                largestNum = nums[i];
                indexLargest = i;
            }
        }
        return indexLargest;
    }

    public static String[] sortPartOfArray(String[] nums, int startIndex){
        int[] numsInt = new int[nums.length - startIndex];
        for(int i = startIndex; i < nums.length; i++){
            numsInt[i] = Integer.parseInt(nums[i]);
        }
        bubbleSort(numsInt);
        for(int i = startIndex; i < numsInt.length; i++){
            nums[i+startIndex] = Integer.toString(numsInt[i]);
        }
        return nums;
    }


    //External support methods
    public static void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
    */
}