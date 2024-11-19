/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roals
 */

public abstract class  User {
    private String name;
    private int Id;
    
     
    public User(){
    }

    
    public User(String name, int Id) {
        this.name = name;
        this.Id = Id;

    }
  
    public User(String name  ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public abstract void showInfo();
   
 

}
