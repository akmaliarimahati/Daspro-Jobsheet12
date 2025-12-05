import java.util.Scanner;

public class NilaiMahasiswa04 {
    public static void isianArray(int...nilaiMhs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Nilai Mahasiswa ====");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
    }
    
    public static void tampilArray(int...nilaiMhs) {
        System.out.println("\n====== Daftar Nilai Mahasiswa =====");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " : " + nilaiMhs[i]);
        }
    }
    
    public static int hitTot(int...nilaiMhs) {
        int totNilai = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            totNilai += nilaiMhs[i];
        }
        return totNilai;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlMhs;

        System.out.print("Masukkan jumlah Mahasiswa: ");
        jmlMhs = sc.nextInt();

        int nilaiMahasiswa[] = new int[jmlMhs];
        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);

        int total = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal Nilai Seluruh Mahasiswa: " + total);
    }
    
}
