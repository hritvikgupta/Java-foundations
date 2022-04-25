package foundations;

import java.io.IOException;
import java.io.PrintWriter;

public class writingfiles {
    public static void main(String[] args) throws IOException
    {
        //Create the file and open the file
        //if file doesen't exist then replace the one that exist previously
        PrintWriter outputfile = new PrintWriter("output.txt");
         outputfile.println("This is line 1");
         outputfile.println("This is line 2");
         outputfile.println("This is line 3");

         outputfile.close();


    }

}
