public class PengunjunKafe04 {
    public static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung: ");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
        // for (int i = 0; i < namaPengunjung.length; i++) {
        //     System.out.println("- " + namaPengunjung[i]);
        // }
    }

    public static void main(String[] args) {
        daftarPengunjung();
        // daftarPengunjung("Ali", "Budi", "Citra");
    }

}
