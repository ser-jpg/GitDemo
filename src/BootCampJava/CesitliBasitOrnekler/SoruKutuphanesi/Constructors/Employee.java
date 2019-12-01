package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Constructors;

public class Employee {

    private String id;
    private String name;
    private String departmen;
    private double salary;
    private String contractType;


    public Employee(String id,String name,String departmen,double salary,String contractType) {
        this.setId(id);
        this.setName(name);
        this.setDepartmen(departmen);
        this.setSalary(salary);
        this.setContractType(contractType);
    }
    Employee(){

        this.id="123";
        this.name="Temp";
        this.departmen="new";
        this.salary=1186.12;
        this.contractType="later";
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmen() {
        return departmen;
    }

    public void setDepartmen(String departmen) {
        this.departmen = departmen;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }
    public double calculateWeeklyPayment (int weeks){
        double weeklyPayment;
        weeklyPayment=(salary/52)*weeks;

        return weeklyPayment;
    }
    public double calculateBiWeeklyPayment(int weeks){
        double biweeklyPayment;
        biweeklyPayment=(salary/52)*weeks;

        return biweeklyPayment;
    }
    public void displayEmployeeInform(){

        System.out.println("Employee name:"+name);
        System.out.println("Employee Department:"+departmen);
        System.out.println("Employee Id:"+id);


    }
}
