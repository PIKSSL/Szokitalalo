package szokitalalo_csoportmunka;

import java.util.Scanner;

public class Szokitalalo_CsoportMunka {

    public static void main(String[] args) {
        
        start();
      
    }

    static void start(){
        String[] tarolo = {"Ló","Tó","Őz"};
          //TESZT OSSZEHASONLITAS
//        String szo1 = "Ló";
//        String szo2 = "Tó";
//        System.out.println("asd");
//        int szam = osszehasonlitas(szo1, szo2);
//        if(szam == 10){
//            System.out.println("Megegyezik a szó");
//        }else if(szam == 11){
//            System.out.println("Teljesen különböznek");
//        }
//        else{
//            System.out.println("A "+szo2.charAt(szam)+" megyezik");
//        } //TESZT OSSZEHASONLITAS
            //TESZT KIS BETŰ KONVERTALAS
//        String szo = kisNagy(beker());
//        System.out.println(szo);
            //TESZT KIS BETŰ KONVERTALAS
    }
    
    static String beker(){
        Scanner scn = new Scanner(System.in);
        String tipp = scn.nextLine();
        return tipp;

    }
    static String visszajelzes(int eredmeny){
        
        return "";
    }
    static int osszehasonlitas(String szo1, String szo2){
        int i = 0;
        if(szo1 == szo2){
            return 10;
        }else{
            while(i < szo2.length()){
                char kk = szo2.charAt(i);
                String k = ""+kk;
                if (szo1.contains(k)){
                    return i;
                }
            i++;
            }
        }
        return 11;
    }
    static String kisNagy(String szoveg){
        String kisbetu = szoveg.toLowerCase();
        return kisbetu;
    }
}   
