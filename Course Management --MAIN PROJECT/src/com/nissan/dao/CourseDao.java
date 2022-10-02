package com.nissan.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import com.nissan.app.NissanCrmApp;
import com.nissan.bean.Course;
import com.nissan.dao.Utilities.CourseUtilities;
public class CourseDao {

    static CourseUtilities utilities;
    // store all records
    static ArrayList<Course> arrCourseList = new ArrayList<>();

    // All CRUD operations - Menu driven
    // Menu
    public static void menu() {

        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("-              Course Management              -");
        System.out.println("-----------------------------------------------");
        System.out.println(" 1. Add Course" + "\n 2. List All Course" + "\n 3. Search Course" + "\n 4. Modify Course"
                + "\n 5  Delete Course" + "\n 6. Back.");
        System.out.println("-----------------------------------------------");

        System.out.print("Enter your choice:");
        // input from the user
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()) {
            case 1:
                // go to Add
                addCourse();
                break;
            case 2:
                // go to List
                listAllCourse();
                break;
            case 3:
                // go to Search
                Course course = searchAndReturnCourse();
                if (!(course == null)) {
                    CourseUtilities.displayCourse(course);
                } else {
                    menu();
                }
                break;
            case 4:
                // go to
                updateCourse();
                break;
            case 5:
                // go to Modify
                deleteCourse();
                break;
            case 6:
                // go to Delete
                // goBack();
                NissanCrmApp.mainMenu();
                break;

            default:
                System.out.println("Invalid entry.!!!");
                break;
        }
        input.close();

    }

    // Add Course
    private static void addCourse() {

        try {

            char choice = 'n';

            do {

                // create an object
                Course course = new Course();
                HashSet<String> qualificationList = new HashSet<>();

                // get input
                Scanner userInput = new Scanner(System.in);

                // auto-generate course code
                course.setCourseCode(Course.generateCourseCode());

                System.out.print("\n Enter Course Name:");
                course.setCourseName(userInput.next());

                System.out.print(" Enter Course Description:");
                course.setDescription(userInput.next());

                System.out.print(" Enter Course Duration:");
                course.setDuration(userInput.next());

                System.out.print(" Enter Course Fees:");
                course.setFees(userInput.nextFloat());

                // Qualification List
                System.out.println(" Qualification List:");
                qualificationList = CourseUtilities.updateQualificationList(qualificationList);

                // add to course object
                course.setQualification(qualificationList);

                // add to global array
                arrCourseList.add(course);

                System.out.print("Add More Course (y/n):");
                choice = userInput.next().charAt(0);

            } while (choice == 'Y' || choice == 'y');

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Invalid Entry.!!!!");
        }
        menu();

    }

    // List All
    private static void listAllCourse() {

        if (arrCourseList.size() == 0) {
            System.out.println("Course List Empty.");
        } else {

            System.out.println(
                    " -----------------------------------------------------------------------------------------------------");
            System.out.printf("%53s", "Course List\n");
            System.out.println(
                    " -----------------------------------------------------------------------------------------------------");
            System.out.printf("   %-15s %-15s %-15s %-15s %-15s %-15s \n", " Course Code", "Course Name", "Description",
                    "Duration", "Fees", "Qualification");
            System.out.println(
                    " -----------------------------------------------------------------------------------------------------");
            for (Course course : arrCourseList) {

                System.out.printf("  %-15s %-15s %-15s %-15s %-15.2f %-15s \n", course.getCourseCode(),
                        course.getCourseName(), course.getDescription(), course.getDuration(), course.getFees(),
                        course.getQualification());
            }
            System.out.println(
                    " -----------------------------------------------------------------------------------------------------");
        }
        menu();
    }

    // Search a Course
    private static Course searchAndReturnCourse() {
        // get Search key Course code
        int key = CourseUtilities.getSearchKey();

        for (Course course : arrCourseList) {

            if (course.getCourseCode() == key) {
                System.out.println("Course Found.!!!");
                return course;
            }
        }
        System.out.println("No Such Course.!!!");
        return null;
    }

    // Update Course
    private static void updateCourse() {

        char choice = 'n';
        Scanner userInput = new Scanner(System.in);

        do {

            Course course = searchAndReturnCourse();

            System.out.println();
            System.out.println("-----------------------------------------------");
            System.out.println("-                Update course                -");
            System.out.println("-----------------------------------------------");
            System.out.println(" 1. Update Course Name" + "\n 2. Update Description" + "\n 3. Update Fee"
                    + "\n 4. Update Duration \n 5. Update Qualification");
            System.out.println("-----------------------------------------------");

            System.out.print("Enter your choice:");
            // input from the user
            Scanner input = new Scanner(System.in);
            switch (input.nextInt()) {
                case 1:

                    System.out.println("Enter New Course Name:");
                    course.setCourseName(userInput.next());
                    System.out.println("Course Name updated successfully.");
                    break;

                case 2:

                    System.out.print(" Enter New Course Description:");
                    course.setDescription(userInput.next());
                    System.out.println("Course Description updated successfully.");
                    break;

                case 3:

                    System.out.print(" Enter New Course Duration:");
                    course.setDuration(userInput.next());
                    System.out.println("Course Duration updated successfully.");
                    break;

                case 4:

                    System.out.print(" Enter Course Fees:");
                    course.setFees(userInput.nextFloat());
                    System.out.println("Course Fees updated successfully.");
                    break;

                case 5:

                    char choiceQual = 'X';
                    System.out.println(" Update Qualification List:");
                    HashSet<String> qualificationList = new HashSet<String>();

                    do {
                        System.out.println(" 1. Add Qualification " + "\n 2. Remove Qualification");
                        System.out.print("Enter your choice:");
                        int qualChoice = input.nextInt();
                        qualificationList = course.getQualification();
                        switch (qualChoice) {
                            case 1:
                                qualificationList = CourseUtilities.updateQualificationList(qualificationList);
                                break;
                            case 2:
                                qualificationList = CourseUtilities.removeQualification(qualificationList);
                                break;
                            default:
                                System.out.println("Invalid Entry.!!!");

                                break;
                        }

                        System.out.print("Update Qualifications Details (y/n):");
                        choiceQual = userInput.next().charAt(0);

                    } while (choiceQual == 'Y' || choiceQual == 'y');

                    // add to course object
                    course.setQualification(qualificationList);
                    System.out.println("Qualifications updated successfully.");
                    break;
                default:
                    System.out.println("Invalid entry.!!!");
                    break;
            }

            System.out.print("Update Course Details (y/n):");
            choice = userInput.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        menu();
    }

    // Delete Course
    private static void deleteCourse() {

        Course course = searchAndReturnCourse();
        if (arrCourseList.remove(course)) {
            System.out.println("Course deleted successfully.");
        }
        menu();
    }

   
}
