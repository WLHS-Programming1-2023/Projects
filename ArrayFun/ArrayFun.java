import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ArrayFun {

    public static void main(String[] args) throws IOException {
        //use the getData method to get 10 integers from the user
    
    }

    /**
     * Gets space delimited integers from the user in the console. Exceptions will
     * be thrown if the data is not an integer. If Return is pressed before n integers
     * are entered, the remaining integers will be 0.
     * 
     * @param n - number of integers
     * @return userNumbers - an n sized array composed of the user's input
     * @throws IOException
     */
    public static int[] getData(int n) throws IOException{

        int[] userNumbers = new int[n];
        BufferedReader binput = new BufferedReader(new InputStreamReader(System.in));
        String[] strNums;
        strNums = binput.readLine().split("\\s"); //space delimited
        for(int i=0; i<strNums.length; i++) {
            userNumbers[i] = Integer.parseInt(strNums[i]);
        }
        return userNumbers;
    }

    //Your methods go here
    
}
