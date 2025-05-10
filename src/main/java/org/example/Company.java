package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private  String name;
    private  double giro;
    private  String[] developerNames;

    public  Company(int id, String name, double giro, String[] developerNames){
        this.id=id;
        this.name=name;

        setGiro(giro); //I made an assignment with setGiro to preserve the giro requirement in the constructor.

        this.developerNames=developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGiro(double giro) {
    if(giro<0){
        this.giro=0;
    }
    this.giro=giro;
    }

    public double getGiro() {
        return giro;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }
    public String addEmployee(int index, String name) {
        if(index<0 || index>developerNames.length){
          return "Invalid index!! index value must be between 0 and " + (developerNames.length-1);
        }

        if(developerNames[index]==null){
            developerNames[index]=name;
            return "Developer name successfully added: " + name;
        }
        else {
            return "developer names already exist";
        }
    }

    // I override the toString() method (requirement)
    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }

}
