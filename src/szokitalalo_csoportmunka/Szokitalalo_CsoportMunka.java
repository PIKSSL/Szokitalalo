package szokitalalo_csoportmunka;

import java.text.Normalizer;
import java.util.Random;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Szokitalalo_CsoportMunka {

    public static void main(String[] args) {
        
        start();
      
    }

    static void start(){
       Random rnd = new Random();
       int veletlenSzo=rnd.nextInt(3);
       int i = 0;
       String[] tarolo = {"Ló","Tó","Őz"};
       String szo1=kisNagy(tarolo[veletlenSzo]) ;
       String szo2=kisNagy(beker("Adja meg a tippjét!\n>>"));
       System.out.println(szo1+" "+ szo2);
       System.out.println(visszajelzes(osszehasonlitas(szo1, szo2), szo1, szo2));
            
       {
       }
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
    
    static String beker(String szoveg){
        Scanner scn = new Scanner(System.in);
        System.out.print(szoveg);
        String tipp = scn.nextLine();
           
        return tipp;

    }
    static String visszajelzes(int eredmeny, String szo1, String szo2){
        String kiir="";
        if (eredmeny==10){
             kiir="Eltalálta a szót!";
            }
        else if  (eredmeny == 11){
              kiir="A két szó nem egyezik!";
        }
        else{
           if(szo1.charAt(eredmeny) == szo2.charAt(eredmeny)){
               kiir="A "+szo2.charAt(eredmeny)+" a megfelelő helyen található.";
           }else{
               kiir="A "+szo2.charAt(eredmeny)+" benne van a szóban, de nem a megfelelő helyen.";
           }
            
//            kiir="A"+eredmeny+"."+" helyen álló betü helyes";
        }
       return kiir;
        
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
    
//    static boolean ellenorzes(String adat, int tipus){
//        if(adat.equals("")){
//            System.out.println("HIBA:üres mező");
//            return false;
//        }
//        if(tipus == 1){
//            for (int i = 0; i < adat.length(); i++)
//            if (!Character.isDigit(adat.charAt(i))){
//                System.out.println("HIBA:csak számokat adhat meg");
//                return false;}
//        }
//        
//        return true;
//    }
    static String kisNagy(String szoveg){
        String kisbetu = szoveg.toLowerCase();
        return kisbetu;
    }
}   
