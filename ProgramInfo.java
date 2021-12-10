/********************************************************************
  * Programmer:    Manraj
  * Class:  CS30S
  *
  * Assignment: Exam
  *
  * Description: prints banner and closing message of exam
  ***********************************************************************/

 // import libraries as needed here

 public class ProgramInfo {
     //*** Class Variables ***

     //*** Instance Variables ***
     
     private String ExamPayroll;

     //*** Constructors *** 
     
     public ProgramInfo(String assingment){
         ExamPayroll = this.ExamPayroll;
     }

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
     
 public String getBanner(){
        String nl = System.lineSeparator();
        String banner;
        
        banner = "*****************************" + nl;
        banner += "Name:        Manraj Sidhu" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  ExamPayroll" + nl;
        banner += "*****************************" + nl + nl;
        
       return banner;
    }// end getBanner()
    
    public String getClosingMessage(){
       String ClosingMessage;
       String nl = System.lineSeparator();
       
       ClosingMessage = "end of processing";
       return ClosingMessage;
    }// end getClosingMessage()

     //*** Setters ***

 } // end of public class