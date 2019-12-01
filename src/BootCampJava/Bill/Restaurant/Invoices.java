package BootCampJava.Bill.Restaurant;

public class Invoices {
    public String evaluateElectric(int cumsuption){

        String result="";
        if(cumsuption>500&&cumsuption<1000){
            result="God Job...";

        }
        else if(cumsuption>=1000){
            result="Not Bad...";
        }
        else if(cumsuption>=1500){
            result="Start save Energy...";
        }
        else{
            result="Invalid Transaction...";
        }
        return result;

    }
    public String evaluateInternet(int speed){
       String result;
        if(speed>=100){
            result="Good Speed...";

        }
        else if(speed>=300){
            result="Super Speed...";
        }
        else{
            result="invalid Transaction...";
        }
        return result;

    }

}
