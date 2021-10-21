import java.util.Scanner;

public class No4{
    public static void main(String[]args)
    {
        
        double diameter;
        double keliling;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan nilai diameter = ");
        diameter = inputan.nextFloat();
        keliling = (diameter * 3.14);
        
        
    
        
        System.out.println("adalah "+keliling);
    }
}