package szokitalalo_csoportmunka;
public class Szokitalalo_CsoportMunka {

    public static void main(String[] args) {
        System.out.println("asd");
        start();
      
    }

    static void start(){
        //TESZT
//        String[] tarolo = {"Ló","Tó","Őz"};
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
//        } //TESZT
    }
    
    static String beker(){

        return null;

    }
    static boolean visszajelzes(String szoveg){
        
        return false;
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
    static void kisNagy(String szoveg){
        
    }
}   
