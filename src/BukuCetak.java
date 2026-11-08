public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    // Rp5.000 per 500 gram, sisa gram dibulatkan ke atas
    public int hitungOngkir() {
        return (beratGram + 499) / 500 * 5000;
    }

    @Override
    public int hargaAkhir() {
        return super.hargaAkhir() + hitungOngkir();
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("  Berat       : " + beratGram + " gram");
        System.out.println("  Ongkir      : " + formatRupiah(hitungOngkir()));
        System.out.println("  Harga akhir : " + formatRupiah(hargaAkhir()));
    }
}