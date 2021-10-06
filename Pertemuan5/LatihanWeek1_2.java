import java.util.Scanner;

public class LatihanWeek1_2{
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
        total = (jam*3600 + menit*60 + detik);
        
        
    
        System.out.println("jam " +jam +":"+menit+":" +detik+" dikonversi kedetik = "+total);
        
    }
}
