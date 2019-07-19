package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        int num1 = 999; int num2 = 999;
        int ans = 0;

        for(int i = 0; i < num1+1; i++){    //Går gjennom alle mulige kombinasjoner av produkter.
            for(int u = 0; u < num2+1; u++){
                int sumI = i*u;
                boolean accepted = true;

                String sumS = Integer.toString(sumI);
                String[] sumA = sumS.split("");

                if(sumA.length%2 == 0){  //Dersom partall
                    for(int y = 0; y < sumA.length/2; y++){
                        if(!sumA[y].equals( sumA[ (sumA.length-1) -y] )){ //Sjekker i a6 [2] mot tilsvarende [3]
                            accepted = false;
                            break;
                        }
                    }
                }
                else{   //Ellers oddetall/primtall
                    for(int y = 0; y < Math.floor(sumA.length/2); y++){
                        if(!sumA[y].equals(sumA[(sumA.length-2)-y])){     //Sjekker i a5 [1] mot tilsvarende [3]
                            accepted = false;
                            break;
                        }
                    }
                }
                if(accepted && sumI > ans){ //Sjekker om det aksepterte tallet er det største, erstatter i såfall.
                    ans = sumI;
                }
            }
        }

        System.out.println(ans);
    }
}