import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Manraj
 *  Class:          CS30S
 * 
 *  Assignment:     Employee Payroll
 * 
 *  Description:    calculate employee payroll
 * 
 *************************************************************/

public class ClientTemplateA {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        BufferedReader fin = new BufferedReader(new FileReader("EmployeeDecemberExamData.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
        
        EmployeeA employee1 = new EmployeeA(35, 12.50);               // employee1 data
        EmployeeA employee2 = new EmployeeA(40, 17.25);               // employee2 data
        EmployeeA employee3 = new EmployeeA(45, 12.50);               // employee3 data
        EmployeeA employee4 = new EmployeeA();                        // employee4 unknown
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Ax Qy" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    
      employee4.gethours();
      employee4.getwage();    
      employee4.setwage(25.00);
      employee4.sethours(40);
      employee4.getid();
      System.out.format("%4d%3d%2s%1.2f%s", employee4.getid(), employee4.gethours(), "$",employee4.getwage(), nl);
      
      System.out.println(employee1);            // printing out employee1 data using toString

    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate