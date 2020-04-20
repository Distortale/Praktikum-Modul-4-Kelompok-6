public class Modul4_Kelompok6_Java {
    // non-return type dengan parameter
    public static void main(String[] args) {        
        Pendefinisi objek = new Pendefinisi();
 
        objek.greeting();
        objek.kelompok("Kelompok 6");
        String print = objek.kenalan("Kanya", "Membaca");
        System.out.println(print);
    }
}