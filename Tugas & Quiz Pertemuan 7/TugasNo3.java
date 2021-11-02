import java.util.Scanner;

public class TugasNo3 extends TugasNo1{

    double varX,varY,varMin,varMax;
    public static void main(String[] args)
    
    { 
        TugasNo3 mantap = new TugasNo3();
        mantap.perhitungan();
        mantap.min();
        mantap.max();
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

    }

    public double min()
    {
       varX = Math.min(this.varA,this.varB);
       varMin = Math.min(this.varX,this.varC);
       System.out.println("Nilai Min dari A,B,C = "+varMin);
       return varMin;
    }
    
    public double max()
    {
       varY = Math.max(this.varA,this.varB);
       varMax = Math.max(this.varY,this.varC);
       System.out.println("Nilai Max dari A,B,C = "+varMax);
       return varMax;
    }
}