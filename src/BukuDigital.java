public class BukuDigital extends Buku {
    private double ukuranMB;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        super(judul, penulis, harga);  //java: constructor Buku in class Buku cannot be applied to given types;
        //  required: java.lang.String,java.lang.String,int
        //  found:    no arguments
        //reason: actual and formal argument lists differ in length
        this.ukuranMB = ukuranMB;
    }

    // diskon 20%: kalikan 80 dulu, baru bagi 100 (bukan harga * (80 / 100))
    @Override
    public int hargaAkhir() {
        return super.hargaAkhir() * 80 / 100;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("  Ukuran      : " + ukuranMB + " MB");
        System.out.println("  Harga akhir : " + formatRupiah(hargaAkhir()) + " (diskon 20%)");
    }
}