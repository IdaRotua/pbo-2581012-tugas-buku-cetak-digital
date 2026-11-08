public class TokoBuku {
    public static void main(String[] args) {

        Buku[] keranjang = {
         new BukuCetak("Pemrograman Java", "John Doe", 120000, 750),
            new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400),
        new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5)
        };

        System.out.println("=============== KERANJANG ===============");
        int total = 0;
        for (Buku b : keranjang) {
            b.tampilkanInfo();
            total += b.hargaAkhir();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total bayar   : " + Buku.formatRupiah(total));
    }
}