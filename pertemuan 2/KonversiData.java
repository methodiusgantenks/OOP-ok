public class KonversiData {

    public static void main(String[] args) {

        // program untuk konversi data

        int nilaiInt = 100; //32-bit
        System.out.println("nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        // Memperkecil rentang ke tipe data yang lebih kecil
        // kalau konversi ke nilainya lebih kecil dari byte maka nilai akan aneh
        byte nilaiByte = (byte)/*casting data dari besar kekecil*/ nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        // casting pembagian
        int a = 9;
        float b = 3;

        float c = a/b;

        System.out.printf("%d / %f = %f\n",a,b,c);

        int x = 9;
        int y = 3;

        float z = (float) /*casting*/ x / y;
        System.out.printf("%d / %d = %f \n",x,y,z);

    }
}