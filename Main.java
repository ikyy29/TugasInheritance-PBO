public class Main {
    public static void main(String[] args) {

        System.out.println("--- BujurSangkar ---");
        BujurSangkar bs = new BujurSangkar(5.0, "Hijau"); 
        bs.printInfo(); 

        System.out.println("\n--- Lingkaran ---");
        Lingkaran l = new Lingkaran(7.0, "Biru"); 
        l.printInfo();


        System.out.println("\n--- Silinder ---");
        Silinder s = new Silinder(10.0, 7.0, "Kuning");
        s.printInfo();
    }
}