package BootCampJava.Bill.Inheritance1;

public class GeneralMenager extends Employee{
    int employee_count;


    public GeneralMenager(String name,String surname,String department,String branch,int employee_count ){
        super(name,surname,department,branch);
        this.employee_count=employee_count;

    }
    public void make_extra(int extra){

        System.out.println("It did "+extra+"$ of employee.");
    }
    public void displayEmployeeInform(){
        super.displayEmployeeInform();
        System.out.println("Employee count:"+this.employee_count);
    }




}
