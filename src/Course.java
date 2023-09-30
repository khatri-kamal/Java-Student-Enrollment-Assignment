/*
Importing all the java libraries needed for this class
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

public class Course {
    // Creating an array of Students and setting max amount to 20. 
    private final Student[] studentList = new Student[20];
    // Creating a variable to keep track of the student amount.
    static int studentAmount = 0;

//Adds a student object to the object to the array by checking for null values

    public void addStudent(Student student){
      for (int i = 0; i < studentList.length; i++) { 
        if (studentList[i] == null){
          studentList[i] = student;
          break;
        }
      }
        studentAmount++;
    }
    
   // asks user for student details and checks if they are valid inputs. 
    
    public void addStudent() {
        
        Scanner scanner = new Scanner(System.in); 

        while (studentAmount <= 20) {

            System.out.println("Enter student's name:");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) { // checks if it's left blank or not
                System.out.println("Note: Name field cannot be left blank. "
                        + "This student's details will not be saved "
                        + "beyond the current session.");
                continue;
            }
            
            System.out.println("Enter student's date of birth (dd/mm/yyyy):");
            String dob = scanner.nextLine();
            
            while (true){
                if(checkValidDate(dob) == true) {
                    break;
                   
                }else{
                    System.out.println("Invalid date of birth. Try again.");
                    System.out.println("Enter student's date of birth "
                            + "dd/mm/yyyy: ");
                    dob = scanner.nextLine();
                    
                }
            }    
                    
            System.out.println("Enter student's gender (M/F)");
            String gender = scanner.nextLine();
            while (true) {
                if (gender.isEmpty()) {
                    System.out.println("Note: Gender field "
                            + "cannot be left blank.");
                    System.out.println("Enter student's gender (M/F)");
                    gender = scanner.nextLine();
                } else if (!gender.equalsIgnoreCase("M") && 
                        !gender.equalsIgnoreCase("F")) {
                    System.out.println("Invalid gender. Please enter M/F.");
                    System.out.println("Enter student's gender (M/F)");
                    gender = scanner.nextLine();
                } else {
                    break;
                }
            }
            
            System.out.println("Enter student's study mode (PT or FT):");
            String mode = scanner.nextLine();
            while (true) {
                if (mode.isEmpty()) {
                    System.out.println("Note: Study mode field cannot "
                            + "be left blank. This student's details will "
                            + "not be saved beyond the current session.");
                    System.out.println("Enter student's study mode (pt/ft):");
                    mode = scanner.nextLine();
                } else if (!mode.equalsIgnoreCase("PT") && 
                        !mode.equalsIgnoreCase("FT")) {
                    System.out.println("Invalid Study Mode. Try again.");
                    System.out.println("Enter student's study mode (pt/ft):");
                    mode = scanner.nextLine();
                } else {
                    break;
                }

            }
            /* Below code is to student year and to check if they 
            left blank or checks for error handling
            */
            int year = 0;
            String yearString;

            do {
                System.out.println("Enter current student's study year (1 to 4)"
                        + " or leave blank:");
                yearString = scanner.nextLine();

                if (yearString.isEmpty()) {
                    System.out.println("Note: Current study year field "
                            + "cannot be left blank.");
                } else {
                    try {
                        year = Integer.parseInt(yearString);
                        if (year < 1 || year > 4) {
                            System.out.println("Invalid current study year. "
                                    + "Please enter a value between 1 and 4.");
                            yearString = "";
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid current study year. "
                                + "Please enter a number between 1 and 4.");
                        yearString = "";
                    }
                }
            } while (yearString.isEmpty());

            // Checking modules for valid input
            int modules = 0;
            String modulesString;

            do {
                System.out.println("Enter number of modules (1 to 6) "
                        + "or leave blank:");
                modulesString = scanner.nextLine();

                if (modulesString.isEmpty()) {
                    System.out.println("Note: course modules field "
                            + "cannot be left blank.");
                } else {
                    try {
                        modules = Integer.parseInt(modulesString);
                        if (modules < 1 || modules > 6) {
                            System.out.println("Invalid number of modules. "
                                    + "Please enter a value between 1 and 6.");
                            modulesString = "";
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number of modules. "
                                + "Please enter a number between 1 and 6.");
                        modulesString = "";
                    }
                }
            } while (modulesString.isEmpty());

            // Add student details into array
            Student s1 = new Student (name, dob, gender, mode, year, modules);
            int tuitionFee = tuitionFee(s1);
            System.out.println("Tuition cost for this Student: " + tuitionFee);
            addStudent(s1);

            System.out.println("Student enrolled successfully. "
                    + "Enroll another student? (yes/no)");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
    
    public boolean checkValidDate(String dob){
        boolean validInput = false;
        SimpleDateFormat dobFormat = new SimpleDateFormat("dd/MM/yyyy");
        dobFormat.setLenient(false);
        
        try{
            Date validDate = dobFormat.parse(dob);
            validInput = true;
           
            Date currentDate = new Date();
            
            if(!validDate.after(currentDate)){
                return true;
                
            } else {
                return false;
            }
        }catch(ParseException e){
            System.out.println("date of birth cannot be left blank"
                    + "");
            return false;
        }
        
    }
    
     /*
    Reads the current Student_Details.txt to populate the array. Ignores the
    first line and keeps the array at 20 students.
    */
    
    public void readFile() {
        try {
            File myObj = new File("Student_Details.txt");
            try (Scanner myReader = new Scanner(myObj)) {
                myReader.nextLine();
                while (myReader.hasNextLine() && studentAmount <= 20) {
                    String data = myReader.nextLine();
                    String[] student = data.split(",");
                    String name = student[0];
                    String dob = student[1];
                    String gender = student[2];
                    String sMode = student[3];
                    int year = Integer.parseInt(student[4]);
                    int modules = Integer.parseInt(student[5]);
                    
                    Student s1 = new Student(name, dob, gender, sMode, 
                            year, modules);
                    addStudent(s1);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect text file format or more then 20 "
                    + "students added. Please restart the program");
        }
    }
    
    /*
    Rewrites the text file to the array when the program ends. Checks for null
    values to not include it in the text file.
    */
    
    public void writeToFileStudentDetails() {
        deleteFile();
        String fileName = "Student_Details.txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("Name, Date of Birth, Gender, Study Mode, Year,"
                    + " Number of modules, Tuition Fee\n");
            for (Student student : studentList) {
                if (student != null)
                {
                    writer.write(student.getName()+","
                            + student.getDob()+","
                            + student.getGender()+","
                            + student.getSMode()+","
                            + student.getYear()+","
                            + student.getModules() + ","
                            + tuitionFee(student) + "\n");
                }
            }
        } catch (IOException e) {
        }
    }
    
    /*
    Deletes the file for writing
    */
    
    public void deleteFile() {
        File fileIO = new File("Student_Details.txt");
        if (fileIO.delete()) {
            System.out.println("Saved details to: " + fileIO.getName());
        } else {
            System.out.println("Failed to save the file.");
        }
    }

    public void display(int choice){
        if (studentList[choice] != null){
            System.out.println("Enrolled Students:");
            System.out.println( "Name: " + studentList[choice].getName()
                + ", DOB: " + studentList[choice].getDob()
                + ", Gender: " + studentList[choice].getGender()
                + ", Study Mode: " + studentList[choice].getSMode()
                + ", Year: " + studentList[choice].getYear()
                + ", Number of Modules: " + studentList[choice].getModules()
                + ", Tuition Fee: " + tuitionFee(studentList[choice])
                + "\n");
        }
    }
    public void reportArray(){
        for (int i = 0; i < 0; i++) {
            if (studentList[i] != null){
                display(i);
            }
        }
    }
    
    // Calculates the student fee for a student object
    
    public int tuitionFee (Student student){
        int payment;
        if ("ft".equals(student.getSMode())){
            if (student.getYear() == 3){
                payment = 2500;
            }
            else {
                payment = 5000;
            }
        }else {
        payment = student.getModules() * 750;
        
    }
        return payment;
    }
    
    //Searches the array for a student with the same name inputed.
    
    public void searchName(){
        System.out.println("Enter a Student's name");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        try {
            for (Student student : studentList) {
                if (student.getName() == null ?
                        searchName == null : 
                        student.getName().equalsIgnoreCase(searchName)) {
                    System.out.println("\nName: " + student.getName()
                            +"\nDate of Birth: " + student.getDob()
                            +"\nGender: " + student.getGender()
                            +"\nStudent Mode: " + student.getSMode()
                            +"\nCurrent Year: " + student.getYear()
                            +"\nNumber of Modules: " + student.getModules()
                            +"\nTuition Fee: " + tuitionFee(student) + "\n");
                 break;
                }
            }
        }catch(Exception e){
            System.out.println("Student not Found");
        }
    }
    
    /*
    Method for deleting a student object from the array by searching the array
    */
    public void deleteStudent(){
        System.out.println("Enter a Student's name you would like to delete");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        
        for (int i = 0; i < studentAmount; i++) {
            if (studentList[i] != null &&
                    studentList[i].getName().equalsIgnoreCase(searchName)) {
                studentList[i] = null;
                studentAmount--;
                break;
            }     
        }
        System.out.println("Student not found");
        
     /* Displays the Course info such as the number students enrolled,
        percentage of male students and percentage of female students
     */
    }
    public void displayCourseInfo(){
        float femalePercent = ((float) noFemale() / studentAmount) * 100;
        float malePercent = ((float) noMale() / studentAmount) * 100;
        float mRoundOff = (float)(Math.round(malePercent*100)/100.00);
        float fRoundOff = (float)(Math.round(femalePercent*100)/100.00);
        System.out.println("Course Name: Computer Science"
                + "\nNumber of Students enrolled: "+ studentAmount 
                + "\nPercentage of Male Students enrolled: "
                + mRoundOff + "%"
                + "\nPercentage of Female Students enrolled: " +
                fRoundOff + "%");
    }
    // Caluclating number of male, female, part time and full time students
    public int noMale(){
        int noMale = 0;
        for (Student studentList1 : studentList) {
            if (studentList1 != null && 
                    "M".equalsIgnoreCase(studentList1.getGender())) {
                noMale++;
            }
        }
        return noMale;
    }
    public int noFemale(){
        int noFemale = 0;
        for (Student studentList1 : studentList) {
            if ((studentList1 != null) && 
                    ("F".equalsIgnoreCase(studentList1.getGender()))) {
                noFemale++;
            }
        }
        return noFemale;
    }
    
    public int noPTStudents(){
        int noPTStudents = 0;
        for (Student studentList1 : studentList) {
            if ((studentList1 != null) && 
                    ("PT".equalsIgnoreCase(studentList1.getSMode()))) {
                noPTStudents++;
            }
        }
        return noPTStudents;
    }
    
    public int noFTStudents(){
        int noFTStudents = 0;
        for (Student studentList1 : studentList) {
            if ((studentList1 != null) && 
                    ("FT".equalsIgnoreCase(studentList1.getSMode()))) {
                noFTStudents++;
            }
        }
        return noFTStudents;
    }
    
    // Writes the course info to its own text file
    public void writeToCourseDetails() {
        deleteCourseFile();
        String fileName = "Course_Details.txt";
        float femalePercent = ((float) noFemale() / studentAmount) * 100;
        float malePercent = ((float) noMale() / studentAmount) * 100;
        float mRoundOff = (float)(Math.round(malePercent*100)/100.00);
        float fRoundOff = (float)(Math.round(femalePercent*100)/100.00);
        try (FileWriter writer = new FileWriter(fileName, true)) {
                    writer.write("Course name, Number of PT Students, "
                            + "Number of FT Students, "
                            + "Percentage of male students, "
                            + "Percentage of female students"
                            + "\nComputer Science,"+ noPTStudents()+","
                            + noFTStudents()+","+ mRoundOff +"%,"
                            + fRoundOff + "%");
                } catch (IOException e) {
        }
    }
    // Deletes the file for rewriting the text file
    public void deleteCourseFile() { 
    File fileIO = new File("Course_Details.txt"); 
    if (fileIO.delete()) { 
      System.out.println("Saved details to: " + fileIO.getName());
    } else {
      System.out.println("Failed to save the file.");
    } 
  } 
    
}
