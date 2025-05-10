package org.example;
import java.util.Arrays;

public class Employee {

    private int id;
    private  String fullName;
    private  String email;
    private  String password;
    private  String[] healthPlans;


    public Employee(int id, String fullName , String email , String password,String[] healthPlans) {
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthPlans=healthPlans;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }
//Method used to add a health plan to a healthplans array in the Employee class;

    public String addHealthPlan(int index, String name){

        if(index<0 || index>healthPlans.length){
            return "Invalid index!! index value must be between 0 and " + (healthPlans.length-1);
        }

        if(healthPlans[index]==null){
            healthPlans[index]=name;
            return "Health plan successfully added: " + name;
        }
        else {
          return "health plan already exists";
        }


    }


    // I override the toString() method (requirement)
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthPlans) +
                '}';
    }

}
