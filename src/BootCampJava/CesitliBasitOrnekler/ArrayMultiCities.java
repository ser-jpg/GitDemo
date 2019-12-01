package BootCampJava.CesitliBasitOrnekler;
/* Create random 2 dimensional String array with city names
1-print cities with first letters is "A"
2- print all city names reversed
3-print city names start between a-h
 */
public class ArrayMultiCities{
    public static void main(String[] args) {
        String[][] cities = {
                {"Arlington","Richmond","Albany","Phoneix"},
                {"Houston","Charlotte","Baton Rouge","Oklahoma City","Boulder"},
                {"San Diego","Atlanta","Miami","Austin","Mineapolis","San Francisco"},
                {"Kansas City","Pittsburg","Los Angeles","Seattle"}
        };
        printCitiesWithFirstLetterA(cities);
        printCitiesHasA(cities);
        printCitiesReversed(cities);
    }
    public static void printCitiesWithFirstLetterA(String[][] cityNames){
        for(int i=0 ; i<cityNames.length ; i++){
            for(int j=0 ; j<cityNames[i].length ; j++){
                String city = cityNames[i][j];
                if(city.charAt(0)=='A'){
                    System.out.println(cityNames[i][j]);
                }
            }
        }
    }

    public static void printCitiesHasA(String[][] cities){
        boolean hasA=false;
        for(int i=0 ; i<cities.length ; i++){
            for(int j=0 ; j<cities[i].length ; j++){
                String city = cities[i][j];

                for(int k=0;k<cities[i][j].length();k++){
                    if(cities[i][j].charAt(k)=='A'||cities[i][j].charAt(k)=='a'){
                        hasA=true;
                    }
                }
                if(hasA){
                    System.out.println(cities[i][j]);
            }
                else {
                    hasA=false;
                }

        }

        }


    }
    public static void printCitiesReversed(String[][] cityArray){
        String city=null;
        int theLastIndex=0;
        for(int i=0 ; i<cityArray.length ; i++){
            for(int j=0 ; j<cityArray[i].length ; j++){
                city =cityArray[i][j];
                theLastIndex = city.length()-1;
                for(int k=theLastIndex ; k>=0 ; k--){
                    System.out.print(city.charAt(k));
                }
                System.out.println();
            }
        }
    }
    public static void printCitiesBetweenAH(String[][] myCities){
        for(int i=0 ; i<myCities.length ; i++){
            for(int j=0 ; j<myCities[i].length ; j++){
                if(myCities[i][j].charAt(0)>=65 && myCities[i][j].charAt(0)<=72){
                    System.out.println(myCities[i][j]);
                }
            }
        }
    }





}











