import java.util.Scanner;

public class Kubus04 {

    public static int HitungVolumeKubus(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public static int HitungLuasPermukaanKubus(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sisiKubus, volumeKubus, luasPermukaan;

        System.out.println("==== Hitung Volume Dan Luas Permukaan Kubus ===");
        System.out.print("Masukkan Panjang Sisi Kubus: ");
        sisiKubus = sc.nextInt();

        volumeKubus = HitungVolumeKubus(sisiKubus);
        System.out.println("\nVolume Kubus: " + volumeKubus);
        luasPermukaan = HitungLuasPermukaanKubus(sisiKubus);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);

        sc.close();
    }
}
