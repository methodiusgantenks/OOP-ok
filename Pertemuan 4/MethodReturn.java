public class MethodReturn
 {
    static double nilaiTugas(int x)
    {double nilai = 0.2 * x;
        return nilai;
       
        
    }

    public static void main (String[] args)
    {   //cara1
        System.out.println("Nilai Tugas = " + nilaiTugas(80));

        //cara2
        double nilai;
        nilai = nilaiTugas(80);
        System.out.println("Nilai Tugas = " + nilai);

        if  (nilaiTugas(80)>10){
            System.out.println("elu lulus brok");
        }

    }
}