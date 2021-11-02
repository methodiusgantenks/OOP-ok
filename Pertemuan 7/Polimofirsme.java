class Hewan{
    public void suaraHewan(){
        System.out.println("Hewan Bersuara");     
    }
}

class Ayam extends Hewan {
    public void suaraHewan(){
        System.out.println("Ayam bersuara: kukuruyuk");

    }
}

class Kucing extends Hewan {
    public void suaraHewan(){
        System.out.println("Kucing bersuara: Meow");
        
    }
}

class Polimofirsme{
    public static void main(String[]args){
        Hewan hewanku = new Hewan();
        Hewan kucingku = new Kucing();
        Hewan ayamku = new Ayam();

        hewanku.suaraHewan();
        kucingku.suaraHewan();
        ayamku.suaraHewan();
    }
}