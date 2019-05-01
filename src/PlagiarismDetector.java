import java.io.*;
import java.util.*;

public class PlagiarismDetector {
    public static void main(String args[]){
    	 try {
             System.out.print("Enter the file name with extension : ");

             

             //System.out.println("Attempting to read from file in: "+file.getCanonicalPath());

             Scanner input = new Scanner(System.in);

             File file = new File(input.nextLine());
             input = new Scanner(file);


             while (input.hasNextLine()) {
                 String line = input.nextLine();
                 System.out.println(line);
             }
             input.close();

         } catch (Exception ex) {
             ex.printStackTrace();
         }
    	 LeastCommonSubSequence LCSS = new LeastCommonSubSequence("Gautam", "Gutman") ;
    	 System.out.println(LCSS.getSequenceLength()) ;
        System.out.println(LCSS.getSequence()) ;
        new KMP("AABAACAADAABAABA", "AABA") ;
        new KMP("Gautam", "ut") ;
        new NaiveSearch("AABAACAADAABAABA", "AABA") ;

    }
    
    
}
