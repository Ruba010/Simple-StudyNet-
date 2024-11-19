/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roals
 */

public class Assignment {

    private String NameOfAssignment;
    private String deadline;
    private String description;
    private Professor prof;
    private Grade grade;
    
    public Assignment(String NameOfAssignment, String deadline, String description, Professor prof) {
        this.NameOfAssignment = NameOfAssignment;
        this.deadline = deadline;
        this.description = description;
        this.prof = prof;
    }

    
    public Assignment() {
    }

    public String getNameOfAssignment() {
        return NameOfAssignment;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getDescription() {
        return description;
    }

    public Professor getProf() {
        return prof;
    }

    public void setNameOfAssignment(String NameOfAssignment) {
        this.NameOfAssignment = NameOfAssignment;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }
    
    

}
