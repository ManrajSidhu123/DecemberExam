import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Manraj
 *  Class:          CS30S
 * 
 *  Assignment:     Employee Driver
 * 
 *  Description:    printing id number, hours worked, and hourly wage.
 *                  Using toString() and using getters and setters
 * 
 *************************************************************/

public class EmployeeDriverA {

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
    
        ProgramInfo PF = new ProgramInfo("Exam");           
        System.out.println(PF.getBanner());                 //printing banner using ProgramInfo

        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    
    // pinting using getters and setters
      employee4.gethours();             
      employee4.getwage();  
      employee4.getid();
      
      employee4.setwage(25.00);         
      employee4.sethours(40);
      
      System.out.format("%4d%3d%2s%1.2f%s", employee4.getid(), employee4.gethours(), "$",employee4.getwage(), nl);
      
      // printing using toString()
      System.out.println(employee1);            // printing out employee1 data using toString

    
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println(PF.getClosingMessage());             // printing closing message using ProgramInfo
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate