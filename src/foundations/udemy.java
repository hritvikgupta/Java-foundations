package foundations;

import javax.print.attribute.standard.JobPriority;
import javax.swing.*;
//Convert into the string to the following
//String.valueof() To convert int to string
// Integer.parseInt()
//Double.parseDouble()
// input string to char input.charAt(index value(1, 2, 3, 4)) ex:-  peter 0= p, 1 = e and so on
public class udemy {
    public static void main(String[] args) {
        String name;
        String surname;

        name = JOptionPane.showInputDialog("Enter Your name");
        int n = JOptionPane.showConfirmDialog(null, "Confirm your name as " + name);
        if(n == 0){
            JOptionPane.showMessageDialog(null, name);
        }
        System.exit(0); // Helps to exit program quickly while using the java.swing.* in your programs
        //if comparing strings such as name and surname you used name == surname it always turn out be false even if both are same
        // as name stores the string location of the name and not the name itself and therefore both the locations are not true
        // therefore in that case we use name.equals(surname) this returns the boolean value
        // name.compareTo(surname) return the integer value which is 0 if equal otherwise -1 if name<surname or alphabetical position and >1 vice versa

        //Switch case statement if you want to give mutliple arguments then use
        //switch(input) this is example showing if you want to give 2 cases at once so rather typing multiple times use this
        //case a:
        //case A:
        //     print(you entered a )

        // for each loop you need a loop control variable
        //DecimalFormat(pattern: #0.00) #if num then show it otherwise nothing, for 0 if number is there then print num otherwose 0
        //DecimalFormat variable = new DecimalForamt(pattern: #,##0.00) for thousands 2,000.00
        //and finally for any floating value at output print variable.format(float value variable)

    }
}
