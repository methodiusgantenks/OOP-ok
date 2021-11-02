import java.util.Scanner;

public class ProgramWarnet
{

    double varBilling,varPrintHitam,varMinuman,varTotal,varPrintWarna,varKetik,varScan;
    double varTotalBilling,varTotalKetik,varTotalScan,varTotalPrintHitam,varTotalPrintWarna,varTotalMinuman;
    public static void main(String[] args)
    
    { 
        ProgramWarnet warnet = new ProgramWarnet();
        warnet.perhitungan();
        warnet.internet();
        warnet.ketik();
        warnet.scan();
        warnet.printHitamPutih();
        warnet.printWarna();
        warnet.minuman();
        warnet.total();
    }

    public void perhitungan() 
    {
        
    Scanner inputan = new Scanner(System.in);
    System.out.print("Masukkan Waktu menit (Mengetik) = ");
    varKetik = inputan.nextInt();
    System.out.print("Masukkan Waktu menit (internet) = ");
    varBilling = inputan.nextInt();
    System.out.print("Masukkan Jumlah Print (warna) = ");
    varPrintWarna = inputan.nextInt();
    System.out.print("Masukkan Jumlah Print (hitam putih) = ");
    varPrintHitam = inputan.nextInt();
    System.out.print("Masukkan Jumlah Scan = ");
    varScan = inputan.nextInt();
    System.out.print("Masukkan Jumlah Minuman = ");
    varMinuman = inputan.nextInt();
    System.out.println("  ");
    }

    public double internet()
    {
       varTotalBilling = ((varBilling/60)*4000);
       System.out.println("Nilai harga billing Internetan =RP. "+varTotalBilling);
       return varTotalBilling;
    }
    
    public double ketik()
    {
       varTotalKetik = ((varBilling/60)*2000);
       System.out.println("Nilai harga billing Ketik =RP. "+varTotalKetik);
       return varTotalKetik;
    }
    
    public double scan()
    {
       varTotalScan = (varScan*1000);
       System.out.println("Nilai harga Scan =RP. "+varTotalScan);
       return varTotalScan;
    }
    
    public double printHitamPutih()
    {
       varTotalPrintHitam = (varPrintHitam*300);
       System.out.println("Nilai harga print hitam putih =RP. "+varTotalPrintHitam);
       return varTotalPrintHitam;
    }
   
    public double printWarna()
    {
       varTotalPrintWarna = (varPrintWarna*500);
       System.out.println("Nilai harga print warna =RP. "+varTotalPrintWarna);
       return varTotalPrintWarna;
    }

    public double minuman()
    {
       varTotalMinuman = (varMinuman*3000);
       System.out.println("Nilai harga minuman =RP. "+varTotalMinuman);
       return varTotalMinuman;
    }

    public double total()
    {
       varTotal = (varMinuman+varTotalBilling + varTotalKetik + varTotalMinuman + varTotalPrintHitam + varTotalPrintWarna + varTotalScan);
       System.out.println("  ");
       System.out.println("Total biaya =RP. "+varTotal);
       return varTotal;
    }
}