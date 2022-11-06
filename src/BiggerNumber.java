public class BiggerNumber {
    public static void main(String[] args) {
        //girilen sayilardan en buyugunu buldurur
        int sayi1 = 12;
        int sayi2 = 15;
        int sayi3 = 17;

        int buyuksayi = sayi1;

        if (sayi1 < sayi2 || sayi1 < sayi3) {
            if (sayi2 < sayi3) {
                buyuksayi = sayi3;
            } else {
                buyuksayi = sayi2;
            }
        }


        System.out.println("En buyuk  sayi: " + buyuksayi);


    }
}
