public class bukuMain06 {
    
    public static void main(String[] args) {

        buku06 bk1 = new buku06();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denada Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        buku06 bk2 = new buku06("Self Reward", "Mahendra Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        buku06 bukuDeanissa = new buku06("Bumi", "Tere Liye", 150, 40, 55000);
        bukuDeanissa.terjual(9);
        bukuDeanissa.tampilInformasi();
    }
}

