import java.util.*;

public class SwitchCase {

    // switch case

    public static void main(String[] args){

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("panggil nama: ");
        input = inputUser.next();

        // ekspresinya berupa satuan (int,long,byte,short), String, atau enum
        switch(input){
            case "toti":
                System.out.println("saya toti dan hadir Bos!!!");
                break;
            case "bernhard":
                System.out.println("saya bernhard dan hadir Bos!!!!");
                break;
            case "methodius":
                System.out.println("saya methodius dan hadir Bos!!!!");
                break;
            default:
                System.out.println(input + " tidak hadir Bos!!!");
        }

        System.out.println("selesai program");

    }

}