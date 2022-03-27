package szokitalalo_csoportmunka;

import java.text.Normalizer;
import java.util.Random;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Szokitalalo_CsoportMunka {
       static Random rnd = new Random();
       static int veletlenSzo=rnd.nextInt(3);
    public static void main(String[] args) {
        
        start();
      
    }

    static void start(){


       boolean k = true;
       while(k){
       String[] tarolo = {"Ló","Tó","Őz"};
       String szo1=kisNagy(tarolo[veletlenSzo]) ;
       String szo2=kisNagy(beker("Adja meg a tippjét!\n>>"));
       System.out.println(szo1+" "+ szo2);
       System.out.println(visszajelzes(osszehasonlitas(szo1, szo2), szo1, szo2));
       String valasz = beker("Szeretné újra megpróbálni?\n[1]Igen\n[2]Nem\n>>"); //Az egyszerüség kedvéért tételezzük fel hogy a felhasználó ezen a ponton számot fog megadni az adott opciók közül.
       if(Integer.parseInt(valasz) == 2){
           System.out.println("Viszlát!");
           k = false;
       }
       }
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
        Scanner scn = new Scanner(System.in, "ISO-8859-1");
        System.out.print(szoveg);
        String tipp = scn.nextLine();
           
        return tipp;

    }
    static String visszajelzes(int eredmeny, String szo1, String szo2){
        String kiir="";
        if (eredmeny==10){
             kiir="Eltalálta a szót!";
             veletlenSzo=rnd.nextInt(3);
            }
        else if  (eredmeny == 11){
              kiir="A két szó nem egyezik!";
        }
        else if (eredmeny == 12){
              kiir="A két betű helyes, de rossz helyen vannak!";}
        else{
             if(szo1.charAt(eredmeny) == szo2.charAt(eredmeny)){
               kiir="A "+szo2.charAt(eredmeny)+" a megfelelő helyen található.";
           }else{
               kiir="A "+szo2.charAt(eredmeny)+" benne van a szóban, de nem a megfelelő helyen.";
           }}
        
            
//            for (int i = 0; i < szo1.length(); i++) {
//
//                String szo_2 = ""+szo2.charAt(eredmeny);
//           if(szo1.contains(szo_2) && szo1.charAt(eredmeny) == szo2.charAt(eredmeny)){
//               kiir="A "+szo2.charAt(eredmeny)+" a megfelelő helyen található.";
//           }else{
//               kiir="A "+szo2.charAt(eredmeny)+" benne van a szóban, de nem a megfelelő helyen.";
//           }}
            
//            kiir="A"+eredmeny+"."+" helyen álló betü helyes";
//        }
       return kiir;
        
    }
    static int osszehasonlitas(String szo1, String szo2){
        int i = 0;
        if(szo1.contains(szo2)){
            return 10;
        }else{
            while(i < szo2.length()){
                String k = ""+szo2.charAt(i);
                String l = ""+szo2.charAt(0);
                String ll = ""+szo2.charAt(1);
                if (szo1.contains(l) && szo1.contains(ll)){
                    return 12;
                }else if(szo1.contains(k)){
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
                String ki = StringUtils.replace(kisbetu, "õ", "ő");
                ki = StringUtils.replace(ki, "û", "ű");
        return ki;
    }
}   
