public class SwitchCase {
    public static void main(String[] args) {
        int fuel = 4;

        switch (fuel) {
            case 5:
                System.out.println("Deponuz full.");
                break;
            case 4:
                System.out.println("Deponuzda 4lt yakıt kalmıstır.");
                break;
            case 3:
                System.out.println("Deponuzda 3lt yakıt kalmıstır.");
                break;
            case 2:
                System.out.println("Deponuzda 2lt yakıt kalmıstır.");
                break;
            case 1:
                System.out.println("Deponuzda 1lt yakıt kalmıstır.\nAcilen yakıt ikmal ediniz!!");
                break;
            case 0:
                System.out.println("Deponuzdaki yakıt tükenmiştir!!");
                break;
            default:
                System.out.println("Hata!!");

        }
    
    }
}
