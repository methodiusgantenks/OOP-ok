import java.util.Scanner;

public class No4{
    public static void main(String[]args)
    {
        
        double jarijari;
        double keliling;
        double luas;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan nilai jarijari = ");
        jarijari = inputan.nextFloat();
        keliling = (jarijari* 2 * 3.14);
        luas = (jarijari * jarijari * 3.14);
        System.out.println("Keliling Lingkaran adalah = "+keliling);
        System.out.println("Luas Lingkaran adalah = "+luas);
    }
}