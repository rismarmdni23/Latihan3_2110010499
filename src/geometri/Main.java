
package geometri;

public class Main {
    public static void main(String[] args) {
        double radiusLingkaran = 9.9;
        Lingkaran lingkaran = new Lingkaran(radiusLingkaran);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        double panjangPersegiPanjang = 9.9;
        double lebarPersegiPanjang = 9.9;
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
    }
}     