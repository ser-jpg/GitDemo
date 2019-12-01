package BootCampJava.Bill.Restaurant;

public class Suggestion {
    public void suggestion(){

        double rand=Math.random()*3+1;
        int randInt=(int)rand;
        if(randInt==1){
            System.out.println("Dring Soup...");
        }
        else if(randInt==2){
            System.out.println("Eat Hamburger...");
        }
        else{
            System.out.println("Enjoy Salad...");
        }
    }
    public void suggestCloth(){
        double rand=Math.random()*3+1;
        if((int)rand==1){
            System.out.println("Red shirt");
        }
        else if((int)rand==2){

            System.out.println("Blue Jeans");
        }
        else{
            System.out.println("White Hat");
        }
    }
}
