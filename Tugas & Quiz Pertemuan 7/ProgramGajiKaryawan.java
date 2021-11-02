
import java.util.Scanner;
public class ProgramGajiKaryawan {
    public static void main(String[] args) {
            String nama;
            int jumlah, golongan, jamkerja, jamlembur, gajipokok, gajilembur, tunjanganpengabdian;
            double pajakgajipokok, pajaklembur, totalpajak,gajibersih;

            System.out.println("Program Gaji Karyawan");
            System.out.println("                        ");
            Scanner input = new Scanner(System.in);
            System.out.print("Nama : ");
            nama=input.next();
            System.out.print("Golongan : ");
            golongan=input.nextInt();
            System.out.print("Jam Kerja : ");
            jamkerja=input.nextInt();

            switch(golongan){
                case 1 : 
                        gajipokok=1486500;
                        tunjanganpengabdian=250000;
                        break;
                case 2 :
                        gajipokok=1926000;
                        tunjanganpengabdian=300000;
                        break;
                case 3 :
                        gajipokok=2456700;
                        tunjanganpengabdian=350000;
                        break;
                case 4 :
                        gajipokok=2899500;
                        tunjanganpengabdian=400000;
                        break;
                default :
                        gajipokok=0;
                        tunjanganpengabdian=0;
            }

            if (jamkerja>173){
                jamlembur=jamkerja-173;	
            }else{
                 jamlembur=0;
            }


            gajilembur=jamlembur*20000;
            pajakgajipokok=0.05*gajipokok;
            pajaklembur=0.05*gajilembur;
            totalpajak=pajakgajipokok+pajaklembur;
            gajibersih=((gajipokok+tunjanganpengabdian+gajilembur)-totalpajak);

            System.out.println("Nama                 : "+nama);
            System.out.println("Gaji Pokok           : "+gajipokok);
            System.out.println("Gaji Lembur          : "+gajilembur);
            System.out.println("Pajak Gaji Pokok     : "+pajakgajipokok);
            System.out.println("Pajak Lembur         : "+pajaklembur);
            System.out.println("Total Pajak          : "+totalpajak);
            System.out.println("Tunjangan Pengabdian : "+tunjanganpengabdian);
            System.out.println("Gaji Diterima        : "+gajibersih);
  }  
}