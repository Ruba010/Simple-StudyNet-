/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roals
 */

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author RRRRRRRRRRRRRRRRua
 */
public class Student extends User implements CourseManager {

    Scanner input = new Scanner(System.in);
    private int level;
    private int year;
    private Assignment assignment;
    private Grade grade;

    private ArrayList<Courses> Allcourses = new ArrayList<>();
    private static ArrayList<Courses> availableCourses = new ArrayList<>();

    static {

        availableCourses.add(new Courses(101, "Math 101", new Professor("Dr. Maram ")));
        availableCourses.add(new Courses(102, "Physics 101", new Professor("Dr. Mona")));
        availableCourses.add(new Courses(103, "Chemistry 101", new Professor("Dr. Sami ")));
        availableCourses.add(new Courses(104, "Database 201", new Professor("Dr. hadu ")));
        availableCourses.add(new Courses(105, "operting system 201", new Professor("Dr. hana ")));




    }
    public Student() {

    }

    public Student(Grade grade) {

        this.grade = grade;
    }

    public Student(String name, int Id, int level, int year) {
        super(name, Id);
        this.level = level;
        this.year = year;
    }

    public int getLevel() {
        return level;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<Courses> getAllcourses() {
        return Allcourses;
    }

    public void setAllcourses(ArrayList<Courses> Allcourses) {
        this.Allcourses = Allcourses;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public void AddCourse() {
        System.out.println("Available Courses:");
        for (int i = 0; i < availableCourses.size(); i++) {
            System.out.println(availableCourses.get(i).getIdCourses() + ". " + availableCourses.get(i).getNameCourse());
        }

        System.out.println("Enter the ID of the course you want to add:");
        int courseId = input.nextInt();

        boolean found = false;
        for (Courses course : availableCourses) {
            if (course.getIdCourses() == courseId) {
                Allcourses.add(course);
                System.out.println("Course added: " + course.getNameCourse());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Invalid course ID.");
        }
    }


    @Override


    public void removeCourse(int courseId) {
        if (Allcourses.isEmpty()) {
            System.out.println("You do not have any course to remove!");
        } else {
            boolean found = false;
            Iterator<Courses> iterator = Allcourses.iterator();
            while (iterator.hasNext()) {
                Courses course = iterator.next();
                if (course.getIdCourses() == courseId) {
                    iterator.remove();
                    System.out.println("Course removed: " + course.getNameCourse());
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Course with ID " + courseId + " not found.");
            }
        }
    }





    @Override
    public void showCourses() {
        if (Allcourses.isEmpty()) {
            System.out.println("You don't have any courses.");
        } else {
            System.out.println("Your Courses are:");
            for (Courses course : Allcourses) {
                System.out.println("ID: " + course.getIdCourses() + " - " + course.getNameCourse());
            }
        }
    }


    public String CreateEmail() {
        String emailset = "s";
        emailset = emailset + getYear();

        for (int i = 0; i < 7; i++) {
            int rand = (int) (Math.random() * 7);
            emailset = emailset + rand;
        }
        emailset = emailset + "@st.uqu.edu.sa";
        return emailset;
    }

    @Override
    public void showInfo() {
        System.out.println("Log in successful , your information :");
        System.out.println("Name:" + getName() + " Level:" + getLevel() + " Email: " + CreateEmail());
    }

}

