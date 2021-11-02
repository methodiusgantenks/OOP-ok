import java.util.Scanner;

public class TugasNo2 extends TugasNo1{

    private double jumlah; 
    private double rerata;

    public double getJumlah()
    {
        return this.jumlah;
    }
    public double getRerata()
    {
        return this.rerata;
    }
    public void perhitungan() 
    {
        
    Scanner inputan = new Scanner(System.in);
    System.out.print("Masukkan nilai A =");
    this.varA = inputan.nextInt();
    System.out.print("Masukkan nilai B =");
    this.varB = inputan.nextInt();
    System.out.print("Masukkan nilai C =");
    this.varC = inputan.nextInt();
    
    this.jumlah = this.varA + this.varB + this.varC;
    this.rerata = this.jumlah/3;

    System.out.println("Nilai A= "+this.varA);
    System.out.println("Nilai B= "+this.varB);
    System.out.println("Nilai C= "+this.varC);
    System.out.println("Jumlah A+B+C = "+this.jumlah);
    System.out.println("Rerata dari A,B,C = "+this.rerata);


    }
    
    public static void main(String[] args) 
    {
        TugasNo2 oke = new TugasNo2();
        oke.perhitungan();
    }
    
}


   