
/*
Below code creats instance variable

*/
public class Student {
    // Instance variable
    private String name, gender, sMode, dob;
    private int year, modules;
    
    /*
    Creats a constructor that calls the instance 
    variabel and set them as a local 
    variable.
    */
    public Student(
            String name, String dob,
            String gender, String sMode,
            int year, int modules) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.sMode = sMode;
        this.year = year;
        this.modules = modules;
    }

    public Student() {
        // Creates constructor for the class Student
    }
    
    /*
    Creats a getter for name to be called later 
    when writng to file, searching 
    through the array list and when displaying the details. 
    */
    
    public String getName() {
        return name;
    }
    
    /*
    Creats a getter for dob to be called later
    when writng to file, searching 
    through the array list and when displaying the details. 
    */
    
    public String getDob() {

        return dob;
    }
    
    /*
    Creats a gender for dob to be called later when writing to file, searching 
    through the array list and when displaying the details. 
    */

    public String getGender() {

        return gender;
    }
    
    /*
    Creats a getter for study mode to be called 
    later when writing to file, searching 
    through the array list and when displaying the details. 
    */

    public String getSMode() {

        return sMode;
    }
    
    /*
    Creats a getter for year to be called later 
    when writing to file, searching 
    through the array list and when displaying the details. 
    */
    
    public int getYear() {

        return year;
    }
    
    /*
    Creats a getter for modules to be 
    called later when writing to file, searching 
    through the array list and when displaying the details. 
    */

    public int getModules() {

        return modules;
    }
    
    /*
    Creats a setter for name to be 
    called later when writing to file, searching 
    through the array list and when displaying the details. 
    */

    // setting up setters
    public void setName(String name) {

        this.name = name;
    }

    /**
     *
     * @param dob
     */
    public void setDob(String dob) {

        this.dob = dob;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {

        this.gender = gender;
    }

    /**
     *
     * @param sMode
     */
    public void setSMode(String sMode) {

        this.sMode = sMode;
    }

    /**
     *
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     *
     * @param modules
     */
    public void setModules(int modules) {
        this.modules = modules;
    }

}




