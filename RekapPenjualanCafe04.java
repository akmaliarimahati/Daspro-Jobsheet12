import java.util.Scanner;

public class RekapPenjualanCafe04 {
    
    static Scanner sc = new Scanner(System.in);
    public static void inputPenjualan(String[] menu, int[][] penjualan) {
    System.out.println("==== List Penjualan Cafe ====");
    sc.nextLine();
    for (int i = 0; i < menu.length; i++) {
        System.out.print("Menu ke-" + (i+1) + ": ");
        menu[i] = sc.nextLine();
    }
    // static String[] menu = { "Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan" };
    // static int[][] penjualan = new int[5][7];

        // Scanner sc = new Scanner(System.in);

        System.out.println("==== Input Data Penjualan Menu Kafe ====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("\nInput Data Penjualan Untuk Menu: " + menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                penjualan[i][j] = sc.nextInt();
            }
        }

    }

    public static void tampilPenjualan(String[] menu, int[][] penjualan) {
        System.out.println("\n==== Penjualan Menu Kafe ====");
        System.out.printf("%-15s", "Menu");
        for (int h = 0; h < penjualan[0].length; h++) {
            System.out.print("H" + (h + 1) + "\t");
        }

        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void penjualanTertinggi(String[] menu, int[][] penjualan) {
        int tinggi = 0;
        String menuTinggi = null;

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > tinggi) {
                tinggi = total;
                menuTinggi = menu[i];
            }
        }

        System.out.println("\n==== Menu Penjualan Tertinggi ====");
        System.out.println("Menu            : " + menuTinggi);
        System.out.println("Total Penjualan : " + tinggi);

    }

    public static void rataPenjualan(String[] menu, int[][] penjualan) {
        System.out.println("\n==== Rata - Rata Penjualan Setiap Menu ====");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rata = total / penjualan[i].length;
            System.out.println(menu[i] + " : " + String.format("%.2f", rata));
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan Jumlah Hari: ");
        int jumlahHari = sc.nextInt();
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        String [] menu = new String[jumlahMenu];
        int [][] penjualan = new int[jumlahMenu][jumlahHari];

        inputPenjualan(menu, penjualan);
        tampilPenjualan(menu, penjualan);
        penjualanTertinggi(menu, penjualan);
        rataPenjualan(menu, penjualan);
    }

}
