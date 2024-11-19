//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;


import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ruba project
 */
public class src {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1 if you are Professor");
        System.out.println("Enter number 2 if you are Student");
        int choose = input.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Enter your name");
                String name = input.next();
                Professor prof = new Professor(name);
                prof.showInfo();



                while(true){
                    System.out.println("Enter number 1 to add Assignment");
                    System.out.println("enter number 0 to exit ");
                    int choose0 = input.nextInt();
                    switch (choose0) {
                        case 1:
                            prof.AddAssignment();
                            break;

                        case 0:
                            System.out.println("Exiting the system...");
                            System.exit(0);
                            break;

                    }

                }
            case 2:
                System.out.println("Enter your name");
                name = input.next();

                System.out.println("Enter your ID");
                int ID = input.nextInt();

                System.out.println("Enter your level");
                int level = input.nextInt();

                System.out.println("enter the year you joined the university");
                int year = input.nextInt();

                Student student = new Student(name, ID, level, year);
                student.showInfo();

                while (true) {

                    System.out.println("Enter number 1 to add courses");
                    System.out.println("Enter number 2 to remove course");
                    System.out.println("Enter number 3 to show courses");
                    System.out.println("Enter number 0 to exit");
                    int choose1 = input.nextInt();

                    switch (choose1) {

                        case 1:
                            student.AddCourse();

                            break;

                        case 2:
                            System.out.println("Enter ID of the course you want to remove");
                            int numCourse = input.nextInt();
                            student.removeCourse(numCourse);
                            break;

                        case 3:

                            student.showCourses();
                            break;

                        case 0:
                            System.out.println("Exiting the system...");
                            System.exit(0);
                            break;

                    }

                }

        }

    }
}
