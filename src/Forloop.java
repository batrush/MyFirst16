public class Forloop {
    public static void main(String[] args) {

        //faktöriyel bulduran uygulama
        int sayi = 10;
        int faktoriyel = 1;

        for (; 0 < sayi; sayi--) {
            faktoriyel *= sayi;
        }
        System.out.println(faktoriyel);


        //asal sayı bulduran uygulama
        int sayi2 = 100;
        int kontrol = 2;
/*
        while(0 < sayi2){

            for(; kontrol <= sayi2; kontrol++){
                if(sayi2 % kontrol != 0){
                    System.out.println(sayi2);
                    break;
                }
            }
            sayi--;
        }
*/
    }
}
