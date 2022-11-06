public class Conditionals {
    public static void main(String[] args){
        //girilen sayinin 100 ile olan iliskisini aciklar
        int sayi = 99;

        if(sayi < 100){
            System.out.println("Sayi 100'den kucuktur.");
        } else if (sayi == 100) {
            System.out.println("Sayi 100'e esittir.");
        }
        else{
            System.out.println("Sayi 100'den buyuktur.");
        }

    }
}
