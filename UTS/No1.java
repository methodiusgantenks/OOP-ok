import java.util.Scanner;

public class No1 {

    public static void main(String[]args)
    {
        int jam;
        int menit;
        int detik;
        int total;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan nilai jam = ");
        jam = inputan.nextInt();
        System.out.print("Masukkan nilai menit = ");
        menit = inputan.nextInt();
        System.out.print("Masukkan nilai detik = ");
        detik = inputan.nextInt();
        total = ((jam*3600 + menit*60 + detik)*30);
        
        
    
        System.out.println("total biaya penggunaan anda RP."+total);
        
    }
}