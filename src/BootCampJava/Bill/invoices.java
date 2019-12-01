package BootCampJava.Bill;

public class invoices {
    private String name;
    private String surname;
    private String invoice_number;
    private String adress;


    public invoices(String name,String surname,String invoice_number,String adress) {
        this.name=name;
        this.surname=surname;
        this.invoice_number=invoice_number;
        this.adress=adress;
    }



    public void electric_consumption(int electric_montly){
        if(electric_montly>500&& electric_montly<1500){

            System.out.println("Good Job...");
        }
        else if(electric_montly>=1000){
            System.out.println("Not Bad...");
        }
        else if(electric_montly>=1500){
            System.out.println("Start save energy");
        }
        else{
            System.out.println("invalid transaction..");
        }



    }
    public void internet_bil(int internet_montly){

        if(internet_montly>100){
            System.out.println("Good Speed...");
        }
        else if(internet_montly>300){
            System.out.println("Super speed..");
        }
        else{
            System.out.println("Invalid transaction...");
        }



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

    public String getInvoice_number() {
        return invoice_number;
    }

    public void setInvoice_number(String invoice_number) {
        this.invoice_number = invoice_number;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
