import java.util.Scanner;

public class No2 
{

    public static void main(String[] args)
    {


        float tinggi;
        float berat;
        float total;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan Tinggi (m) =  ");
        tinggi = inputan.nextFloat();
        System.out.print("Masukkan Berat = ");
        berat = inputan.nextFloat();
        total = (berat/(tinggi*tinggi));

        if (total < 18.5)
            {
                System.out.println("Underweight");
            }
        if (total > 22.9)
             {

                System.out.println("Overweight");
             }
            

        if ((total >= 18.6) && (total <= 22.69))
            {

            System.out.println("Ideal");

            }

        
    }
}