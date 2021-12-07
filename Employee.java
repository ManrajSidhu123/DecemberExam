import java.util.Scanner;
/********************************************************************
 * Programmer:	Manraj
 * Class:  CS30S
 *
 * Assignment: AxQy
 *
 * Description: brief description of class
 ***********************************************************************/

// import libraries as needed here

public class Employee {
    //*** Class Variables ***
    
    private static int nextID = 1000;       // unique id for employee
    
    //*** Instance Variables ***
    
    private int hours;                      // number of hours worked
    private double wage;                    // hourly wage
    private int id;                         // id for employee
    
    //*** Constructors ***
    
    public Employee(){
      id = nextID++;                // sets unique id for employee
      
      hours = 0;
      wage = 0.0;
    }// end constructor

    public Employee (int hours, double wage) {
      hours = this.hours;
      wage = this.wage;
    }// end constructor
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    
    //*** Getters ***
    
    public int gethours() {
      return hours;
    }// end gethours

    public double getwage() {
      return wage;
    }// end getwage
    
    public int getid() {
      return id;
    }// end getid
    
    //*** Setters ***
    
    public void sethours(int name) {
      this.hours = hours;
    }// end sethours

    public void setwage(double wage) {
      this.wage = wage;
    }// end setwage
    
    // toString()
    
    public String toString() {
      StringBuilder s = new StringBuilder();
      String n1 = System.lineSeparator();

      s.append(String.format("%4f%3f%2s%1.2%s", this.getid(), this.gethours(), "$", this.getwage(), n1)); 

      return s.toString();
    }// end toString()
    
} // end of public class