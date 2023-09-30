
import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B00879570
 */
public class studentenrollmentassignment {
    static Course comSci = new Course();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        studentenrollmentassignment test = new studentenrollmentassignment();
        comSci.readFile();
        test.mainMenu();
    }

    /**
     * Creates options for user to pick what they want to run.
     */
    public void mainMenu() {
        System.out.println(
                "A) Add a new student to the course"
                        + "\nB) Display Course info"
                        + "\nC) Search for Students and view their details"
                        + "\nD) Search for Students to delete"
                        + "\nZ) Quit");
        controlStatement();
    }

    /**
     * This is conditional statement which runs the program based
     * on user choice.
     * it also has try and catch in order to catch any error that the system.
     */
    public void controlStatement() {

        System.out.println("Please pick what would to like to do "
                + "with the program:");
        Scanner scan = new Scanner(System.in); // Capturing the input

        try {
            String options = scan.nextLine().toLowerCase(Locale.ROOT);
            switch (options) {
                case "a":
                    System.out.println("You have selected options "
                            + "to add Student\n");
                    comSci.addStudent();
                    mainMenu();
                    System.out.println("");
                    break;

                case "b":
                    System.out.println("You have selected options to display "
                            + "course detaails\n");
                    comSci.displayCourseInfo();
                    System.out.println("");
                    mainMenu();
                    break;

                case "c":
                    System.out.println("You have selected options to "
                            + "search student\n");
                    System.out.println("");
                    comSci.searchName();
                    mainMenu();
                    break;

                case "s":
                    System.out.println("You have selected options to "
                            + "report the array\n");
                    System.out.println("");
                    comSci.reportArray();
                    mainMenu();
                    break;

                case "d":
                    System.out.println("You have selected options "
                            + "to delete student \n");
                    System.out.println("");
                    comSci.deleteStudent();
                    mainMenu();
                    break;

                case "z":
                    System.out.println("You have selected quit options\n");
                    comSci.writeToFileStudentDetails();
                    comSci.writeToCourseDetails();
                    System.out.println("");
                    break;

                default:
                    System.out.println("You have not selected any options:\n");
                    mainMenu();
            }

        } catch (Exception e) {
            System.out.println("Error occurd");

        }
    }
}
