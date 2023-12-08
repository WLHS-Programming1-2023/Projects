import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ArrayFun {

    public static void main(String[] args) throws IOException {
        //use the UserInput method to get 10 integers from the user
        

    }

    public static int[] getData() throws IOException{

        int[] userNumbers = new int[10];
        BufferedReader binput = new BufferedReader(new InputStreamReader(System.in));
        String[] strNums;
        strNums = binput.readLine().split("\\s");
        for(int i=0; i<strNums.length; i++) {
            userNumbers[i] = Integer.parseInt(strNums[i]);
        }
        return userNumbers;
    }

}
