import java.util.Scanner;
public class KafeDoWhile20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, roti, teh;
        int Hkopi = 12000, Hteh = 7000, Hroti = 20000;
        String namaPelanggan;
        do{
            System.out.print("Masukkan nama pelanggan (ketik 'Batal' untuk keluar) : ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Masukkan Jumlah Kopi : ");
            kopi = sc.nextInt();
            System.out.print("Masukkan Jumlah Teh : ");
            teh = sc.nextInt();
            System.out.print("Masukkan Jumlah Roti : ");
            roti = sc.nextInt();

            int totalHarga = (kopi*Hkopi)+(teh*Hteh)+(roti*Hroti);
            System.out.println("Total harga yang harus dibayar adalah : " + totalHarga);
            sc.nextLine();
        }while (true);
        System.out.println("Semua transaksi selesai.");
    }
}
