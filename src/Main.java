public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        Segitiga segitiga = new Segitiga();
        Persegi persegi = new Persegi();

        // Lingkaran
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling() + "\n");

        // Segitiga
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling() + "\n");

        // Persegi
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling() + "\n");
    }
}