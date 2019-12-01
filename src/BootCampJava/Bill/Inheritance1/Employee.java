package BootCampJava.Bill.Inheritance1;

public class Employee {
     private String name;
     private String surname;
     private String department;
     private String branch;

    public Employee(String name, String surname, String departman, String branch) {
        this.name = name;
        this.surname = surname;
        this.department = departman;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartman() {
        return department;
    }

    public void setDepartman(String departman) {
        this.department= departman;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    public void employee(int abbas){

        System.out.println("Employee is working..");
    }
    public void displayEmployeeInform(){
        System.out.println("Name:"+name);
        System.out.println("Surname:"+surname);
        System.out.println("Department:"+department);
        System.out.println("Branch:"+branch);
    }
    public void department(String newDepartment){
        System.out.println("Department Changing..." );
        this.department=newDepartment;




    }
}
