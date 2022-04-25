package foundations;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class readingfiles {
    public static void main(String[] args) throws IOException
    {
        File file = new File("output.txt");
        if(file.exists())
        {
            Scanner scanner = new Scanner(file);//instead system.in we have used the file to point the scanner to the file
            while(scanner.hasNext())//hasNext() checks that if you reached to the end of file or not
            {
                System.out.println(scanner.nextLine());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"The File Doesnot Exists");
        }
    }
}
