import java.util.Scanner;

public class Kafe04 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda Adalah Member, Dapatkan Diskon 10% Untuk Setiap Pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat Anda Mendapat Diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat Anda Mendapat Diskon 30%");
        } else {
            System.out.println("Kode Invalid");
        }

        System.out.println("====== MENU RESTO KAFE ======");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=============================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equals("DISKON50")) {
            hargaTotal -= hargaTotal * 50 / 100;
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal -= hargaTotal * 30 / 100;
        } else {

        }
        return hargaTotal;
    }

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");
        // Menu("Budi", true, "DISKON30");
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;
        String pesanLagi = "Ya";

        while (pesanLagi.equalsIgnoreCase("Ya")) {
            System.out.print("\nMasukkan Nomor Menu Yang Ingin Anda Pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan Jumlah Item Yang Ingin Dipesan: ");
            int banyakItem = sc.nextInt();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, "DISKON50");
            totalKeseluruhan += totalHarga;

            System.out.print("Apakah Anda Akan Memesan Lagi? (Ya / Tidak): ");
            pesanLagi = sc.next();
            // System.out.println("Total Harga Untuk Pesanan Anda: Rp" + totalHarga);
        }

        System.out.println("\nTotal Keseluruhan Pesanan: Rp " + totalKeseluruhan);

        sc.close();
    }
}