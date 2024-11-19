/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roals
 */


public class Courses implements Comparable {

    private int idCourses;
    private String nameCourse;
    private Professor prof;
    private Assignment assignment;

    public int getIdCourses() {
        return idCourses;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public Professor getProf() {
        return prof;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setIdCourses(int idCourses) {
        this.idCourses = idCourses;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public Courses() {

    }

    public Courses(int idCourses) {
        this.idCourses = idCourses;
    }

    public Courses(int idCourses, String nameCourse, Professor prof) {
        this.idCourses = idCourses;
        this.nameCourse = nameCourse;
        this.prof = prof;
    }


    @Override
    public String toString() {
        return "Courses Information : id=" + idCourses + ", Name of Course=" + nameCourse + ", professor Name=" + prof.getName();
    }

    @Override
    public int compareTo(Object o) {
        Courses cours = (Courses) o;
        return this.idCourses - cours.idCourses;
    }

}
