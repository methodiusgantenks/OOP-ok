import java.util.Scanner;

public class LatihanInputUser{
    public static void main(String[]args)
    {
        int x;
        int y;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan nilai x =");
        x = inputan.nextInt();
        System.out.print("Masukkan nilai y =");
        y = inputan.nextInt();

        System.out.println("Nilai x= "+x);
        System.out.println("Nilai y= "+y);
    }
}
