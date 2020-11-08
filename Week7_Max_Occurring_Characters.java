import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

    /*
     * Complete the 'maximumOccurringCharacter' function below.
     *
     * The function is expected to return a CHARACTER.
     * The function accepts STRING text as parameter.
     */

class Result {
    
//-------ASCII character are 256 so starting off our Hash array size = 256------

    static final int character_size = 256;
    
    public static char maximumOccurringCharacter(String text) {
    
//------------Make array to count characters & initialize array = 0------------
        
        int count[] = new int[character_size];
        
//--------------------Character count Array - input string---------------------

        int characterLength = text.length();
        
        for(int i = 0; i < characterLength; i++){
            count[text.charAt(i)]++;
            
        } 
//---------------------------Initialize max count------------------------------
        
        int max = -1; 
        
//---------------------------Initialize results--------------------------------

        char result = ' ';
    
//---------Moving throught the string & keeping the count of each character----

        for (int i = 0; i < characterLength; i++){
            
            if (max < count[text.charAt(i)]){
                
                max = count[text.charAt(i)];
                
                result = text.charAt(i);
            }    
        }
        return result;
    }

//-------------------------------------MAIN------------------------------------    

 //   public static void main(String[] strings){
        
   //     String text = "helloworld";
    //    System.out.println("Max Occuring Character = " + maximumOccurringCharacter(text));
        
   // }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String text = bufferedReader.readLine();

        char result = Result.maximumOccurringCharacter(text);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
