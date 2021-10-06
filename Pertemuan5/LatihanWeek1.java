import java.util.Scanner;

public class LatihanWeek1{
    public static void main(String[]args)
    {
        int alas;
        int tinggi;
        float total;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan nilai alas = ");
        alas = inputan.nextInt();
        System.out.print("Masukkan nilai tinggi = ");
        tinggi = inputan.nextInt();
        total = (alas * tinggi/2);
        
        
    
        System.out.println("hasil dari " + alas + " x " + tinggi + " x 0.5 ");
        System.out.println("adalah "+total)
    }
}
