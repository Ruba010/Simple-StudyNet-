/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roals
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author roals
 */
public class Professor extends User {

    // اراي يضيف فها واجبات
    private ArrayList<Assignment> assignments = new ArrayList<>();

    //    اراي يضيف فيها درجات
    private ArrayList<Grade> Allstudents = new ArrayList<>();

    Scanner input = new Scanner(System.in);
    private Student student;

    public Professor(String name, int Id) {
        super(name, Id);
    }

    public Professor(String name) {
        super(name);
    }

    public String CreateEmail() {
        String emailset = this.getName();

        emailset = emailset + "@uqu.edu.sa";
        return emailset;

    }

    @Override
    public void showInfo() {
        System.out.println("Log in successful , your information :");
        System.out.println("Professor Name:" + getName() + " Email: " + CreateEmail());
    }

    public void AddAssignment() {

        System.out.println("Enter name Of Assignment or Quiz");
        String nameofassignment = input.next();

        System.out.println("Enter Dead line of the assignment , (in form day - month - year)");
        String Deadline = input.next();
        input.nextLine();

        System.out.println("Enter a simple description  ");
        String simpleDescripton = input.next();

        Assignment assigment = new Assignment(nameofassignment, Deadline, simpleDescripton, new Professor(getName()));
        assignments.add(assigment);
        System.out.println("The assignment has been added successfully");

    }

    public void StudentEvaluation() {
        System.out.println("Enter name Of Student");
        String nameOfStudent = input.next();

        System.out.println("Enter the grade of the Student");
        double grade = input.nextDouble();

        System.out.println("Enter the ID of the Student");
        int IDofStudent = input.nextInt();

        Grade students = new Grade(nameOfStudent, grade, IDofStudent);
        Allstudents.add(students);

    }

    public void StudentDetection() {
        if (Allstudents.isEmpty()) {
            System.out.println("you dont have any Students ");
        } else {
            System.out.println("Your Students is :");
            for (int i = 0; i < Allstudents.size(); i++) {
                Collections.sort(Allstudents);
                System.out.println(Allstudents.get(i));
            }
        }
    }
}
