package com.nissan.dao.Utilities;
import java.util.HashSet;
import java.util.Scanner;
import com.nissan.dao.CourseDao;
import com.nissan.bean.Course;

public class CourseUtilities {

    
    
    public static void displayCourse(Course course) {
        System.out.println(
                " -----------------------------------------------------------------------------------------------------");
        System.out.printf("%53s", "Course List\n");
        System.out.println(
                " -----------------------------------------------------------------------------------------------------");
        System.out.printf(" %-15s %-15s %-15s %-15s %-15s %-15s \n", " Course Code", "Course Name", "Description",
                "Duration", "Fees", "Qualification");
        System.out.println(
                " -----------------------------------------------------------------------------------------------------");

        System.out.printf(" %-15s %-15s %-15s %-15s %-15.2f %-15s \n", course.getCourseCode(), course.getCourseName(),
                course.getDescription(), course.getDuration(), course.getFees(), course.getQualification());

        System.out.println(
                " -----------------------------------------------------------------------------------------------------");
        CourseDao.menu();
    }

    public static int getSearchKey() {

        int searchKey = -1;
        try {

            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter Course code:");
            searchKey = userInput.nextInt();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Invalid Entry.!!!!");
        }

        return searchKey;

    }

    public static HashSet<String> removeQualification(HashSet<String> qualificationList) {

        Scanner userInput = new Scanner(System.in);
        System.out.println(" 1. B.Tech" + "\n 2. M.Tech" + "\n 3. BCA" + "\n 4. Bsc CS");
        System.out.print("Enter Choice:");
        int option = Integer.parseInt(userInput.next());

        switch (option) {
            case 1:
                qualificationList.remove("B.Tech");
                break;
            case 2:
                qualificationList.remove("M.Tech");
                break;
            case 3:
                qualificationList.remove("BCA");
                break;
            case 4:
                qualificationList.remove("Bsc CS");
                break;
            default:
                System.out.println("Invalid Entry.!!!");
                break;

        }
        return qualificationList;
    }

    public static HashSet<String> updateQualificationList(HashSet<String> qualificationList) {

        char choiceQual = 'X';
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.println(" 1. B.Tech" + "\n 2. M.Tech" + "\n 3. BCA" + "\n 4. Bsc CS");
            System.out.print("Enter Choice:");
            int option = Integer.parseInt(userInput.next());

            switch (option) {
                case 1:
                    qualificationList.add("B.Tech");
                    break;
                case 2:
                    qualificationList.add("M.Tech");
                    break;
                case 3:
                    qualificationList.add("BCA");
                    break;
                case 4:
                    qualificationList.add("Bsc CS");
                    break;
                default:
                    System.out.println("Invalid Entry.!!!");
                    break;
            }

            System.out.print("Add more qualifications (y/n):");
            choiceQual = userInput.next().charAt(0);

        } while (choiceQual == 'Y' || choiceQual == 'y');

        return qualificationList;
    }

}
